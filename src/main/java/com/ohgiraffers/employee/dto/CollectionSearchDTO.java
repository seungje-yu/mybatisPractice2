package com.ohgiraffers.employee.dto;

import java.util.List;

public class CollectionSearchDTO {
    private String departmentId;
    private String departmentTitle;
    private String locationId;
    private EmployeeDTO empList;

    public CollectionSearchDTO() {
    }

    public CollectionSearchDTO(String departmentId, String departmentTitle, String locationId, EmployeeDTO empList) {
        this.departmentId = departmentId;
        this.departmentTitle = departmentTitle;
        this.locationId = locationId;
        this.empList = empList;
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

    public EmployeeDTO getEmpList() {
        return empList;
    }

    public void setEmpList(EmployeeDTO empList) {
        this.empList = empList;
    }
}
