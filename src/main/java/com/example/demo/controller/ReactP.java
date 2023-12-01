package com.example.demo.controller;

import com.example.demo.domains.UserMsg;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ReactP {

    @GetMapping("/firstpage/suamry")
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

    @GetMapping("/firstpage/taskinfo")
    public Object taskinfo (){
        Map data=new HashMap();
        List<String> red=new ArrayList<>();
        red.add("联调接口");
        red.add("功能验收");
        List<String> blue=new ArrayList<>();
        blue.add("新版本迭代会");
        blue.add("完成网站设计初版");
        List<String> green=new ArrayList<>();
        green.add("登录功能设计");
        green.add("权限验证");
        green.add("页面排版");
        data.put("red",red);
        data.put("blue",blue);
        data.put("green",green);
        //
        return data;
    }
    @GetMapping("/firstpage/msgs")
    public Object msgs (){

        List red=new ArrayList<>();
        //
        UserMsg u1=new UserMsg("张三","你好带哦好的你好带哦好的");
        UserMsg u2=new UserMsg("李四","你好带哦好的你好带哦好的");
        UserMsg u3=new UserMsg("王五","你好带哦好的你好带哦好的");
        UserMsg u4=new UserMsg("狗蛋","你好带哦好的你好带哦好的");
        red.add(u1);
        red.add(u2);
        red.add(u3);
        red.add(u4);
        return red;
    }


}
