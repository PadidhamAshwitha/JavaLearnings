public class PracticeSet5 {
    public static void main(String[] args) {
        System.out.println("--------------question 1 ---------------------");
        System.out.println("print the pattern \n * * * * \n * * * \n * * \n * ");
        for (int i=0 ; i<5 ; i++){
            for(int j=i ; j<5 ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("--------------question 2 ---------------------");
        System.out.println("Sum first n even naturual numbers using while loop:");
        int n = 10;
        int sum = 0;
        for (int i=1; i <= n; i++){
            sum += 2*i;
        }
        System.out.println("The value of sum is:" + sum);

        System.out.println("--------------question 3 ---------------------");
        System.out.println("To Print Multiplication table of a given number n: ");
        for(int i = 1; i<=10; i++){
            System.out.println( n + " * " + i + " = " + n*i);
        }
        System.out.println("--------------question 4 ---------------------");
        System.out.println("To Print Multiplication table of a given number n in reverse order: ");
        for (int i=10 ; i>0; i--){
            System.out.println( n + " * " + i + " = " + n*i);
        }
        System.out.println("--------------question 5 ---------------------");
        System.out.println("Factorial of a given number: ");
        int num = 5;
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact *= i ; // 1 * 1 = 1; 1*2 =2; 2*3=6; 6*4=24; 24*5=120;
        }
        System.out.println("The factorial of given number 5 is: " + fact);
        System.out.println("--------------question 9 ---------------------");
        System.out.println("To Calculate the sum of numbers occuring in multiplication table of 8:");
        int number = 8;
        int sumOf8 = 0;
        for(int i=1; i<=10 ; i++){
            sumOf8 += number * i;
            System.out.println(sumOf8);
        }
        System.out.println("The sum of numbers occuring in multiplication table of 8: " + sumOf8);

    }
}
