package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import com.cydeo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
//    @GetMapping("/register")
//    public String createEmployee(Model model){
//        model.addAttribute("employeeState", DataGenerator.createEmployeeState());
//        model.addAttribute("employee", new Employee());
//
//        return "employee/employee-register";
//    }

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/register")
public String createEmployee(Model model){
    model.addAttribute("stateList",DataGenerator.createEmployeeState());
    model.addAttribute("employee",new Employee());
    return "employee/employee-create";
}
@PostMapping("/insert")
    public String insertEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.saveEmployee(employee);
        return "redirect:/employee/list";
}
@GetMapping("/list")
    public String listEmployee(Model model){
    model.addAttribute("employeeList",employeeService.readAllEmployees());
    return "employee/employee-list";
}

}
