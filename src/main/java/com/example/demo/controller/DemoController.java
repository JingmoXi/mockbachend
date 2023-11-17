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

    @GetMapping("/data/static")
    public Object statix (@RequestBody Object obj){
        System.out.println(gson.toJson(obj));
        Map data=new HashMap();
        data.put("newUser",10);
        data.put("newOrder",9);
        data.put("newManager",3);
        data.put("totalUser",790797);
        data.put("totalOrder",70982);
        data.put("totalManager",8272);
        return data;
    }


    @GetMapping("/get/all")
    public String getAll (HttpServletRequest request){
        String pas=request.getRequestURI();
        System.out.println(pas);
        return "ok";
    }

}
