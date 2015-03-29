import java.util.Scanner;

/**
 * Created by Ayman Elkfrawy on 3/29/2015.
 * elkfrawy@gmail.com
 * Solve function X^2 + 4 sin(x) = 0 using NewtonRaphson method
 */
public class NewtonRaphson {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter root initial guess:");
        double x0 = scan.nextDouble();
        System.out.println("Enter max error allowed:");
        double error = scan.nextDouble();
        System.out.println("Enter max iterations:");
        int maxIterations = scan.nextInt();

        double x1 = newtonRaphson(x0);
        int i = 0;
        while (Math.abs(x1 - x0) > error && (i++ < maxIterations)) {
            System.out.format("Iteration: %d\t Approx.: %f\t F(approx.):%f\n", i, x1, f(x1));
            x0 = x1;
            x1 = newtonRaphson(x0);
        }

    }

    public static double f(double x) {
        return x*x + 4 * Math.sin(x);
    }

    public static double df(double x) {
        return 2*x + 4 * Math.cos(x);
    }

    public static double newtonRaphson(double x0) {
        return x0 - f(x0)/df(x0);
    }
}
