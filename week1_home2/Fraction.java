package week1_home2;

/**
 * Created by Dina on 28.01.2016.
 */

/*
Написать класс дробь
        - сложение дробей
        - вычитание
        - умножение
        - деление
        - приведение к строке
        - вывод
        - метод для сравнения с другой дробью
*/

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0){
            throw new IllegalArgumentException("Введено не корректное значение!");
        }
    }

    public Fraction add (Fraction fraction){

        int tempDenominator = 0;
        int tempNumerator = 0;

        if(denominator != fraction.denominator){

            tempDenominator = denominator * fraction.denominator;
            tempNumerator = (numerator * fraction.denominator) + (fraction.numerator * denominator);

            return gsdFraction(tempNumerator, tempDenominator);
        }

        tempNumerator = numerator  + fraction.numerator;

        return gsdFraction(tempNumerator, denominator);
    }


    public Fraction sub (Fraction fraction){

        int tempDenominator = 0;
        int tempNumerator = 0;

        if(denominator != fraction.denominator){
            tempDenominator = denominator * fraction.denominator;
            tempNumerator = (numerator * fraction.denominator) - (fraction.numerator * denominator);

            return gsdFraction(tempNumerator, tempDenominator);
        }

        tempNumerator = numerator - fraction.numerator;

        return gsdFraction(tempNumerator, (denominator));
    }

    public Fraction mult (Fraction fraction){

        int tempNumerator = numerator * fraction.numerator;
        int tepmDenominator = denominator * fraction.denominator;

        return gsdFraction(tempNumerator, tepmDenominator);
    }

    public Fraction div (Fraction fraction){

        int tempNumerator = numerator * fraction.denominator;
        int tepmDenominator = denominator * fraction.numerator;

        return gsdFraction(tempNumerator, tepmDenominator);
    }

    public String fractionToString (){

        return numerator + " / " + denominator;
    }

    public static void print (Fraction fraction){

        System.out.println(fraction.fractionToString());
    }

    public boolean compare (Fraction fraction){

        if(denominator != fraction.denominator){
            numerator = numerator * fraction.denominator;
            fraction.numerator = fraction.numerator * denominator;
        }

        if (numerator < fraction.numerator){
            return false;
        } if (numerator > fraction.numerator){
            return false;
        }

        return true;
    }

    private Fraction gsdFraction(int numerator, int denominator) {

        int gsdFraction = gsd(numerator, denominator);
        numerator = numerator/gsdFraction;
        denominator = denominator/gsdFraction;

        return new Fraction(numerator, denominator);
    }

    private int gsd (int numerator, int denominator){//наибольший общий делитель(greatest common divisor)
        int tempNumerator = numerator;   //????
        int tempDenominator = denominator;

        while (tempNumerator != 0 && tempDenominator != 0){

            if (tempNumerator > tempDenominator){
                tempNumerator %= tempDenominator;
            }else {
                tempDenominator %= tempNumerator;
            }
        }
        return tempNumerator + tempDenominator;
    }

}
