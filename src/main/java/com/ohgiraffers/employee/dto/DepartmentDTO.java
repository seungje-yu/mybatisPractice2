package com.ohgiraffers.employee.dto;

public class DepartmentDTO {
    private String departmentId;
    private String departmentTitle;
    private String locationId;

    public DepartmentDTO() {
    }

    public DepartmentDTO(String departmentId, String departmentTitle, String locationId) {
        this.departmentId = departmentId;
        this.departmentTitle = departmentTitle;
        this.locationId = locationId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle;
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
                "departmentId='" + departmentId + '\'' +
                ", departmentTitle='" + departmentTitle + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
