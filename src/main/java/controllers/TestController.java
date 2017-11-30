package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mykolacherviatsov on 30/11/2017.
 */
@EnableAutoConfiguration
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public Map<String, String> test(){
        Map<String, String> result = new HashMap<>();
        result.put("val1", "test1");
        result.put("val2", "test2");
        result.put("val3", "test2");
        result.put("val4", "test2");
        result.put("val5", "test2");
        result.put("val5", "test2");
        result.put("val6", "test2");
        result.put("val7", "test2");
        return result;
    }


    public static void main(String[] args) {
        SpringApplication.run(TestController.class, args);
    }
}
