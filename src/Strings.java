import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Str ing is used when we should like to give a sequence of characters as input
        // String is a class not a predefined (primitive) datatype
        // as it has a special support by java we can use it as a primitive datatype
        // Strings are immutable and cannot be changed
        String name = new String("Ashwitha Padidham ");
        String name1 = "Web Developer";
        System.out.print("My name is :");
        System.out.println(name);
        int a = 10;
        float b = 20;
        System.out.printf("The value of a is: %d and the value of b is %10.4f \n", a, b);
        System.out.format("The value of a is: %d and the value of b is %10.4f \n", a, b);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.nextLine();
        System.out.println(str + "\n" + str1 );
    }
}
