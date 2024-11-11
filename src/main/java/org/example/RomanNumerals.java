package org.example;

public class RomanNumerals {

    public static String intToRoman(int Zahl){
        StringBuilder output = new StringBuilder();
        if(Zahl == 0)
        {
            return "";
        }


        int einer = Zahl % 10;
        int Zehner = (Zahl % 100)/10;
        int hunderter= (Zahl % 1000)/100;

        if (hunderter >=1){
            output.append("C");
        }
        if (Zehner == 9){
            output.append("XC");
        }

        if (Zehner >4 && Zehner<9){
            output.append("L");
            for (int i =0; i<Zehner-5; i++) {
                output.append("X");
            }
        }
        if (Zehner == 4){
            output.append("XL");
        }
        if (Zehner >=1 && Zehner<4){
            for (int i = 1; i<=Zehner; i++){
                output.append("X");
            }
        }

        if(einer == 9)
        {
            output.append("IX");
        }
        if(5 <= einer && einer <= 8)
        {
            output.append("V");
            for (int i = 6; i <= einer; i++)
            {
                output.append("I");
            }
        }
        if(einer == 4)
        {
            output.append("IV");
        }
        if(einer < 4)
        {
            for (int i = 1; i <= einer; i++)
            {
                output.append("I");
            }
        }

        return output.toString();

    }
}
