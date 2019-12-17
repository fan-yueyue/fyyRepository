package com.mr.controller;


import com.mr.entity.ProductVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@Api(value="/product",tags = "产品测试类")
@RestController
@RequestMapping("product")
public class TestController {

    @ApiOperation(value="test",notes = "测试产品类里的测试方法",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",dataType = "String",name="id",value="查询字符串id",required = true),
            @ApiImplicitParam(paramType = "query",dataType = "com.mr.entity.ProductVO",name="productVO",value="产品对象")
    })
    @ApiResponses({
            @ApiResponse(code=200,message = "操作成功",response = Map.class),
            @ApiResponse(code=500,message = "系统内部报错")
    })
    @RequestMapping("/test")
   public Map<String,Object> test(String id, ProductVO productVO){
       Map<String,Object> mapa=new HashMap<String,Object>();
        mapa.put("key",id);
        mapa.put("value",productVO);




       return mapa;
   }

}
