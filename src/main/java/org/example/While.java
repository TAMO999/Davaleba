package org.example;

public class While {
    public static void main(String[] args) {

        String number= "abcdefghizklmnop";

        int position =3;

        while (position < number.length()){
            char l =number.charAt(position);

            if (l=='z'){
                System.out.println("z  ასოს პოვნაზე შეწყდეს ციკლი"); break;
            }

            System.out.println(number.charAt(position));

                position = position + 3;
        }

    }
}
