//package com.codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class BoyGirl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String chat = sc.next();
        char []output = chat.toCharArray();

        Arrays.sort(output);
        for(int i = 1; i < output.length; i++){
            if(output[i-1] != output[i]){
                ++count;
            }
        }
        if(count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
