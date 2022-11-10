package com.InterviewProgram;

import java.util.Scanner;

public class NumberPositiveNegative {
   //WAP To take input as integer from user and validate number is positive or negative.
   public static void main(String []args)
   {
       Scanner input = new Scanner(System.in);
       double number = input.nextdouble();

       if(number >=0)
       {
           System.out.println("Given number is positive");
       }else
       {
           System.out.println("Given number is negative7");
       }
   }


}
