package com.joker17.http.request.server.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor(staticName = "of")
public class Result {

    private Object data;
    private String info;

    public static Result ok() {
        return Result.of().setInfo("ok");
    }

}
