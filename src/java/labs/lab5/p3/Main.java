package java.labs.lab5.p3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(simpledimple(n, 2));
    }

    public static String simpledimple(int n, int div){
        if(n == 2){
            return "YES";
        }
        if(n % div == 0){
            return "NO";
        }
        if(div < n/2){
            return simpledimple(n, div+1);
        }
        return "YES";
    }
}
