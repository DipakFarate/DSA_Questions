package com.company.MissingNumbers;
import  java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            printPalindrome(n);
    }
    public static void printPalindrome(int n){
        int result=0;
        int orig=n;
        while(n!=0){
            int remainder =n%10;
            result  =result*10+remainder;
            n =n/10;
        }
        if(orig==result){
            System.out.println("it is palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
