package com.xy.spring5;

/**
 * spring使用set方法完成属性注入，
 * 在创建对象的基础之上，进行属性注入
 */
public class Book {
    private String bname;
    private String bauthor;
    private String address;
    //set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bname + "::" + bauthor + "::" + address);
    }
}
