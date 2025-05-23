public class Loops {
    public static void main(String[] args) {
        System.out.println("Print 1-10 using while loop: ");
        int i = 1;
        while (i<=10){
            System.out.println(i);
            if(i==6){
                System.out.println("Ending loop");
                break;
            }
            i++;
        }
        System.out.println("Print natural numbers from 1-n using do while: ");
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<5);

        System.out.println("Print first n (10) odd numbers using for loop: ");
        for (int k=0; k<10; k++){
            System.out.println(2*k+1);
        }
        System.out.println("decrementing for loop: ");
        System.out.println("Print first n (10) natural numberes in reverse order: ");
        for ( int l=10; l>0 ;l--){
            if(l==6){
                System.out.println("move to next itereation!");
                continue;
            }
            System.out.println(l);
        }
    }
}
