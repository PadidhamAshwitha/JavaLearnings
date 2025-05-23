public class PracticeSet3 {
    public static void main(String[] args){
        String name = "Virat Kohli";
        name = name.toLowerCase();
        System.out.println(name);

        System.out.println(name.replace(' ', '_'));

        String replace = "Dear <|name|> Thankyou for inspiring me";
        replace = replace.replace("<|name|>", "virat");
        System.out.println(replace);

        String stirng = "Hello Viratt  Kohli  ";
        System.out.println(stirng.indexOf("  "));
        System.out.println(stirng.indexOf("   "));

        System.out.println("dear sir, \n\tthankyou \n\t your teaching is good ");
    }
}
