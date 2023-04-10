package com.dyx.mobilegis.entity;


import java.io.Serializable;

public class Valve implements Serializable {
    private Integer gidValve;
    private String idValve;
    private String typeValve;
    private String diameterValve;
    private Double kbButtonNum;
    private String kgState;
    private String zfButton;
    private String enterlineNum;
    private String outlineNum;
    private String builderValve;
    private String completionDateValve;

    public Integer getGidValve() {
        return gidValve;
    }

    public void setGidValve(Integer gidValve) {
        this.gidValve = gidValve;
    }

    public String getIdValve() {
        return idValve;
    }

    public void setIdValve(String idValve) {
        this.idValve = idValve;
    }

    public String getTypeValve() {
        return typeValve;
    }

    public void setTypeValve(String typeValve) {
        this.typeValve = typeValve;
    }

    public String getDiameterValve() {
        return diameterValve;
    }

    public void setDiameterValve(String diameterValve) {
        this.diameterValve = diameterValve;
    }

    public Double getKbButtonNum() {
        return kbButtonNum;
    }

    public void setKbButtonNum(Double kbButtonNum) {
        this.kbButtonNum = kbButtonNum;
    }

    public String getKgState() {
        return kgState;
    }

    public void setKgState(String kgState) {
        this.kgState = kgState;
    }

    public String getZfButton() {
        return zfButton;
    }

    public void setZfButton(String zfButton) {
        this.zfButton = zfButton;
    }

    public String getEnterlineNum() {
        return enterlineNum;
    }

    public void setEnterlineNum(String enterlineNum) {
        this.enterlineNum = enterlineNum;
    }

    public String getOutlineNum() {
        return outlineNum;
    }

    public void setOutlineNum(String outlineNum) {
        this.outlineNum = outlineNum;
    }

    public String getBuilderValve() {
        return builderValve;
    }

    public void setBuilderValve(String builderValve) {
        this.builderValve = builderValve;
    }

    public String getCompletionDateValve() {
        return completionDateValve;
    }

    public void setCompletionDateValve(String completionDateValve) {
        this.completionDateValve = completionDateValve;
    }
}
