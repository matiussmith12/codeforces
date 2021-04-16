//package com.codeforce;

import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jlhX = 0;
        int jlhY = 0;
        int jlhZ = 0;

        int n = sc.nextInt();

        for(int i = 0; i < n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            jlhX += x;
            jlhY += y;
            jlhZ += z;
        }
        if(jlhX == 0 && jlhZ == 0 && jlhY == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
