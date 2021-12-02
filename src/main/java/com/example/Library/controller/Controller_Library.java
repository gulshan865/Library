package com.example.Library.controller;

import com.example.Library.model.Model_Library;
import com.example.Library.service.Service_Library;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Controller_Library {

    @Autowired
    private Service_Library service;

    @GetMapping("/")
    public String Home(Model model){

        List<Model_Library> b = service.get1();
        model.addAttribute("b",b);
        return "index";
    }

    @GetMapping("addbook")
    public String addbook(){
        return "addbook";
    }

    @PostMapping("/register")
    public String submit(@ModelAttribute Model_Library pustakalya, HttpSession session){
        System.out.println(pustakalya);
        service.add(pustakalya);
        session.setAttribute( "message","Book submitted successfully");
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        Model_Library library1 = service.getbyid(id);
        model.addAttribute("Book",library1);
        return "edit";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id,HttpSession session){
        service.delete(id);
        session.setAttribute("message","book removed successfully");
        return "redirect:/";
    }
}
