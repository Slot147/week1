package Utils;

import java.util.Arrays;

//import static java.util.Arrays.*; тогда не надо будет писать перед методами ArrayUtils, а сразу сам метод!!!!
/**
 * Created by Dina on 17.01.2016.
 */
public class TestUtils {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        int [] b = {1,2,3,4,5};
        int [] c = {1,8,3,4,1,6,3,1,2,3};


        System.out.println(Arrays.toString(ArrayUtils.subarray(a,3,8)));

        System.out.println(Arrays.toString(ArrayUtils.sym(a,b)));

        System.out.println(ArrayUtils.indexOf(c, 3));
        System.out.println(ArrayUtils.lastIndexOf(c,3));

    }
}
