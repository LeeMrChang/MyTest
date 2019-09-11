package com.lch;

/**
 * @ClassName:User
 * @Author：Mr.lee
 * @DATE：2019/08/17
 * @TIME： 8:43
 * @Description: TODO
 */
public class User {


    private  String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
