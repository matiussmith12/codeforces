package com.codeforce;
import java.util.Scanner;

public class StringTask {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine().toLowerCase().replaceAll("[aiueoy]", "");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            ans.append(".");
            ans.append(input.charAt(i));
        }
        System.out.println(ans);
    }
}
