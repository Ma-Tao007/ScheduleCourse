package com.system.po;

public class CourseClass {
    private Integer id;

    private String classname;

    private String courseids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getCourseids() {
        return courseids;
    }

    public void setCourseids(String courseids) {
        this.courseids = courseids;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", classname=").append(classname);
        sb.append(", courseids=").append(courseids);
        sb.append("]");
        return sb.toString();
    }
}