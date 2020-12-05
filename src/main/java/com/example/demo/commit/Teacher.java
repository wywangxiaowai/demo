package com.example.demo.commit;

import java.io.Serializable;

public class Teacher implements Serializable {

    private static final long serialVersionUID = -3701394886414812454L;

    private String tName;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tName='" + tName + '\'' +
                '}';
    }
}
