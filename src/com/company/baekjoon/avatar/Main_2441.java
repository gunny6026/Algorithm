package com.company.baekjoon.avatar;

import java.util.Scanner;

public class Main_2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>0; i--){
            for (int k= 0; k<n-i; k++ ){
                System.out.print(" ");
            }

           for (int j=0; j<i; j++){
               System.out.print("*");
           }
            System.out.println();
        }

    }
}
