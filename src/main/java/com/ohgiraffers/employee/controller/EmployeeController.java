package com.ohgiraffers.employee.controller;

import com.ohgiraffers.employee.dto.CollectionSearchDTO;
import com.ohgiraffers.employee.dto.EmpAndJobAndDpDTO;
import com.ohgiraffers.employee.dto.SearchConditionAndValues;
import com.ohgiraffers.employee.dto.SearchDTO;
import com.ohgiraffers.employee.service.EmployeeSirvice;
import com.ohgiraffers.employee.view.PrintResult;

import java.util.List;

public class EmployeeController {
    public void selectInfoByDeptTitle(SearchConditionAndValues searchConditionAndValues) {
        EmployeeSirvice employeeSirvice = new EmployeeSirvice();
        List<SearchDTO> empList = employeeSirvice.selectInfoByDeptTitle(searchConditionAndValues);

        if (empList != null ){
            PrintResult.selectInfoByDeptTitle(empList);
        }else {
            PrintResult.printErrorMessage("selectInfoByDeptTitle");
        }
    }

    public void selectAll() {
        EmployeeSirvice employeeSirvice = new EmployeeSirvice();
        List<EmpAndJobAndDpDTO> empList = employeeSirvice.selectAll();

        if (empList != null ){
            PrintResult.printempList(empList);
        }else {
            PrintResult.printErrorMessage("selectAll");
        }
    }


    public void selectInfoByIdAndName(SearchConditionAndValues searchConditionAndValues) {
        EmployeeSirvice employeeSirvice = new EmployeeSirvice();
        List<SearchDTO> empList = employeeSirvice.selectInfoByIdAndName(searchConditionAndValues);

        if (empList != null ){
            PrintResult.printselectInfoByIdAndName(empList);
        }else {
            PrintResult.printErrorMessage("selectInfoByIdAndName");
        }
    }


    public void selectInfoByJobName(SearchConditionAndValues searchConditionAndValues) {
        EmployeeSirvice employeeSirvice = new EmployeeSirvice();

        List<SearchDTO> empList = employeeSirvice.selectInfoByJobName(searchConditionAndValues);

        if (empList != null ){
            PrintResult.printselectInfoByJobName(empList);
        }else {
            PrintResult.printErrorMessage("selectInfoByJobName");
        }
    }

    public void selectManager() {

        EmployeeSirvice employeeSirvice = new EmployeeSirvice();

        List<SearchDTO> empList = employeeSirvice.selectManager();

        if (empList != null){
            PrintResult.printselectManager(empList);
        }else {
            PrintResult.printErrorMessage("selectManager");
        }
    }

    public void collectionSearch() {

        EmployeeSirvice employeeSirvice = new EmployeeSirvice();

        List<CollectionSearchDTO> empList = employeeSirvice.collectionSearch();

        if (empList != null){
            PrintResult.printCollectionSearch(empList);
        }else {
            PrintResult.printErrorMessage("collectionSearch");
        }
    }
}

