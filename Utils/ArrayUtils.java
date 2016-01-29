package Utils;

import java.util.Arrays;

/**
 * Created by Dina on 17.01.2016.
 */
public class ArrayUtils {
    // int[] -> String
    public static String toString(int[] mas){
        String temp = "";

        for (int i = 0; i < mas.length; i++) {
            temp += mas[i] + " ";
        }
        return temp;
    }

    public static void print(int[] mas){
        System.out.println(Arrays.toString(mas));
    }

    public static int min(int[] mas){
        int min = mas [0];

        for (int i = 1; i < mas.length; i++){
            if (mas [i] < min){
                min = mas [i];
            }
        }
        return min;
    }

    // find index of first el
    public static int indexOf(int[] target, int el){
        int indexEl = 0;
        for (int i = 0; i < target.length; i++){
            if (target [i] == el){
                indexEl = i;
                return indexEl;
            }
        }
       return -1;
    }

    public static int lastIndexOf(int[] target, int el){
        int indexEl = 0;

        for (int i = 0; i < target.length; i++){
            if (target [i] == el){
                indexEl = i;
            }
        }
        return indexEl;
    }

    // 1,2,3,4
    public static int[] subarray(int[] mas, int start, int end){
        int newMas [] = new int [end - start + 1];

        for (int i = start, j = 0; i <= end; i++){
            newMas [j++] = mas [i];
        }

        return newMas;
    }

    public static int[] revert(int[] mas){

        int []newMas = new int[mas.length];

        for (int i = 0, j = mas.length-1; i < mas.length ; i++, j--) {
            newMas[i] = mas[j];
            newMas[j] = mas[i];
        }

        return newMas;
    }

    public static int[] sym(int[] a, int[] b){

        int lengthNewMas = a.length > b.length ? a.length : b.length;
        int newMas [] = new int [lengthNewMas];

        for (int i = 0; i < newMas.length ; i++) {
            newMas[i] = a[i] + b [i];

            if(a.length == i){
                newMas [i] = b[i];
            }
            if (b.length == i){
                newMas[i]=a[i];
            }
        }

        return newMas;
    }

    // 1 2 3 4 * 3 = 3 + 6 + 9 + 12 =  30
    public static int multAndSum(int[] a, int operand){

        int sum = 0;

        for (int i = 0; i < a.length ; i++) {
            a[i] *= 3;
            sum += a[i];
        }

        return sum;
    }

    public static void sort(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int min_i = i;

            for (int j = i+1; j < mas.length; j++) {

                if (mas[j] < min) {
                    min = mas[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = mas[i];
                mas[i] = mas[min_i];
                mas[min_i] = tmp;
            }
        }
    }
}
