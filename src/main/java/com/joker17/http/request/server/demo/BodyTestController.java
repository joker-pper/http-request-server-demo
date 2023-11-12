package com.joker17.http.request.server.demo;

import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

@RestController
@RequestMapping("/api/body/test")
public class BodyTestController {

    @GetMapping
    public String index() {
        System.out.println("index");
        return "index";
    }


    @PostMapping("/post")
    public Result post(@RequestBody LinkedHashMap<String, String> body) {
        return Result.ok().setData(body);
    }


    @PutMapping("/put")
    public Result put(@RequestBody LinkedHashMap<String, String> body) {
        return Result.ok().setData(body);
    }

    @PatchMapping("/patch")
    public Result patch(@RequestBody LinkedHashMap<String, String> body) {
        return Result.ok().setData(body);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody LinkedHashMap<String, String> body) {
        return Result.ok().setData(body);
    }



}
