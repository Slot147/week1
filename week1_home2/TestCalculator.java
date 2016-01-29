package week1_home2;

import java.util.Scanner;

/**
 * Created by Dina on 27.01.2016.
 */
public class TestCalculator {
    public static void main(String[] args) {

        String input = readLine();
        Calculator example = new Calculator(input);
        System.out.println((example.calculation() == 32) + " add");

        String input2 = readLine();
        Calculator example2 = new Calculator(input2);
        System.out.println((example2.calculation() == 24) + " sub");

        String input3 = readLine();
        Calculator example3 = new Calculator(input3);
        System.out.println((example3.calculation() == 112) + " mult");

        String input4 = readLine();
        Calculator example4 = new Calculator(input4);
        System.out.println((example4.calculation() == 7) + " div");


    }

    public static String readLine (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the data: "); // 28 & 4
        String input = in.nextLine();
        return input.replace(" ","");
    }
}
