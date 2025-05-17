import java.util.Scanner;

public class PractceSet1 {
    public static void main(String[] args){
//        sum of 3 numbers
//        cgpa and marks are out of 100
        float sub1 = 95;
        float sub2 = 95;
        float sub3 = 95;
        float cgpa = (sub1 + sub2 + sub3 )/30;
        System.out.println("The cgpa is: " + cgpa);
//        combine hello with name
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " good morning !!!!");
//        convert kilometers to meters
        int kilo = sc.nextInt();
        System.out.println(kilo * 0.621371);
//        check entered is integer or not
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
