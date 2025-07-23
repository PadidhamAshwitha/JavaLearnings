public class MethodOverLoading {
    static void change(int[] arr){
        arr[0] = 95;
    }
    static void greet(){
        System.out.println("hello");
    }
    static void greet(int a){
        System.out.println("hello " + a + " name");
    }
    static void greet(int a , int b){
        System.out.println("hello " + a + " name is a");
        System.out.println("hello " + b + " name is b");
    }
    public static void main(String[] args){
        int[] array = {65, 75, 88, 77, 92, 95};
        change(array);
        System.out.println(array[0]);
        greet();
        greet(10);
        greet(10, 20);
    }
}
