//package com.codeforce;

import java.util.Scanner;

public class Tram {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int JmlhPenumpang = 0;
        int MaxPenumpang = 0;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            JmlhPenumpang -= a;
            JmlhPenumpang += b;

            MaxPenumpang = Math.max(MaxPenumpang, JmlhPenumpang);
        }
        System.out.println(MaxPenumpang);
    }
}
