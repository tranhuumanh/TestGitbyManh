import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("I implemented: " + my_calculator.getClass().getInterfaces()[0].getName());
        System.out.println(my_calculator.divisor_sum(n));
    }
}