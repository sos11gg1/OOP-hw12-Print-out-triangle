package com.example.lib;

public class MyClass {
    public static void main(String[] avg){
        int i,j;
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int n = scanner.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=n;j>i;j--){
                if(i==(n-1))
                    break;
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
