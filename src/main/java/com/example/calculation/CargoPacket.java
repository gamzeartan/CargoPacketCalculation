package com.example.calculation;

public class CargoPacket
{

    public int prepareCargoPacket(int sevenKgSoapAmount, int twoKgSoapAmount, int weightOfPacket) {


        int totalAmountOfSoap = ((sevenKgSoapAmount * 7) + (twoKgSoapAmount * 2));


        if (totalAmountOfSoap < weightOfPacket) {

            System.out.println("Maalesef. Elimizde yeterli miktarda sabun yok.");

            return -1;
        }
        else
            {
            int leftoverFromDivision = (weightOfPacket % 7);

            int count;


            if ( leftoverFromDivision % 2 == 1)
            {
                System.out.println("Maalesef. İstenilen miktara 7 kg ve 2 kg'lık paketlerle ulaşılamıyor.");
                return -1;
            }
            else {


                for (count = 0; 2 < leftoverFromDivision; count++) {

                    leftoverFromDivision = leftoverFromDivision - 2;
                }

                int requiredAmountOfTwoKgSoap = (count + 1);

                System.out.println("Kullanılacak 2 kilogramlık sabun sayısı:" + requiredAmountOfTwoKgSoap);

                return requiredAmountOfTwoKgSoap;

            }

        }
    }
}