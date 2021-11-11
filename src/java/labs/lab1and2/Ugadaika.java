package java.labs.lab1and2;
import java.util.Scanner;

public class Ugadaika {

    public static void main(String[] args) {
	    int n = (int) (Math.random() * 100) * 2 - 100;
        int low = -100, up = 100;
        System.out.println("Введите значение от -100 до 100: ");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int in = sc.nextInt();
            if (in == n) {
                System.out.println("Pravilno!");
                break;
            } else if (in > n) {
                up = in;
                System.out.println("Меньше! Введите значение от " + low + " до " + up + ": ");
            } else {
                low = in;
                System.out.println("Больше! Введите значение от " + low + " до " + up + ": ");
            }
        }
    }
}
