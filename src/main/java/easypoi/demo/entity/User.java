package easypoi.demo.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

/**
 * Author: hjw
 * Data: 2018/4/18 10:02
 * Description: user表的实体类
 */
public class User {
    private Integer id;

    @Excel(name = "姓名", orderNum = "0")
    private String name;

    @Excel(name = "年龄", orderNum = "1")
    private Integer age;

    @Excel(name = "性别", replace = {"男_1","女_0"}, orderNum = "2")
    private Boolean sex;

    @Excel(name = "出生日期", exportFormat = "yyyy-MM-dd", orderNum = "3")
    private Date birthday;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, Integer age, Boolean sex, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }
}