//package com.codeforce;

import java.util.Scanner;

public class YoungPhysicist {
    Scanner sc = new Scanner(System.in);

    public void Solve(){
        int n = sc.nextInt();
        int count = 0;
        String stones = sc.next();
        char first = stones.charAt(0);

        for(int i = 1; i < n; i++){
            if(stones.charAt(i) == first)
                count++;
            else
                first = stones.charAt(i);
        }

        System.out.println(count);

    }

    public static void main(String[] args){
        YoungPhysicist y = new YoungPhysicist();

        y.Solve();
    }
}
