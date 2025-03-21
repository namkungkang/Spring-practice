package com.example.springprac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.time.LocalDateTime;


@Controller
public class BasicController {
    @GetMapping
    String hello() {
        return "index.html";
    }
    @GetMapping("/about")
    @ResponseBody
    String hi() {
        return "요약사이트";
    }
    @GetMapping("/mypage")
    @ResponseBody
    String hh() {
        return "마이페이지이다";
    }
    @GetMapping("/date")
    String hs() {
        return LocalDateTime.now().toString();
    }
    @GetMapping("/list")
    String list(Model model) {
        model.addAttribute("name","나나나");
        return "list.html";
    }




}
