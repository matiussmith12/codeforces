package com.codeforce;

import java.util.Scanner;

public class WrongSubtraction {
    Scanner sc = new Scanner(System.in);

    public void Solve(){
        int n = sc.nextInt();
        int K = sc.nextInt();

        for(int i = 1; i <= K; i++){
            if( n % 10 == 0)
                n /= 10;
            else
                n -= 1;
        }

        System.out.println(n);
//        while(K--) {
//            if (n % 10 == 0) {
//                n /= 10;
//            } else
//                n -= 1;
//        }
    }

    public static void main(String[] args){
        WrongSubtraction ws = new WrongSubtraction();

        ws.Solve();
    }
}