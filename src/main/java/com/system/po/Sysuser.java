package com.system.po;

public class Sysuser {
    private Integer id;

    private String username;

    private String persname;

    private String sex;

    private String phone;

    private String classname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPersname() {
        return persname;
    }

    public void setPersname(String persname) {
        this.persname = persname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", persname=").append(persname);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", classname=").append(classname);
        sb.append("]");
        return sb.toString();
    }
}