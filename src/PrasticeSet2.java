import java.util.Scanner;

public class PrasticeSet2 {
    public static void main(String[] args){
        float a = 7/4.f * 9/2.f;
        System.out.println(a);
        System.out.println("encrypt grade:");
        char grade = 'A';
//        System.out.println((int)grade);
        grade = (char)(grade + 8); //type casting manually changing the datatype
        System.out.println(grade);

        System.out.println("Decrypt the grade:");
        grade = (char)(grade - 8);
        System.out.println(grade);

        System.out.println("Given number is greater the the userdefined number or not");
        Scanner sc = new Scanner(System.in);
        int userDefNum = sc.nextInt();
        System.out.println( 10 > userDefNum );
        System.out.println("4. To Print V^2 -U^2 /2as");
        float v= 2;
        float u = 1;
        float s = 2;
        float answer = (v*v - u*u) / (2*a*s);
        System.out.println(answer);

        System.out.println("5. to find the value of a ? given a= 7*49/7 + 35 / 7");
        int b =  7*49/7 + 35 / 7;
        System.out.println(b);
    }
}
