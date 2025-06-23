package com.doubleC.hellowc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // 直接写在这里，不建 controller 文件夹
public class hellowcApplication {
    //测试一下分支 + 回退 + 合并功能
    public static void main(String[] args) {
        SpringApplication.run(hellowcApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "你好，二极管！";
    }
}
