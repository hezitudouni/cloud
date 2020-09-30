package com.hbo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class CloudApplication {

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        SpringApplication.run(CloudApplication.class, args);
    }

}
