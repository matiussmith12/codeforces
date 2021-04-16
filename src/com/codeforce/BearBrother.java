package com.codeforce;

import java.util.Scanner;

public class BearBrother {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        while( a <= b){
            a *= 3;
            b *= 2;

            count++;
        }
        System.out.println(count);
    }
}
