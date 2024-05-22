package com.skt.test.maru2.controller;

import ch.qos.logback.core.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

@Slf4j
public class PageController {

    @GetMapping("/")
    public String report(Model model){
        //log.debug("Index Start!!");
        return "index";
        //resource 폴더 하위에 index.ftl 파일 return
    }

    @GetMapping("/index2")
    public String index2(Model model){
        return "index2";
    }

    @GetMapping("/index3")
    public String index3(Model model){
        return "index3";
    }

    @GetMapping("/starter")
    public String starter(Model model){
        return "starter";
    }

    @GetMapping("/gallery")
    public String gallery(Model model){
        return "gallery";
    }

    @GetMapping("/widgets")
    public String widgets(Model model){
        return "widgets";
    }
}
