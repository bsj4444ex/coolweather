package com.coolweather.app.model;

/**
 * Created by Administrator on 2016/7/27.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public int getId(){ return id;}
    public int getCityId() { return cityId;}
    public String getCountyCode() {return countyCode;}
    public String getCountyName() {return countyName;}

    public void setId(int id) {this.id = id;}
    public void setCountyName(String countyName) {this.countyName = countyName;}
    public void setCountyCode(String countyCode) {this.countyCode = countyCode;}
    public void setCityId(int cityId) {this.cityId = cityId;}
}
