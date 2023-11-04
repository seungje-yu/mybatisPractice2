package com.ohgiraffers.employee.model.dto;

public class LocationDTO {
    private String localCode;
    private String nationalCode;
    private String localName;

    public LocationDTO() {
    }

    public LocationDTO(String localCode, String nationalCode, String localName) {
        this.localCode = localCode;
        this.nationalCode = nationalCode;
        this.localName = localName;
    }

    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    @Override
    public String toString() {
        return "LocationDTO{" +
                "localCode='" + localCode + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", localName='" + localName + '\'' +
                '}';
    }
}
