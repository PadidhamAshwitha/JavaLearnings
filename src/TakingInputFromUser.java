import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1 and 2");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The Sum of num1 and num2 is:" + sum);
//        float num3 = sc.nextFloat();
//        float num4 = sc.nextFloat();
//        float sum1 = num3 + num4;
//        System.out.println("The Sum of num3 and num4 is :" + sum1);
//        boolean b = sc.hasNextInt(); // for validation to only have to enter integer as input
//        System.out.println(b);
//        String str = sc.next();  //Reads only one word (upto first space) (ash )
//        System.out.println(str);
        String str1 = sc.nextLine(); //Reads the whole sentence (ashwitha is a good girl)
        System.out.println(str1);


    }
}
