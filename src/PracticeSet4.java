import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        System.out.println("-------------Question 1----------------");
        int a = 20;
        if(a == 20){
            System.out.println("The Value of a is 20!");
        }
        else{
            System.out.println("The value of a is not 20!");
        }

        // to find weather a student is pass or fail. total >40% and each subject >=35%
        System.out.println("-------------Question 2----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject1 marks: ");
        byte sub1 = sc.nextByte();
        System.out.println("Enter Subject2 Marks: ");
        byte sub2 = sc.nextByte();
        System.out.println("Enter Subject3 Marks: ");
        byte sub3 = sc.nextByte();
        float total = (sub1 + sub2 + sub3)/3.0f;
        System.out.println("Your Total marks on average is: " + total);
        if (total >=40 && sub1 >=35 && sub2 >= 35 && sub3 >= 35){
            System.out.println("Congratulations !! You did well in your exams...");
        }
        else {
            System.out.println("All The Best🤝🤝!! Reach out to me for any help and prepare well for next exam... Something much bigger is waiting for you...");
        }


        System.out.println("-------------Question 3----------------");
        //income tax paid by employee to govt 2.5-5 LPA ->5% 5-10 LPA -> 20% ABOVE 10LPA -> 30% tax should be paid..... and no tax for below 2.5LPA
        System.out.println("Enter Your Income per Annum inLPA: ");
        float salary = sc.nextFloat();
        float tax = 0;
        if (salary >=2.5 && salary <=5) {
            tax += 0.05f * (salary - 2.5f);
        }
        else if(salary > 5 && salary <=10){
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (salary - 5.0f);
        }
        else if (salary > 10) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10 - 5.0f);
            tax += 0.3f * (salary - 10.0f);
        }
        else{
            System.out.println("You are free!!! no tax to be paid");
        }
        System.out.println("The tax you are supposed to py is: " + tax);


        System.out.println("-------------Question 4----------------");
        // find out the day of the week...
        System.out.println("Enter a number from 1 to 7 to get the day of week: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Today is Monday!");
            case 2 -> System.out.println("Today is Tuesday!");
            case 3 -> System.out.println("Today is Wednesday!");
            case 4 -> System.out.println("Today is Thursday!");
            case 5 -> System.out.println("Today is Friday!");
            case 6 -> System.out.println("Today is Saturday!");
            case 7 -> System.out.println("Today is Sunday! enjoyyy!!!");
            default -> System.out.println("Enter a valid number to get the day!!");
        }
        System.out.println("-------------Question 5----------------");
        // Leap Year
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println(year + "is a Leap Year!");
        }
        else{
            System.out.println(year + " is not a Leap Year!");
        }

        System.out.println("-------------Question 6----------------");
        // find out the type of website
        System.out.println("Enter the url: ");
        Scanner sc1 = new Scanner(System.in);
        String website_url = sc1.nextLine();
        if (website_url.endsWith(".org")){
            System.out.println("Its an Organisational website...");
        } else if (website_url.endsWith(".in")) {
            System.out.println("Its an Indian website...");
        } else if (website_url.endsWith(".com")) {
            System.out.println("Its a Commercial website...");
        }
        else{
            System.out.println("Sorry!!...The website is not known...");
        }

    }
}
