package com.example.calculation;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// importing log4j libraries
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@SpringBootApplication
public class CalculationApplication {


    static Scanner scn = new Scanner(System.in);
    static boolean var = true;


    //using the getLogger method
    private static Logger log = LogManager.getLogger(CalculationApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(CalculationApplication.class, args);

        log.info("Log test.");

        while(var){

            System.out.println("Yapmak istediğiniz işlemi seçiniz..." +
                    "\n1.Kargo Paketi Hesapla" +
                    "\n2.Çıkış.");

            int answer = scn.nextInt();

            switch(answer){

                case 1:
                    System.out.println("7 kg'lık sabunların adedi: ");
                    int sevenKgSoap = scn.nextInt();
                    System.out.println("2 kg'lık sabunların adedi: ");
                    int twoKgSoap = scn.nextInt();
                    System.out.println("İstenilen paket ağırlığı: ");
                    int weight = scn.nextInt();

                    CargoPacket cp = new CargoPacket();
                    cp.prepareCargoPacket(sevenKgSoap,twoKgSoap,weight);

                    break;

                case 2:
                    System.exit(0);
                    break;


            }

        }

    }


}
