package org.example;

public class RomanNumerals {

    public static String intToRoman(int Zahl){
        StringBuilder output = new StringBuilder();
        if(Zahl == 0)
        {
            return "";
        }

        int anzahlEiner = Zahl % 10;
        int anzahlZehner = (Zahl % 100)/10;
        int anzahlHunderter= (Zahl % 1000)/100;

        if (anzahlHunderter >=1){
            output.append("C");
        }
        if (anzahlZehner == 9){
            output.append("XC");
        }

        if (anzahlZehner >4 && anzahlZehner<9){
            output.append("L");
            for (int i =0; i<anzahlZehner-5; i++) {
                output.append("X");
            }
        }
        if (anzahlZehner == 4){
            output.append("XL");
        }
        if (anzahlZehner >=1 && anzahlZehner<4){
            for (int i = 1; i<=anzahlZehner; i++){
                output.append("X");
            }
        }
        if(anzahlEiner == 9)
        {
            output.append("IX");
        }
        if(5 <= anzahlEiner && anzahlEiner <= 8)
        {
            output.append("V");
            for (int i = 6; i <= anzahlEiner; i++)
            {
                output.append("I");
            }
        }
        if(anzahlEiner == 4)
        {
            output.append("IV");
        }
        if(anzahlEiner < 4)
        {
            for (int i = 1; i <= anzahlEiner; i++)
            {
                output.append("I");
            }
        }
        return output.toString();

    }
}
