package com.company;

public class Main {
    int a = 56;

    void display() {
        System.out.println("grandfather");
    }
}
    class b extends Main {
        int b = 78;

        void show() {
            System.out.println("father");
        }
    }
    class c extends b{
    int c=56;
    void sh(){
        System.out.println("child");
    }
    public static void main(String[] args) {
     c obj = new c();
     obj.display();
     obj.sh();
     obj.show();
        System.out.println(obj.c);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
