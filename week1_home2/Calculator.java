package week1_home2;

/**
 * Created by Dina on 27.01.2016.
 */

/*Написать калькулятор в виде консольного меню
        - сложение двух чисел
        - вычитание двух чисел
        - умножение двух чисел
        - деление двух чисел*/

public class Calculator {

    private String inputString;

    public Calculator(String input) {
        this.inputString = input;
    }

    public int calculation (){

        int count = 0;
        String left = "";

        while (Character.isDigit(inputString.charAt(count))){
            left += inputString.charAt(count);
            count++;
        }

        char sing = inputString.charAt(count++);
        String right = inputString.substring(count);

        Integer x = apply(sing, left, right);
        if (x != null) return x;

        return 0;
    }

    private Integer apply(char sing, String left,String right) {

        int leftNumber = Integer.valueOf(left);
        int rightNumber = Integer.valueOf(right);

        switch (sing){
            case '+':
                return leftNumber + rightNumber;
            case '-':
                return leftNumber - rightNumber;
            case '*':
                return leftNumber * rightNumber;
            case '/':
                return leftNumber / rightNumber;
        }
        return null;
    }


}
