package com.projettransversal.api.DTO;

import com.projettransversal.api.Models.Ground;
import com.projettransversal.api.Models.IncidentType;

public class MQTTIncident {

    private Long id;
    private Long idTag;
    private int ground;
    private int posX;
    private int poxY;
    private int incidentType;
    private float intensity;
    private float intensityTag;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getIdTag() {
        return idTag;
    }

    public void setIdTag(Long idTag){
        this.idTag = idTag;
    }
    public float getIntensity() {
        return intensity;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public float getIntensityTag() {
        return intensityTag;
    }

    public void setIntensityTag(float intensityTag) {
        this.intensityTag = intensityTag;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return poxY;
    }

    public void setPosY(int poxY) {
        this.poxY = poxY;
    }

    public int getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground.ordinal();
    }

    public int getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(IncidentType incidentType) {
        this.incidentType = incidentType.ordinal();
    }

}
