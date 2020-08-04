package net.philip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/")
public class AppController {


    public String home(){
        System.out.println("AppController->home()");
        return "index";
    }

    @GetMapping("/test")
    public String test(){
        System.out.println("AppController->test()");
        return "courses";
    }

    @GetMapping("/view_contact")
    public String viewContact(){
        System.out.println("AppController->viewContact()");
        return "contact";
    }

    @GetMapping("/list_contacts")
    public String listContact(){
//        ContactBusiness business = new ContactBusiness();
//        List<Contact> contactList =business.getContactLst();
//
//        model.addAttribute("contact", contactList);
//
//        return "contact.html";

        System.out.println("AppController->contact()");
        return "contact";
    }
}
