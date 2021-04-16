package com.codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String sum = sc.next().replace("+", "");

        char []output = sum.toCharArray();

        Arrays.sort(output);

        for(int i = 0; i < output.length;i++){
            System.out.print(output[i]);

            if(i == output.length - 1)
                continue;
            System.out.print("+");
        }
        System.out.println();

    }
}
