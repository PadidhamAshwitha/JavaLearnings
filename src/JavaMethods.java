public class JavaMethods {
    //class is like a hostel, static method is like a fridge which is common and anybody can use it without need of creating an object.
    //if its a non-static method then we have to create a object and object creates its own copy for every call
    //the changes in method doesnt reflect in main method
    static int mySum (int x, int y){//here x and y has copy of a and b so doesnt change original values
        int z = x + y;
        return z;
    }
    int calculateSum(int a, int b){//non - static
        int z = a * b;
        return z;
    }
    static void hello(){// doesnt have anything to return use void
        System.out.println("hello Ashwitha");
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = mySum(a, b);
        System.out.println(c);
        JavaMethods obj = new JavaMethods();
        int d = obj.calculateSum(a,b);
        System.out.println(d);
        hello();
    }
}
