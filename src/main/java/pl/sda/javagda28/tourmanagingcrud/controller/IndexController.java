package pl.sda.javagda28.tourmanagingcrud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {


    @GetMapping("/")
    public String viewIndexPage() {
        return "startup-page";
    }

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/dashboard")
    public String viewDashboard(){
        return "admin-dashboard";
    }
}
