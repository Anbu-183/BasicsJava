package org.inheritance;

public class Anbu{
    public static void main(String[] args) {
       B b1 =new B();
        b1.display();
       b1.x=100;
       b1.y=200;

       b1.sum(1,1);
       b1.display();

    }
}
