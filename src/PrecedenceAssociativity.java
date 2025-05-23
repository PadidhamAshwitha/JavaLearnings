public class PrecedenceAssociativity {
    public static void main(String[] args) {
        //precedence is like iam greater than you
        //associativity is like evaluation order
        // * and / has same predence so we use associativity( left to right) to break the tie
        float a = 6*5 - 70/2.f;
        float b = 6/5 - 6/2.f;
        float c =1.f;
        System.out.println(a);
        System.out.println(b);
        float result = (b*b - 4*a*c )/(2*a);
        System.out.println((a-b)/2);
        System.out.println(a*a - b*b);
        System.out.println(a * b - c);
        System.out.println(result);
    }
}
