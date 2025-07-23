public class StringMethods {
    public static void main(String[] args) {
        String name = "Ashwitha aaaaaa Reddy Reddy";
        System.out.println(name);

        int value = name.length();
        System.out.println("Length of the String: " + value);

        String lString = name.toLowerCase();
        System.out.println("Converted to Lower Case: " + lString);

        String uString = name.toUpperCase();
        System.out.println("Converted to Upper Case: " + uString);

        // name = name.toLowerCase(); // Here the reference to the variable changes, the original string will remains same
        // System.out.println(name);

        String untrimmed = "     ashwitha Padidham           ";
        System.out.println("UnTrimmed String is: " + untrimmed);

        String trimmed = untrimmed.trim(); // Will remove the extra spaces front and back of the whole sentence.
        System.out.println("Trimmed String is: " + trimmed);
        System.out.println("The Sub String is: " + name.substring(4)); // return a substring starting with index 4 to end
        System.out.println("The Sub String is : " + name.substring(4,10)); // substring starting with 4 and ends with n-1 (10 -1 )
        System.out.println("Replace char:" + name.replace('a', 'r')); // replace all occurances of 'a' with 'r'
        System.out.println("Replace String: " + name.replace("Reddy", "Padidham")); // replace all occurences of Reddy with Padidham
        System.out.println("Starts with: " + name.startsWith("Ash")); //true
        System.out.println("Ends with: " + name.endsWith("Redd")); //false
        System.out.println("Character at: " + name.charAt(2));
        System.out.println("The Index of the letter is: " + name.indexOf("Ashwi")); // index of a's first occurance if no match returns -1
        System.out.println("Other way of using index is: " + name.indexOf("Redd", 17)); // will start searching for that letter fron index 17
        System.out.println("Last Index of: "  + name.lastIndexOf('a')); // start searching from right side & return 1st occurance of a from right
        System.out.println("Another way of Last Index of: " + name.lastIndexOf("Reddy" , 20)); // start searching from the index 20 and goes left

        String str = "Virat Kohli";
        System.out.println("Check Equals: " + str.equals("Virat Kohli")); // It is case sensitive
        System.out.println("Check equals without case sensititve: " + str.equalsIgnoreCase("virat KOHLI"));
        System.out.println("\" escape \r sequence\t characters\f hai hello\" ");

    }
}
