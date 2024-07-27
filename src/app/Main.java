package app;

public class Main {
    static int sum;

    public static void main(String[] args) {
       sum = 0;

       for (int i=1; i<=6; i++)
           System.out.println(i + ") Num is " + i + ", sum is " + (sum+=i));

       System.out.println("------------------------");
       System.out.println("Sum of numbers is " + sum);
    }
}
