package com.joker17.http.request.server.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/form/parameter/test")
public class FormParameterController {


    @PostMapping("/post")
    public Result post(String body) {
        return Result.ok().setData(body);
    }


    @PutMapping("/put")
    public Result put(String body) {
        return Result.ok().setData(body);
    }

    @PatchMapping("/patch")
    public Result patch(String body) {
        return Result.ok().setData(body);
    }

    @DeleteMapping("/delete")
    public Result delete(String body) {
        return Result.ok().setData(body);
    }

}
