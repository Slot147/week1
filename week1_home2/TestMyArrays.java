package week1_home2;
import static week1_home2.MyArrays.*;
/**
 * Created by Dina on 27.01.2016.
 */
public class TestMyArrays {
    public static void main(String[] args) {
        int [] firstArray = {2,6,8,7,9,4,1};
        int [] secondArray = {5,4,6,1,7,2,8};
        int [] thirdArray = new int[5];
        int [] fourthtArray = {2,6,8,7,9,4,1};

        System.out.println((minValue(firstArray) == 1) + " minValue()");

        System.out.println((maxValue(firstArray) == 9) + " maxValue()");

        System.out.println((enlargeArray(thirdArray, 3).length == 8) + " enlargeArray");

        printArray(firstArray);

        System.out.println((compareArrays(firstArray, fourthtArray) == true) + " compareArrays");

        System.out.print("randomNumbers: ");
        printArray(randomNumbers(thirdArray, 6, 28));

        System.out.print("sort: ");
        printArray(sort(secondArray));

    }
}
