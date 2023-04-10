package com.dyx.mobilegis.entity;

import java.io.Serializable;

public class PipeLine implements Serializable {
    private Integer gidPipeline;
    private String idPipeline;
    private String diameterPipeline;
    private Double lengthPipeline;
    private String depthPipeline;
    private String materialPipeline;
    private String interfaceType;
    private String flowDirection;
    private String startPipeline;
    private String finishPipeline;
    private String altitudePipeline;
    private String designerPipeline;
    private String builderPipeline;
    private String completionDatePipeline;

    public Integer getGidPipeline() {
        return gidPipeline;
    }

    public void setGidPipeline(Integer gidPipeline) {
        this.gidPipeline = gidPipeline;
    }

    public String getIdPipeline() {
        return idPipeline;
    }

    public void setIdPipeline(String idPipeline) {
        this.idPipeline = idPipeline;
    }

    public String getDiameterPipeline() {
        return diameterPipeline;
    }

    public void setDiameterPipeline(String diameterPipeline) {
        this.diameterPipeline = diameterPipeline;
    }

    public Double getLengthPipeline() {
        return lengthPipeline;
    }

    public void setLengthPipeline(Double lengthPipeline) {
        this.lengthPipeline = lengthPipeline;
    }

    public String getDepthPipeline() {
        return depthPipeline;
    }

    public void setDepthPipeline(String depthPipeline) {
        this.depthPipeline = depthPipeline;
    }

    public String getMaterialPipeline() {
        return materialPipeline;
    }

    public void setMaterialPipeline(String materialPipeline) {
        this.materialPipeline = materialPipeline;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getFlowDirection() {
        return flowDirection;
    }

    public void setFlowDirection(String flowDirection) {
        this.flowDirection = flowDirection;
    }

    public String getStartPipeline() {
        return startPipeline;
    }

    public void setStartPipeline(String startPipeline) {
        this.startPipeline = startPipeline;
    }

    public String getFinishPipeline() {
        return finishPipeline;
    }

    public void setFinishPipeline(String finishPipeline) {
        this.finishPipeline = finishPipeline;
    }

    public String getAltitudePipeline() {
        return altitudePipeline;
    }

    public void setAltitudePipeline(String altitudePipeline) {
        this.altitudePipeline = altitudePipeline;
    }

    public String getDesignerPipeline() {
        return designerPipeline;
    }

    public void setDesignerPipeline(String designerPipeline) {
        this.designerPipeline = designerPipeline;
    }

    public String getBuilderPipeline() {
        return builderPipeline;
    }

    public void setBuilderPipeline(String builderPipeline) {
        this.builderPipeline = builderPipeline;
    }

    public String getCompletionDatePipeline() {
        return completionDatePipeline;
    }

    public void setCompletionDatePipeline(String completionDatePipeline) {
        this.completionDatePipeline = completionDatePipeline;
    }
}
