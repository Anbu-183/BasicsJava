package org.InterviewQuestions;

public class Eachwordreverse {


    public static void main(String[] args) {
        String str = " java is a programming language";
        String[] words = str.split(" ");
        String output="";

        for (String word:words) {
            String rev ="";

            for (int i=word.length()-1;i>=0;i--) {
                rev = rev + word.charAt(i);

            }
            output=output + rev+ " ";


        }
        System.out.println(output);

    }
}
