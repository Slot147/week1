package week1_home2;
import static week1_home2.Numbers.*;

/**
 * Created by Dina on 24.01.2016.
 */
public class TestNumbers {
    public static void main(String[] args) {
        int firstNum = 8;
        int secondNum = 2;
        int thirdNum = 3;

        System.out.println((add(firstNum,secondNum) == 10) + " Numbers.add");

        System.out.println((sub(firstNum, secondNum) == 6) + " Numbers.sub");

        System.out.println((mult(firstNum,secondNum) == 16) + " Numbers.mult");

        System.out.println((div(firstNum, secondNum) == 4) + " Numbers.div");

        System.out.println((involution(firstNum, secondNum) == 64) + " Numbers.involution");

        System.out.println((fact(firstNum) == 40320) + " Numbers.factorial");

        System.out.println((modulo(firstNum, thirdNum) == 2) + " Numbers.modulo");

        System.out.println((compares(firstNum, secondNum) == false) + " Numbers.compares");

    }
}
