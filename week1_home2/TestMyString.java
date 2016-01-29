package week1_home2;

/**
 * Created by Dina on 26.01.2016.
 */
public class TestMyString {
    public static void main(String[] args) {

        MyString firstString = new MyString("Photo");
        MyString secondString = new MyString("life");
        MyString thirdString = new MyString("Photo of the Day");
        MyString fourthString = new MyString("life");

        firstString.MyPrint();

        System.out.println((secondString.myEquals(fourthString) == true) + " myEquals");

        System.out.println((firstString.myConcat(secondString).myEquals(new MyString("Photolife"))) + " myConcat");

        firstString.myToUpperCase();
        System.out.println((firstString.myEquals(new MyString("PHOTO"))) + " myToUpperCase");

        firstString.myToLowerCase();
        System.out.println((firstString.myEquals(new MyString("photo"))) + " myToLowerCase");

        System.out.println((thirdString.myRegionMatches(new MyString("the")) == true) + " myRegionMatches");

        System.out.println((thirdString.mySubstring(6,12).myEquals(new MyString("of the")))+ " mySubstring");

        System.out.println((thirdString.mySplit().myEquals(new MyString("PhotooftheDay"))) + " mySplit");

    }
}
