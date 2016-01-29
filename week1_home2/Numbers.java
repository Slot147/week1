package week1_home2;

/**
 * Created by Dina on 24.01.2016.
 */

/*Написать класс число.
        - сложение
        - вычитание
        - умножение
        - деление
        - возведение в степень
        - вычисление факториала
        - вычисление остатка от деления
        - метод который сравнивает два числа*/

public class Numbers {

    public static int add (int firstNum, int secondNum){
        return  firstNum + secondNum;
    }

    public static int sub (int firstNum, int secondNum){
        return  firstNum - secondNum;
    }

    public static int mult (int firstNum, int secondNum){
        return  firstNum * secondNum;
    }

    public static int div (int firstNum, int secondNum){
        return  firstNum / secondNum;
    }

    public static int involution (int firstNum, int secondNum){
        int res = 1;
        for (int i = 0; i < secondNum; i++) {
            res = res * firstNum;
        }
        return  res;
    }

    //or

    /*public static double involution (int firstNum, int secondNum){
        return  Math.pow(firstNum, secondNum);
    }*/


    public static int fact(int firstNum){
        if (firstNum < 2){
            return 1;
        }
        return  firstNum * fact(firstNum -1);
    }

    public static int modulo (int firstNum, int secondNum){
        return  firstNum % secondNum;
    }

    public static boolean compares (int firstNum, int secondNum){
        return  (firstNum == secondNum);
    }


}
