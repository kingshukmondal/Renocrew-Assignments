import java.util.Scanner;

public class DAY1_Task1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects ::");
        System.out.print("Subject 1 ::");
        int a=sc.nextInt();
        System.out.print("Subject 2 ::");
        int b=sc.nextInt();
        System.out.print("Subject 3 ::");
        int c=sc.nextInt();
        System.out.print("Subject 4 ::");
        int d=sc.nextInt();
        System.out.print("Subject 5 ::");
        int e=sc.nextInt();

        int sum=a+b+c+d+e;
        double percentage = (double)sum/5;
        System.out.println("The Percentage is ::"+percentage);



    }
}
