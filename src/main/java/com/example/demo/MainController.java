package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String testPage() {
        return "index"; // 자동으로 /WEB-INF/views/test.jsp 파일로 연결됩니다!
    }
    
}
