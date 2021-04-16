package com.codeforce;

import java.util.Scanner;

public class Elephant {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //    int number = 0;
        int steps = sc.nextInt();


        if(steps <= 5)
            System.out.println("1");
        else{
            if(steps % 5 == 0){
                System.out.println(steps / 5);
            }
            else if(steps % 5 != 0){
                System.out.println((steps/5)+1);
            }
        }
    }
}
