package com.ly.pojo;

public class Member {
    private String ddh;
    private String dhr;
    private String sddd;

    public Member(String ddh, String dhr, String sddd) {
        this.ddh = ddh;
        this.dhr = dhr;
        this.sddd = sddd;
    }

    public String getDdh() {
        return ddh;
    }

    public void setDdh(String ddh) {
        this.ddh = ddh;
    }

    public String getDhr() {
        return dhr;
    }

    public void setDhr(String dhr) {
        this.dhr = dhr;
    }

    public String getSddd() {
        return sddd;
    }

    public void setSddd(String sddd) {
        this.sddd = sddd;
    }

    @Override
    public String toString() {
        return "member{" +
                "ddh='" + ddh + '\'' +
                ", dhr='" + dhr + '\'' +
                ", sddd='" + sddd + '\'' +
                '}';
    }
}
