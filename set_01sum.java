import java.util.Scanner;
public class set_01sum {
    public static void main(String[] args) {
        System.out.println("\n\n------Welcome Dear User------");

        // 01.taking User input to sum three no.
        System.out.println("\n\nSum Operation By Taking User Input-----");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("Sum:");
        int sum = a + b + c;
        System.out.println(sum);
        
    }
}
