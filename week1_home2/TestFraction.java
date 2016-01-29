package week1_home2;
import static week1_home2.Fraction.*;


/**
 * Created by Dina on 28.01.2016.
 */
public class TestFraction {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(4, 5);
        Fraction fraction2 = new Fraction(3, 7);
        Fraction fraction3 = new Fraction(4, 5);

        Fraction fraction4 = new Fraction(4, 64);
        Fraction fraction5 = new Fraction(8, 3);


        System.out.println((fraction1.add(fraction2).compare(new Fraction(43, 35))) + " add");

        print(fraction1);
        print(fraction2);

        System.out.println((fraction3.sub(fraction2).compare(new Fraction(13, 35))) + " sub");

        System.out.println((fraction3.mult(fraction2).compare(new Fraction(12, 35))) + " mult");

        System.out.println((fraction3.div(fraction2).compare(new Fraction(28, 15))) + " div");
        System.out.println((fraction4.mult(fraction5).compare(new Fraction(1, 6))) + " div");

        System.out.println((fraction3.fractionToString().equals("4 / 5")) + " fractionToString");

        System.out.print("method print: ");
        print(fraction1);

        System.out.println((fraction1.compare(fraction3) == true) + " compare");


    }
}
