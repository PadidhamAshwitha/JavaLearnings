public class Operators {
    public static void main(String[] args){
        //arihtmatic Operators
        int a = 10;
        int b = 20;
        System.out.println(50.5 % 5.5);
        //assignment Operator
        b+=3;
        System.out.println(b);
        //comparision Operator
        System.out.println(a>b);
        //logical Operator
        System.out.println(a<b || a>b );
        //Bitwise Operator
        System.out.println(2 | 5);
        //logical operators
        boolean x = true;
        boolean y = true;
        System.out.println("for logical AND.... both conditions must be true");
        if( x && y){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("logical OR.... any one must be true then result is true");
        if( x || y){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("logical not of x is: " + !x);
        //arithmetic Operators cannot work with booleans
        //% will work with float and double also
    }
}
