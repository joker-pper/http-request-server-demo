package com.joker17.http.request.server.demo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/body/test")
public class BodyTestController {

    @GetMapping
    public String index() {
        System.out.println("index");
        return "index";
    }


    @PostMapping("/post")
    public Result post(@RequestBody JSONObject body) {
        return Result.ok().setData(body);
    }


    @PutMapping("/put")
    public Result put(@RequestBody JSONObject body) {
        return Result.ok().setData(body);
    }

    @PatchMapping("/patch")
    public Result patch(@RequestBody JSONObject body) {
        return Result.ok().setData(body);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody JSONObject body) {
        return Result.ok().setData(body);
    }



}
