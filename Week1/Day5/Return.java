import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator\n");
        System.out.print("Please Enter the number");
        int first = input.nextInt();
        System.out.println("Please Enter the number");
        int Second = input.nextInt();
        int sum = first + Second;
        System.out.println("Sum of the number is :" + sum);
        shail();
    }

    public static void shail() {
        System.out.println("Shailesh Pratap singh");
    }

    public static void greet() {
        System.out.println("Welcom to calculator\n");
    }

}
