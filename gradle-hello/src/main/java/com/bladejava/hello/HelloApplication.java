package com.bladejava.hello;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/5/31
 */
public class HelloApplication {

    public static void main(String[] args) {
        Blade.me().get("/", ((request, response) -> response.html("<h1>Hello Blade.</h1>"))).start(HelloApplication.class, args);
    }

}
