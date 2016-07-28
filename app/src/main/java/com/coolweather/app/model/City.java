package com.coolweather.app.model;

/**
 * Created by Administrator on 2016/7/27.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceID;

    public int getId(){ return id; }
    public String getCityName(){ return cityName; }
    public String getCityCode(){ return cityCode; }
    public int getProvinceID(){ return  provinceID; }

    public void setId(int id){ this.id=id; }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }
}
