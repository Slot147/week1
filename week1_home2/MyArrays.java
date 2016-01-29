package week1_home2;

import java.util.Arrays;

/**
 * Created by Dina on 27.01.2016.
 */

/*Написать класс массив.
        - нахождение минимального
        - нахождение максимального
        - заполнение случайными числами в диапазоне
        - красивый вывод на экран {2 4 5 6}
        -* увеличить размер
        -* сделать сортировку массива
        -* метод для сравнения с другим массивом
*/

public class MyArrays {

    public static int minValue (int [] array){

        int min = array [0];

        for (int i = 1; i < array.length; i++) {
            if (array [i] < min){
                min = array [i];
            }
        }
        return min;
    }

    public static int maxValue (int [] array){

        int max = array [0];

        for (int i = 1; i < array.length; i++) {
            if (array [i] > max){
                max = array [i];
            }
        }
        return max;
    }

    public static int [] randomNumbers (int [] array, int indexFrom, int indexTo){

        for (int i = 0; i < array.length; i++) {
            //array [i] = 155 + new Random().nextInt(3);
            array [i] = (int)((Math.random() * (indexTo - indexFrom + 1)) + indexFrom);
        }
        return array;
    }

    public static void printArray (int [] array){
        System.out.println(Arrays.toString(array));
    }

    public static int [] enlargeArray (int [] array, int howMuchToEnlarge){
        int [] newArray = new int [array.length+howMuchToEnlarge];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public static int [] sort (int [] array){

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i+1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        return array;

    }

    public static boolean compareArrays (int [] array, int [] array2){

        if(array.length != array2.length){
            return  false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array [i] != array2 [i]){
                return false;
            }
        }
        return true;
    }
}
