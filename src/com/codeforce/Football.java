package com.codeforce;

import java.util.Scanner;

public class Football {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String fb = sc.next();
        if(fb.contains("1111111") || fb.contains("0000000")){
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
