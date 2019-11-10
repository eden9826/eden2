package com.eden.domain;

import java.util.Date;

public class User {
    private Integer id;
    private String address;
    private String username;
    private String esx;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", esx='" + esx + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
