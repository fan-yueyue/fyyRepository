package com.mr.mongodb;

import com.mr.entity.StudentVO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Api(value="mongoDemo",tags = "这个是mongoDemo类")
@RestController
@RequestMapping("mongoDemo")
public class MongoDemo {

    @Autowired
    private MongodbUtils mongodbUtils;

    @ApiOperation(value="test",notes = "这个是方法",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",dataType = "String",name="students",value="查询字段的key",required = true),
            @ApiImplicitParam(paramType = "query",dataType = "String",name="s3",value="java.util.List")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功",response = Map.class),
            @ApiResponse(code = 500,message = "报错")
    })



    @GetMapping("test")
    public Map<String,Object> test(String id, StudentVO studentVO){
        StudentVO s1 = new StudentVO(10,"1111","beijing");
        StudentVO s2 = new StudentVO(11,"2222","shanghai");
        StudentVO s3 = new StudentVO(12,"3333","guangzhou");
        StudentVO s4 = new StudentVO(13,"4444","handan");

        List<StudentVO> list1 =new ArrayList<StudentVO>();
        List<StudentVO> list2 =new ArrayList<StudentVO>();
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        s3.setListStu(list1);
        mongodbUtils.saveMongo(s3,"test");

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("student",s3);
        return map;
    }

}
