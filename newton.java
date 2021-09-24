package nl.ru.ai.hiekeandru.exercise3;
import java.util.Scanner;

public class newton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Assign a value to a: ");
        int a = scanner.nextInt();
        int x = 1;
        double f = x*x - a;
        double fdx = 2*x;
        double e = 0.001;
        System.out.print(a);
       /* while (f < e) {

        } */
    }
}
