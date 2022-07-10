package com.xy.spring5.bean;


/**
 * 员工类  和 部门类是一对多的关系
 */
public class Emp {
    private String ename;
    private String gender;

    //员工属于某一部门，使用对象的形式进行表示
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(ename + "::" + gender + "::" + dept);
    }
    //生成dept的getter方法
    public Dept getDept() {
        return dept;
    }
}
