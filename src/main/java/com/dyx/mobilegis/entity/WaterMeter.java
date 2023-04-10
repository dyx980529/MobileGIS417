package com.dyx.mobilegis.entity;

import java.io.Serializable;

public class WaterMeter implements Serializable {
    private Integer gidWatermeter;
    private String idWatermeter;
    private String watermeterNum;
    private String typeWatermeter;
    private String caliberWatermeter;
    private String fronValve;
    private String rearValve;
    private String builderValve;
    private String completionDateWatermeter;

    public Integer getGidWatermeter() {
        return gidWatermeter;
    }

    public void setGidWatermeter(Integer gidWatermeter) {
        this.gidWatermeter = gidWatermeter;
    }

    public String getIdWatermeter() {
        return idWatermeter;
    }

    public void setIdWatermeter(String idWatermeter) {
        this.idWatermeter = idWatermeter;
    }

    public String getWatermeterNum() {
        return watermeterNum;
    }

    public void setWatermeterNum(String watermeterNum) {
        this.watermeterNum = watermeterNum;
    }

    public String getTypeWatermeter() {
        return typeWatermeter;
    }

    public void setTypeWatermeter(String typeWatermeter) {
        this.typeWatermeter = typeWatermeter;
    }

    public String getCaliberWatermeter() {
        return caliberWatermeter;
    }

    public void setCaliberWatermeter(String caliberWatermeter) {
        this.caliberWatermeter = caliberWatermeter;
    }

    public String getFronValve() {
        return fronValve;
    }

    public void setFronValve(String fronValve) {
        this.fronValve = fronValve;
    }

    public String getRearValve() {
        return rearValve;
    }

    public void setRearValve(String rearValve) {
        this.rearValve = rearValve;
    }

    public String getBuilderValve() {
        return builderValve;
    }

    public void setBuilderValve(String builderValve) {
        this.builderValve = builderValve;
    }

    public String getCompletionDateWatermeter() {
        return completionDateWatermeter;
    }

    public void setCompletionDateWatermeter(String completionDateWatermeter) {
        this.completionDateWatermeter = completionDateWatermeter;
    }
}
