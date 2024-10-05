package JSTL_Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

        @GetMapping("/")
        public String home(Model model) {
            model.addAttribute("message", "Hello, JSTL with Jakarta in Spring Boot!");
            return "home"; // This corresponds to home.jsp in /WEB-INF/views/
        }
}
