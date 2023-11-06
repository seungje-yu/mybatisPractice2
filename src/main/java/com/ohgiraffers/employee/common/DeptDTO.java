package com.ohgiraffers.employee.common;

public class DeptDTO {
    String deptId;
    String deptTitle;

    @Override
    public String toString() {
        return "DeptDTO{" +
                "deptId='" + deptId + '\'' +
                ", deptTitle='" + deptTitle + '\'' +
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

    public DeptDTO(String deptId, String deptTitle) {
        this.deptId = deptId;
        this.deptTitle = deptTitle;
    }

    public DeptDTO() {
    }
}
