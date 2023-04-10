package com.dyx.mobilegis.entity;

import java.io.Serializable;

public class Hydrant implements Serializable {
    private Integer gidHydrant;
    private String idHydrant;
    private String typeHydrant;
    private String completionDateHydrant;

    public Integer getGidHydrant() {
        return gidHydrant;
    }

    public void setGidHydrant(Integer gidHydrant) {
        this.gidHydrant = gidHydrant;
    }

    public String getIdHydrant() {
        return idHydrant;
    }

    public void setIdHydrant(String idHydrant) {
        this.idHydrant = idHydrant;
    }

    public String getTypeHydrant() {
        return typeHydrant;
    }

    public void setTypeHydrant(String typeHydrant) {
        this.typeHydrant = typeHydrant;
    }

    public String getCompletionDateHydrant() {
        return completionDateHydrant;
    }

    public void setCompletionDateHydrant(String completionDateHydrant) {
        this.completionDateHydrant = completionDateHydrant;
    }
}
