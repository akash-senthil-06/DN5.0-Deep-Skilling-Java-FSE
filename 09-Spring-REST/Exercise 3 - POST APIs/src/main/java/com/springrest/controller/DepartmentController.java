package com.springrest.controller;
import com.springrest.model.Department;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private List<Department> departments = new ArrayList<>();
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Department addDepartment(@RequestBody Department department) {
        departments.add(department);
        return department;
    }
}
