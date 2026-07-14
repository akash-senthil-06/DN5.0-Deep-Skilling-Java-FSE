package com.springrest.controller;
import com.springrest.model.Department;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private List<Department> departments = new ArrayList<>(Arrays.asList(
            new Department(1, "HR")
    ));
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDepartment(@PathVariable("id") int id) {
        boolean removed = departments.removeIf(d -> d.getId() == id);
        if (!removed) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Department not found");
        }
    }
}
