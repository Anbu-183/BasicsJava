package org.example;

public class Inbuiltmethods {

    public static void main(String[] args) {
        String s="Welcome";
        String k="Home";
//        String k="welcome";
        /**Used to get the length of string */
        Object a= s.length();
        System.out.println(a);


        /**Used to join two string */
        System.out.println(s.concat(" "+k));

        /**Used to check string are equal it's return Boolean Value */
        System.out.println(s.equals(k));

        /**Used to check string are equal(Ignoring case) it's return Boolean Value */
        System.out.println(s.equalsIgnoreCase(k));

        System.out.println(s.replace("e","b"));

        System.out.println(s.substring(0,1));




    }
}
