package java.labs.lab1and2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if(in < 1) System.out.println("err");
        else System.out.println(fact(in));
    }

    public static int fact(int n){
        int r = 1;
        for(int i = 2; i <= n; i++){
            r *= i;
        }
        return r;
    }
}
