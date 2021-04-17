//package com.codeforce;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String text = sc.next();
        String TextReverse = sc.next();

        StringBuilder output = new StringBuilder(TextReverse);

        if(text.equals(output.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
