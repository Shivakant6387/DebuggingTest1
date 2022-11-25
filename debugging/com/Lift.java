package com.debugging.com;

import java.util.Scanner;
class B1 {
    static int num;
    public  void display(int num) {
        switch (num) {
            case 1:
                System.out.println("This is a one floor");
                break;
            case 2:
                System.out.println("This is a second floor");
                break;
            case 3:
                System.out.println("This is third floor");
                break;
            case 4:
                System.out.println("This is forth floor");
                break;
            case 5:
                System.out.println("This is five floor");
                break;
            case 6:
                System.out.println("This is a six floor");
                break;
            default:
                System.out.println("This is a invalid number");
        }
    }
}
class B2 extends B1{
    public  void display(int num){
        switch (num){

            case 7:
                System.out.println("This is a seven floor");
                break;
            case 8:
                System.out.println("This is eight  floor");
                break;
            case 9:
                System.out.println("This is nane floor");
                break;
            case 10:
                System.out.println("This is ten floor");
                break;
            default:
                System.out.println("This number is not valid");
        }
    }
}
public class Lift {
    public static void main(String[] args) {
        B1 obj1=new B1();
        obj1.display(18);
         B2 obj=new B2();
         obj.display(9);


    }
}
