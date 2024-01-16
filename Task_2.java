import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the marks of three subjects");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            double cgpa=(double)(a+b+c)/30;
            System.out.println("CGPA= "+ cgpa);
    }
}

