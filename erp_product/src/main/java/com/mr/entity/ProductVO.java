package com.mr.entity;

import lombok.Data;

@Data
public class ProductVO {

    private Integer pid;
    private String pname;
    private Data pdate;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Data getPdate() {
        return pdate;
    }

    public void setPdate(Data pdate) {
        this.pdate = pdate;
    }
}
