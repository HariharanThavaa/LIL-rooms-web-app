package com.maniam.linkedIn.learning.roomwebapp.controllers;

import com.maniam.linkedIn.learning.roomwebapp.models.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staffs")
public class StaffController {

    private static final List<Staff> staffs = new ArrayList<>();

    static {
        for (int i=0; i < 10; i++) {
            staffs.add(new Staff(i,"emp " + i, "fn" + i, "ln" + i, "P"+i));
        }
    }

    @GetMapping
    public String getAllStaffs(Model model) {
        model.addAttribute("staffs", staffs);
        return "staffs";
    }
}
