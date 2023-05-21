package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Twodimensionalarray {
    public static void main(String[] args) {

        int[][] a ={{10,20,30,40},{50,60,70,80}};

        for(int[] i :a){
            for (int j:i){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        }
    }
