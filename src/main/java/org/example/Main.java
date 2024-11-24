package org.example;

public class Main {
    public static void main(String[] args) {


        int [] number ={1,2,3,4,5,6,7,8,9,10};
        int j =0;
        for (int i=0; i< number.length ; i++){
            if (number[i]% 2==0){
                j ++;

            }
        }
  if (j==0){
      System.out.println( "მასივში არ არის ლუწი რიცხვი");
  }
  else  if (j==5){
      System.out.println("ამ მასივში არის 5 ლუწი რიცხვი");
  }

    }
}
