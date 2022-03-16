import java.util.Scanner;

public class MyFirstApp {


    public static void main(String[] args) {

        System.out.print("Enter your full name:");
        // Initialize Scanner object
        // read the value from the console
        Scanner scan = new Scanner(System.in);
        // read the first token
        String firstName = scan.next();
        // read the second token
        String lastName = scan.next();
        // Printing the token values of read by Scanner object
        System.out.println("First Name is "+firstName);
        System.out.println("Last Name is "+lastName);

        // closing the scanner stream
        scan.close();


        // next() method reads input up to the whitespace character. Once the whitespace is encountered, it returns the string (excluding the whitespace)

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter name");
        String name = scanner.nextLine();


        System.out.println("Got Covid");
        boolean answer = scanner.nextBoolean();

        System.out.println("Welcome "  + name + " It is " + answer+ " that you have covid" + " You can survive it since you are only" + age + " years old");


    }
}
