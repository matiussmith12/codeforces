package com.codeforce;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bitplusplus {

    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));


        int number = sc.nextInt();
        int count = 0;

        String[] store = new String[number];

        for(int i=0; i<number; i++){
            store[i] = sc.next();

            if(store[i].equals("X++") || store[i].equals("++X")){
                count++;
            }
            else if(store[i].equals("++X")){
                count++;
            }
            else if(store[i].equals("X--")){
                count--;
            }
            else if(store[i].equals("--X")){
                count--;
            }
        }
        System.out.println(count);
    }
}
