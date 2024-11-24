package org.example;

public class Main3 {
    public static void main(String[] args) {
        hasTeen(14,15,16);
        hasTeen(34,54,44);
        hasTeen(14,45,9);

    }

    static void hasTeen (int number1, int number2, int number3) {

        if ((number1 >= 13 && number1 <= 19) ||(number2 >= 13 && number2 <= 19) || (number3 >= 13 && number3 <= 19))
        {
            System.out.println("True");
        }
     else
     {
            System.out.println("False");
        }

    }
}

