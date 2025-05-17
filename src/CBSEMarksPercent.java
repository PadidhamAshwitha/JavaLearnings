import java.util.Scanner;

public class CBSEMarksPercent {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of C");
        float C = sc.nextFloat();
        System.out.println("Enter marks of Python");
        float Python = sc.nextFloat();
        System.out.println("Enter marks of Java");
        float Java = sc.nextFloat();
        System.out.println("Enter marks of JS");
        float JS = sc.nextFloat();
        System.out.println("Enter marks of ruby");
        float ruby = sc.nextFloat();
        System.out.println("Enter total marks per each subject: ");
        int Total = sc.nextInt();
        float Percentage = (C + Python + Java + JS + ruby) / (5*Total) *100;
        System.out.println(Percentage + " %");
    }
}
