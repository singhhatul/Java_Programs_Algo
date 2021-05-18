package com.java.learn;

import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        if((num&1)==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+ "is odd");
    }
}
