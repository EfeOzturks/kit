import java.util.Scanner;

public class InOutExample {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("x");
            return;
        }


        String separator = args[0];


        Scanner scanner = new Scanner(System.in);


        System.out.println("1.");
        String line1 = scanner.nextLine();

        System.out.println("2.");
        String line2 = scanner.nextLine();

        System.out.println("3.");
        String line3 = scanner.nextLine();


        String result = line1.toLowerCase() + separator +
                line2.toLowerCase() + separator +
                line3.toLowerCase();


        System.out.println(result);


        scanner.close();
    }
}
