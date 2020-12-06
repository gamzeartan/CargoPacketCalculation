package com.example.calculation;

// importing Scanner class to get input from user
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// importing log4j libraries
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;




@SpringBootApplication
public class CalculationApplication {


    static Scanner scn = new Scanner(System.in);
    static boolean var = true;


    //using the getLogger method
    private static Logger log = LogManager.getLogger(CalculationApplication.class);


    public static void main(String[] args)
    {

        SpringApplication.run(CalculationApplication.class, args);


        while(var)
        {

            System.out.println("Yapmak istediğiniz işlemi seçiniz..." +
                    "\n1.Kargo Paketi Hesapla" +
                    "\n2.Çıkış.");

            int answer = scn.nextInt(); //getting a selection from the user
            log.info("Kulllanıcı işlem seçimi yaptı(1.Hesaplama,2.Çıkış): "+ answer);


            switch(answer)
            {

                case 1: // for calculate the cargo package

                    System.out.println("7 kg'lık sabunların adedi: ");
                    int sevenKgSoap = scn.nextInt(); //input data from the user

                    System.out.println("2 kg'lık sabunların adedi: ");
                    int twoKgSoap = scn.nextInt(); //input data from the user

                    System.out.println("İstenilen paket ağırlığı: ");
                    int weight = scn.nextInt(); //input data from the user

                    //prepareCargoPacket method from the CargoPacket class and sending parameters
                    CargoPacket cp = new CargoPacket();
                    cp.prepareCargoPacket(sevenKgSoap,twoKgSoap,weight);
                    break;

                case 2: //for stop the run
                    log.info("Çıkış");
                    System.exit(0);
                    break;


            }

        }

    }

}
