package org.nelda.coolweather.model;

/**
 * Created by Administrator on 2015/6/28 0028.
 */
public class Province {


    private int id;
    private  String provinceName;
    private  String provinceCode;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }




}
