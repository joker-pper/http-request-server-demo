package com.joker17.http.request.server.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/file/and/form/parameter/test")
public class FileAndFormParameterController {


    @PostMapping("/post")
    public Result post(@RequestParam("file") MultipartFile file, String body) {
        return Result.of().setInfo(file.getOriginalFilename()).setData(body);
    }


    @PutMapping("/put")
    public Result put(@RequestParam("file") MultipartFile file, String body) {
        return Result.of().setInfo(file.getOriginalFilename()).setData(body);
    }

    @PatchMapping("/patch")
    public Result patch(@RequestParam("file") MultipartFile file, String body) {
        return Result.of().setInfo(file.getOriginalFilename()).setData(body);
    }


}
