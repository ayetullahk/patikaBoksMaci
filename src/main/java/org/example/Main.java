package org.example;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Ayetullah", 30, 220, 100,70 );
        Fighter f2=new Fighter("Nedim", 20, 200, 79,40 );

        Macth macth=new Macth(f1,f2,70,120);
        macth.run();
    }
}