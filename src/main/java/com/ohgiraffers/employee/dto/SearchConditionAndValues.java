package com.ohgiraffers.employee.dto;

public class SearchConditionAndValues {
    private String condition;
    private String values;

    public SearchConditionAndValues() {
    }

    public SearchConditionAndValues(String condition) {
        this.condition = condition;
    }

    public SearchConditionAndValues(String condition, String values) {
        this.condition = condition;
        this.values = values;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
    @Override
    public String toString() {
        return "SearchConditionAndValues{" +
                "condition='" + condition + '\'' +
                ", values='" + values + '\'' +
                '}';
    }
}
