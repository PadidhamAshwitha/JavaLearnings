import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        switch (var){
            case (18):
                System.out.println("your age is 18!");
                break;
            case (20):
                System.out.println("your age is 20!");
                break;
            default:
                System.out.println("your age is not specified!!");
                break;
        }
        System.out.println("You came out of the Switch case");
    }
}
