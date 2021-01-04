package com.projettransversal.api;

public enum ProjetTransversalExceptionEnum {

    TRUCK_NOT_FOUND("TRUCK_NOT_FOUND", "Aucun truck correspondant à l'id %d"),
    INCIDENT_NOT_FOUND("INCIDENT_NOT_FOUND", "Aucun incident correspondant à l'id %d");

    private final String errorCode;
    private final String errorDescripion;

    ProjetTransversalExceptionEnum(String errorCode, String errorDescripion) {
        this.errorCode = errorCode;
        this.errorDescripion = errorDescripion;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescripion() {
        return errorDescripion;
    }
}
