package com.example.spring_study;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class TestRestController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value="msg", required = false) String msg){
        return msg;
    }
    //json파일 만들기
    @GetMapping("/hello2")
    @ResponseBody
    public HashMap<String,String> hello2(@RequestParam(value="msg", required = false) String msg){
        HashMap<String, String> map = new HashMap<>();

        map.put("이름","홍길동");
        map.put("나이","30");
        map.put("국적","서울");
        
        return map;
    }
}
