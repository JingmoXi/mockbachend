package com.example.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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
    public Object statix (){
        Map data=new HashMap();
        data.put("newUser",10);
        data.put("newOrder",9);
        data.put("newManager",3);
        data.put("totalUser",790797);
        data.put("totalOrder",70982);
        data.put("totalManager",8272);
        return data;
    }

    //
    @GetMapping("/user/list")
    public Object userList (@RequestParam int page, @RequestParam int pageSize){
        Map result=new HashMap();
        List<User> users=new ArrayList<User>();
        for(int i=0;i<pageSize;i++){
            User user=new User();
            user.setId(page*pageSize+i);
            user.setName("user"+(page*pageSize+i));
            user.setArea("wuhan");
            user.setDate("2013-11-20 11:10");
            users.add(user);
        }
        result.put("data",users);
        Random random = new Random();
        result.put("total", random.nextInt(5000));
        return result;
    }


    @GetMapping("/get/all")
    public String getAll (HttpServletRequest request){
        String pas=request.getRequestURI();
        System.out.println(pas);
        return "ok";
    }

}
