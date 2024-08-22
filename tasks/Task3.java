package tasks;

public class Task3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int temp;

        System.out.println("Value of A before swap: " + a);
        System.out.println("Value of B before swap: " + b);
        System.out.println("---------------------------");

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of A after swap: " + a);
        System.out.println("Value of B after swap: " + b);
    }
}
