package com.ohgiraffers.common;

public class DepartmentDTO {
    private String depId;
    private String depTitle;
    private String locationId;

    public DepartmentDTO() {
    }

    public DepartmentDTO(String depId, String depTitle, String locationId) {
        this.depId = depId;
        this.depTitle = depTitle;
        this.locationId = locationId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepTitle() {
        return depTitle;
    }

    public void setDepTitle(String depTitle) {
        this.depTitle = depTitle;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "depId='" + depId + '\'' +
                ", depTitle='" + depTitle + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}