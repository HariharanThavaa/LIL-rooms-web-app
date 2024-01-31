package com.maniam.linkedIn.learning.roomwebapp.controllers;

import com.maniam.linkedIn.learning.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staffs")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaffs(Model model) {
        model.addAttribute("staffs", staffService.getAllStaff());
        return "staffs";
    }
}
