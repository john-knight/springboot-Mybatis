package cjl.zfend.entity;
public class User {
    private String name;
    private Integer age;
    private String password;
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
