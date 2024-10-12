import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 Dollar");
        System.out.println("2 Euro");
        System.out.println("3 BRL");

        // input
        Scanner scanner = new Scanner(System.in);
        // currency as input
        System.out.println("Choose the currency");

        int choice = scanner.nextInt();
        System.out.println("Enter the value");
        double value = scanner.nextDouble();

        //convert the value
        switch (choice){
            case 1:
                Dollar(value);
                break;
            case 2:
                Euro(value);
                break;
            case 3:
                Real(value);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void Dollar(double amt){
        System.out.println(amt+" Dollar = " + (amt*0.92) + " Euro");
        System.out.println();

        System.out.println(amt+" Dollar = " + (amt*5.61) + " BRL");
        System.out.println();
    }

    public static void Euro(double amt){
        System.out.println(amt+" Euro = " + (amt*1.09) + " Dollar");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*6.16) + " BRL");
        System.out.println();
    }

    public static void Real(double amt){
        System.out.println(amt+" BRL = "+(amt*0.18)+ " Dollar");
        System.out.println();
        System.out.println(amt+" BRL = "+(amt*0.16)+" Euro");
        System.out.println();
    }
}