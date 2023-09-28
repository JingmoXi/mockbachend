package com.example.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
//@CrossOrigin(origins = "*")
public class DemoController {

    @Autowired
    Gson gson;


    @PostMapping("/post/all")
    public Object postAll (@RequestBody Object obj){
        System.out.println(gson.toJson(obj));
        Map data=new HashMap();
        data.put("status","ok");
        return data;
    }

    @GetMapping("/get/all")

    public String getAll (HttpServletRequest request){
        String pas=request.getRequestURI();
        System.out.println(pas);
        return "ok";
    }

}
