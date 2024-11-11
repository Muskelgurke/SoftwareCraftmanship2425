import org.example.Calculator;
import org.example.RunLengthEncoder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.RomanNumerals.intToRoman;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestRomanNumerals {
     @Test
    void TestCase1()
    {
        int number = 1;
        String expectedRoman = "I";

        Assertions.assertEquals(expectedRoman, intToRoman(number));
    }
    @Test
    void TestCase2()
    {
        int number = 2;
        String expectedRoman = "II";

        Assertions.assertEquals(expectedRoman, intToRoman(number));
    }
    @Test
    void TestCase3()
    {
        int number = 3;
        String expectedRoman = "III";

        Assertions.assertEquals(expectedRoman, intToRoman(number));
    }
    @Test
    void TestCase4to8()
    {
        String[] romanNumerals = {"", "", "", "", "IV", "V", "VI", "VII", "VIII"};

        for (int i = 4; i <= 8; i++)
        {
            Assertions.assertEquals(romanNumerals[i], intToRoman(i));
        }
    }
    @Test
    void TestCase9()
    {
        int number = 9;
        int number2 = 10;
        int number3 = 11;
        String expectedRoman = "IX";
        String expectedRoman2 = "X";
        String expectedRoman3 = "XI";


        Assertions.assertEquals(expectedRoman, intToRoman(number));
        Assertions.assertEquals(expectedRoman2, intToRoman(number2));
    }
    @Test
    void TestCase10()
    {
        int number = 20;
        int number2 = 30;
        int number3 = 39;
        String expectedRoman = "XX";
        String expectedRoman2 = "XXX";
        String expectedRoman3 = "XXXIX";


        Assertions.assertEquals(expectedRoman, intToRoman(number));
        Assertions.assertEquals(expectedRoman2, intToRoman(number2));
        Assertions.assertEquals(expectedRoman3, intToRoman(number3));
    }
    @Test
    void TestCase40()
    {
        int number = 40;
        int number1 = 45;
        int number2 = 47;
        String expectedRoman = "XL";
        String expectedRoman1 = "XLV";
        String expectedRoman2 = "XLVII";
        Assertions.assertEquals(expectedRoman, intToRoman(number));
        Assertions.assertEquals(expectedRoman1, intToRoman(number1));
        Assertions.assertEquals(expectedRoman2, intToRoman(number2));
    }
    @Test
    void TestCase50()
    {
        int number = 50;
        int number1 = 52;
        String expectedRoman = "L";
        String expectedRoman1 = "LII";
        Assertions.assertEquals(expectedRoman, intToRoman(number));
        Assertions.assertEquals(expectedRoman1, intToRoman(number1));
    }@Test
    void TestCase60()
    {
        int number = 60;
        int number1 = 62;
        String expectedRoman = "LX";
        String expectedRoman1 = "LXII";
        Assertions.assertEquals(expectedRoman, intToRoman(number));
        Assertions.assertEquals(expectedRoman1, intToRoman(number1));
    }@Test
    void TestCase90()
    {
        int number = 90;
        int number1 = 91;
        String expectedRoman = "XC";
        String expectedRoman1 = "XCI";
        Assertions.assertEquals(expectedRoman, intToRoman(number));
        Assertions.assertEquals(expectedRoman1, intToRoman(number1));
    }@Test
    void TestCase100()
    {
        int number = 100;
        int number1 = 101;
        String expectedRoman = "C";
        String expectedRoman1 = "CI";
        Assertions.assertEquals(expectedRoman, intToRoman(number));
        Assertions.assertEquals(expectedRoman1, intToRoman(number1));
    }

}