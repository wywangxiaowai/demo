package com.example.demo.commit;

import java.io.Serializable;

public class Family implements Serializable {

    private static final long serialVersionUID = -6806646503592839938L;

    private String fName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "Family{" +
                "fName='" + fName + '\'' +
                '}';
    }
}
