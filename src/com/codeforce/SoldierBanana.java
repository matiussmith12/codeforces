//package com.codeforce;

import java.util.Scanner;

public class SoldierBanana {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        for(int i = 1; i<= w; i++){
            total += i * k;
        }

        if(total < n )
            System.out.println(0);
        else
            System.out.println(total - n);
    }
}
