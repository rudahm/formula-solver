package nl.ru.ai.hiekeandru.exercise3;
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {
        assignValues();
    }

    public static void assignValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Assign a value to a: ");
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.print("Please assign a positive value to a, let's try this again: ");
            a = scanner.nextInt();
        }
        System.out.print("Assign a value to b: ");
        int b = scanner.nextInt();
        if (b <= 0) {
            System.out.print("Please assign a positive value to b, let's try this again: ");
            b = scanner.nextInt();
        }
        System.out.print("Assign a value to c: ");
        int c = scanner.nextInt();
        if (c <= 0) {
            System.out.print("Please assign a positive value to a, let's try this again: ");
            c = scanner.nextInt();
        }

       giveAnswers(a, b, c);
    }

    public static void giveAnswers(int a, int b, int c){
        //int y = b**2-4*a*c; I think you need a package for this and I am too lazy to look it up
        int d = b * b - 4 * a * c;
        if (d == 0) {
            double x = (-b)/2*a;
            System.out.println("The discriminant is " + d);
            System.out.print("There is only one solution and that solution is: " + x);
        }
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("The discriminant is " + d);
            System.out.print("There are two solutions and those solutions are: "  + x1 + " and " + x2);
        }
        if (d < 0) {
            System.out.println("The discriminant is " + d);
            System.out.print("There are no (real) solutions");
        }
    }
}



