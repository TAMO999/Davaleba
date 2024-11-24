package org.example;

public class Main2 {
    public static void main(String[] args) {
     checkNumber(1);
     checkNumber(-2);
     checkNumber(0);

    }

    static void  checkNumber (int number ) {
        if (number > 0) {
            System.out.println("დადებითი");
        }
        else if (number < 0) {
            System.out.println("უარყოფითი");
        }
        else {
            System.out.println("ნოლი");
        }
    }
}
