package com.priyanka.configclientapp.controller;

import com.priyanka.configclientapp.config.ConfigClientApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private ConfigClientApplication configClientApplication;

    public Controller(final ConfigClientApplication configClientApplication) {
        this.configClientApplication = configClientApplication;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(configClientApplication.getProperty());
        stringBuilder.append("|");
        stringBuilder.append(configClientApplication.getOther().getProperty());
        return stringBuilder.toString();
    }
}
