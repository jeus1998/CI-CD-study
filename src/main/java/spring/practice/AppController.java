package spring.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String index(){
        return "Hello Github Actions with Docker & ECR";
    }
}
