package com.example.calculation;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// importing log4j libraries
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@SpringBootApplication
public class CalculationApplication {

    //Using the getLogger method
    private static Logger log = LogManager.getLogger(CalculationApplication.class);


    public static void main(String[] args) {


        SpringApplication.run(CalculationApplication.class, args);

        System.out.println("Hello World!!!");
        log.info("log test!");
    }




}
