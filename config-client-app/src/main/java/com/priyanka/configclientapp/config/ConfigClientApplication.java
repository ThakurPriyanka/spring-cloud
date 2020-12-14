package com.priyanka.configclientapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "some")
public class ConfigClientApplication {
    private String property;
    private final Other other = new Other();

    public void setProperty(String property) {
        this.property = property;
    }
    public String getProperty() {
        return property;
    }
    public static class Other {
        private String property;

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }
    }
    public Other getOther() {
        return other;
    }
}
