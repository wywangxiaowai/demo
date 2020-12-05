package com.example.demo.commit;

import java.io.Serializable;

public class School implements Serializable {

    private static final long serialVersionUID = 2536036885905448177L;

    private String scName;

    private String scInfo;

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public String getScInfo() {
        return scInfo;
    }

    public void setScInfo(String scInfo) {
        this.scInfo = scInfo;
    }

    @Override
    public String toString() {
        return "School{" +
                "scName='" + scName + '\'' +
                ", scInfo='" + scInfo + '\'' +
                '}';
    }
}
