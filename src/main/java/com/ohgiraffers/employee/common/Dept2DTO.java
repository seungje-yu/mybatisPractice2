package com.ohgiraffers.employee.common;

public class Dept2DTO {
    String deptId;
    String deptTitle;
    String locationId;

    @Override
    public String toString() {
        return "Dept2DTO{" +
                "deptId='" + deptId + '\'' +
                ", deptTitle='" + deptTitle + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Dept2DTO(String deptId, String deptTitle, String locationId) {
        this.deptId = deptId;
        this.deptTitle = deptTitle;
        this.locationId = locationId;
    }

    public Dept2DTO() {
    }
}
