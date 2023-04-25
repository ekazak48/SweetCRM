package ru.ekz48.own.sweetcrm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RootController {

    @GetMapping("/kek")
    public Map<Object, Object> rootConfig(){
        return Map.of("Working", "ok", "Doing", "good");
    }

    public Map<Object, Object> getRoot() {
        return null;
    }

}
