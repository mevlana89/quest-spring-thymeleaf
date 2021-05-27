package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(Model model, @RequestParam(required=false, defaultValue="0") int number,
                         @RequestParam(required=false, defaultValue="John Smith") String name) {

        // doctor = new Doctor(number,name);
        System.out.println("CONTROLLER");
        model.addAttribute("doctorname", name);
        model.addAttribute("doctornumber", number);
        return "doctor";
    }
}
