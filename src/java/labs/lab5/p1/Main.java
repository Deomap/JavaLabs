package java.labs.lab5.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int k, d, s = 0;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        d = sc.nextInt();

        for(int i = (int) Math.pow(10, count(k)-1); i < (int) Math.pow(10, count(k)); i++){
            if(rec(i) == d) {
                s++;
            }
        }
        System.out.println(s);
    }

    public static int rec(int i){
        if(i != 0) {
            return i % 10 + rec(i/10);
        }
        return 0;
    }

    public static int count(int n){
        if(n != 0){
            return 1+count(n/10);
        }
        return 0;
    }
}
