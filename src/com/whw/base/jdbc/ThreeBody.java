package com.whw.base.jdbc;

public class ThreeBody {
    private int id;
    private String name;
    private int which_section;
    private  String chaech;
    private String say_what;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWhich_section() {
        return which_section;
    }

    public void setWhich_section(int which_section) {
        this.which_section = which_section;
    }

    public String getChaech() {
        return chaech;
    }

    public void setChaech(String chaech) {
        this.chaech = chaech;
    }

    public String getSay_what() {
        return say_what;
    }

    public void setSay_what(String say_what) {
        this.say_what = say_what;
    }

    @Override
    public String toString() {
        return "ThreeBody{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", which_section=" + which_section +
                ", chaech='" + chaech + '\'' +
                ", say_what='" + say_what + '\'' +
                '}';
    }
}
