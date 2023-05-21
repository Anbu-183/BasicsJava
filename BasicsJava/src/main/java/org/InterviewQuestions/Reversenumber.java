package org.InterviewQuestions;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int rev=0;
        while (input!=0){
            rev=rev*10+input%10;
            input=input/10;
        }
        System.out.println(rev);

        System.out.println("Enter the Number again for reverse");

        int input1=sc.nextInt();

        StringBuffer bc=new StringBuffer(String.valueOf(input1));
        System.out.println(bc.reverse());

    }
}
