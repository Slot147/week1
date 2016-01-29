package week1_home2;

/**
 * Created by Dina on 26.01.2016.
 */

/*Написать класс строка
        - создание на основе массива символов
        - вывод на экран
        - конкатенация
        - понижение регистра
        - повышение регистра
        - поиск подстроки
        - выделение подстроки
        - удаление пробелов
        - метод для сравнения с другой строкой*/

public class MyString {

    private char [] arrayChars;

    public MyString(String string) {
        this.arrayChars = string.toCharArray();
    }

    public MyString(char[] arrayChars) {
        this.arrayChars = arrayChars;
    }

    public void  MyPrint (){
        for (char elem : arrayChars){
            System.out.print(elem);
        }
        System.out.println();
    }

    public MyString myConcat (MyString a){// слияние(конкатенация)

        char[] newArray = new char[arrayChars.length + a.arrayChars.length];

        System.arraycopy(arrayChars, 0, newArray, 0, arrayChars.length);
        System.arraycopy(a.arrayChars, 0, newArray, arrayChars.length, a.arrayChars.length);

        return new MyString(newArray);
    }

    public void  myToLowerCase(){//нижний регистр

        for (int i = 0; i < arrayChars.length; i++) {
            arrayChars[i] = Character.toLowerCase(arrayChars[i]);
        }
    }

    public void myToUpperCase(){//верхний регист

        for (int i = 0; i < arrayChars.length; i++) {
            arrayChars[i] = Character.toUpperCase(arrayChars[i]);
        }
    }

    public boolean myRegionMatches (MyString a){//поиск подстроки

        return false;
    }

    public MyString mySubstring(int start, int end){//выделение подстроки

        int length = end - start;
        char[] newArray = new char[length];

        System.arraycopy(arrayChars, start, newArray, 0, length);

        return new MyString(newArray);
    }

    public MyString mySplit (){//удаление пробелов

        return null;
    }

    public boolean myEquals(MyString b){//метод для сравнения с другой строкой
        if (arrayChars.length != b.arrayChars.length){
            return false;
        }

        for (int i = 0; i < arrayChars.length; i++) {
            if (arrayChars [i] != b.arrayChars [i]){
                return false;
            }
        }

        return true;
    }

}
