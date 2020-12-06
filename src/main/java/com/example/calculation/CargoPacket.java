package com.example.calculation;

// importing log4j libraries
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class CargoPacket
{
    private static Logger log = LogManager.getLogger(CalculationApplication.class);

    public int prepareCargoPacket(int sevenKgSoapAmount, int twoKgSoapAmount, int weightOfPacket) {

        log.info("7 kg'lık sabun adedi:" + sevenKgSoapAmount);
        log.info("2 kg'lık sabun adedi:" + twoKgSoapAmount);
        log.info("İstenen paket ağırlığı" + weightOfPacket);



        //calculation of the total amount of soap found
        int totalAmountOfSoap = ((sevenKgSoapAmount * 7) + (twoKgSoapAmount * 2));
        log.info("Mevcut sabun miktarı:" + totalAmountOfSoap + "kg");


        if (totalAmountOfSoap < weightOfPacket) //comparison of package weight with existing soaps
        {

            System.out.println("Maalesef. Elimizde yeterli miktarda sabun yok.");
            log.info("İstenenden az miktarda sabun var.");
            return -1;
        }

        //package calculation stage if there is enough soap
        else {


            int leftoverFromDivision = (weightOfPacket % 7); //leftover from division with 7

            int count;

            //2 kg package is not available if the only number remaining from the division
            if (leftoverFromDivision % 2 == 1) {
                System.out.println("Maalesef. İstenilen miktara 7 kg'lık ve 2 kg'lık paketlerle ulaşılamıyor.");
                log.info("İstenilen miktara 7 kg'lık ve 2 kg'lık paketler ile ulaşılamıyor. "
                        + weightOfPacket + "kg");
                return -1;
            }


             else {

                //calculation of the number of packages of 2 kg according to leftover the division process
                for (count = 0; 2 < leftoverFromDivision; count++) {

                    leftoverFromDivision = leftoverFromDivision - 2;
                }

                int requiredAmountOfTwoKgSoap = (count + 1); //Package quantity of at least 2 kg
                log.info("Kullanılacak en az 2 kg'lık paket sayısı: " + requiredAmountOfTwoKgSoap);
                System.out.println("Kullanılacak 2 kilogramlık sabun sayısı:" + requiredAmountOfTwoKgSoap);

                return requiredAmountOfTwoKgSoap;

            }

        }
    }

}