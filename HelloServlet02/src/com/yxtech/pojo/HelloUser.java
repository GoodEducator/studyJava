package com.yxtech.pojo;

/**
 * Created by leslie on 10/6/16.
 */

import java.util.HashMap;
import java.util.Map;

public class HelloUser {
    private Map<String, String> helloMessage = new HashMap<>();
    public HelloUser()
    {
        helloMessage.put("John", "Hello, John");
        helloMessage.put("Smith", "Welcome Smith");
        helloMessage.put("Rose", "Hi, Rose");
    }

    public String sayHello(String username)
    {
        return helloMessage.get(username);
    }
}
