package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        singleDigitSumPrime(a, b);
    }

    static void singleDigitSumPrime(int a, int b)
    {
        for (int i = a + 1; i < b; i++){
           if (isPrime(i)){
               if (isPrime(sumOfDigit(i))){
                   System.out.print(i + "\t");
               }
           }
        }
    }

    static int sumOfDigit(int n)
    {
        int sum = 0;
        while (n > 0 || sum > 9){
            if (n == 0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
