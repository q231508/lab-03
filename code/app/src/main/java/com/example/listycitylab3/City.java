package com.example.listycitylab3;

import java.io.Serial;
import java.io.*;

public class City implements Serializable {
    private static final long serialVerUID = 1L;
    private String name;
    private String province;
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }
    public String getName() {
        return name;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setName(String name) {
        this.name = name;
    }

}
