package com.codeforce;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        System.out.println(text.substring(0, 1).toUpperCase() + text.substring(1));
    }
}
