package com.dyx.mobilegis.entity;

import java.io.Serializable;

public class Building implements Serializable {
    private Integer gidBuilding;
    private String idBuilding;
    private String buildingNum;
    private String caliberBuilding;
    private String positionBuilding;
    private String ownerBuilding;
    private String addressBuilding;
    private String propertyUnitBuilding;
    private String moreInfoBuilding;

    public Integer getGidBuilding() {
        return gidBuilding;
    }

    public void setGidBuilding(Integer gidBuilding) {
        this.gidBuilding = gidBuilding;
    }

    public String getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(String idBuilding) {
        this.idBuilding = idBuilding;
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getCaliberBuilding() {
        return caliberBuilding;
    }

    public void setCaliberBuilding(String caliberBuilding) {
        this.caliberBuilding = caliberBuilding;
    }

    public String getPositionBuilding() {
        return positionBuilding;
    }

    public void setPositionBuilding(String positionBuilding) {
        this.positionBuilding = positionBuilding;
    }

    public String getOwnerBuilding() {
        return ownerBuilding;
    }

    public void setOwnerBuilding(String ownerBuilding) {
        this.ownerBuilding = ownerBuilding;
    }

    public String getAddressBuilding() {
        return addressBuilding;
    }

    public void setAddressBuilding(String addressBuilding) {
        this.addressBuilding = addressBuilding;
    }

    public String getPropertyUnitBuilding() {
        return propertyUnitBuilding;
    }

    public void setPropertyUnitBuilding(String propertyUnitBuilding) {
        this.propertyUnitBuilding = propertyUnitBuilding;
    }

    public String getMoreInfoBuilding() {
        return moreInfoBuilding;
    }

    public void setMoreInfoBuilding(String moreInfoBuilding) {
        this.moreInfoBuilding = moreInfoBuilding;
    }
}
