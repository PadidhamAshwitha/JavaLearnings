public class VarArgs {
    /*static int sum(int a){
        return a;
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum (int a, int b, int c){
        return a+b+c;
    }*/
    //insted of writing multiple overloaded methods we can use varargs. It will take given arguments as an arrayand perform the logic
    static int sum(int ...arr){
        int result = 0;
        for(int element: arr){
            result += element;
        }
        return result;
    }
    static int valid1(int a , int ...arr){//must have atleast 1 argument
        System.out.println(a + arr[0]);
        return a;
    }
    public static void main(String[] args) {
        System.out.println(sum()); // zero arguments also accepted
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1, 3, 4));
        System.out.println(valid1(1, 2, 3, 4, 5));
    }
}
