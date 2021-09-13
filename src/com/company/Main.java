package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int isp = n - 2;
        int osp = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= osp; j++) {
                System.out.print(" \t");
            }
            System.out.print("*\t");


            for (int j = 1; j <= isp; j++) {
                System.out.print(" \t");
            }
            System.out.print("*\t");

            if (i <= n / 2) {
                isp -= 2;
                osp++;
            } else {
                isp += 2;
                osp--;
            }

            System.out.println();
        }
    }
}
