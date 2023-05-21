package org.example;

public class Methodoverloading {
    /** Method overloading ?
     * Declaring one more method with the Same method name  in the same class is known as the method overloading.*/
    int a;
    int b;
    void sum(){
        a=100;
        b=250;
        System.out.println(a+b);

    }

    void sum(int x, int y){
        x=a;
        y=b;
        System.out.println(a+b);
    }

    void sum(int x,double y,int z){
        x=a;
        y=b;
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        Methodoverloading m= new Methodoverloading();
        m.sum();
        m.sum(100,250);
        m.sum(100,250,34);

    }

}
