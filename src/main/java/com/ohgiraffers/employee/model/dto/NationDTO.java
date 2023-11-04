package com.ohgiraffers.employee.model.dto;

public class NationDTO {
    private String nationalCode;
    private String nationalName;

    public NationDTO() {
    }

    public NationDTO(String nationalCode, String nationalName) {
        this.nationalCode = nationalCode;
        this.nationalName = nationalName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getNationalName() {
        return nationalName;
    }

    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
    }

    @Override
    public String toString() {
        return "NationDTO{" +
                "nationalCode='" + nationalCode + '\'' +
                ", nationalName='" + nationalName + '\'' +
                '}';
    }
}
