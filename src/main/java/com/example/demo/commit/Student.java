package com.example.demo.commit;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -6676228932566079503L;

    private String sName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                '}';
    }
}
