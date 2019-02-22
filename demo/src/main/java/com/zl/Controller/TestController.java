package com.zl.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author
 * @Description
 * @Date
 */
@RequestMapping("/picture")
@RestController
public class TestController {

    /*@RequestMapping("/{images}")
    public String test( @PathVariable(value = "images") String images){
        System.out.println("images:"+images);
        return "images";
    }*/

    @RequestMapping("/test")
    public String test2(){
        //master
        return "test2";
    }
}
