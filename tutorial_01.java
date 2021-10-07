import java.util.Scanner;
public class tutorial_01 {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome Dear Student\n");
       
        // Taking User Input
        Scanner sc = new Scanner(System.in);

        // System.out.println("Marks Obtained In Subject1:");
        // int s1 = sc.nextInt();

        // System.out.println("Marks Obtained In Subject2:");
        // int s2 = sc.nextInt();

        // System.out.println("Marks Obtained In Subject3:");
        // int s3 = sc.nextInt();

        // System.out.println("Marks Obtained In Subject4:");
        // int s4 = sc.nextInt();

        // System.out.println("Marks Obtained In Subject5:");
        // int s5 = sc.nextInt();

        // System.out.println("Maximum Marks :");
        // int max_marks = 500;
        // System.out.println(max_marks);

        // System.out.println("Total Marks Obtained:");
        // int total_marks = s1 + s2 + s3 + s4 + s5;
        // System.out.println(total_marks);

        // System.out.println("Marks Obtained In Percentage");
        // float per = total_marks*100/max_marks;
        // System.out.println(per);

        int s1, s2, s3, s4, s5, total_marks, max_marks;
        float per;
        
        System.out.println("Enter Marks Obtained In 5 Subjects:");
        
        s1 = sc.nextInt();
       
        s2 = sc.nextInt();

        s3 = sc.nextInt();

        s4 = sc.nextInt();

        s5 = sc.nextInt();

        max_marks = 500;
        System.out.println(max_marks);

        total_marks = s1 + s2 + s3 + s4 + s5;
        System.out.println(total_marks);

        per = total_marks*100/max_marks;
        System.out.println(per);
    }
}
