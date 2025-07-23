public class Array {
    public static void main(String[] args){
        int [] marks = new int [5]; // 1. declare and memory allocate
        marks [0] = 10;            // initialize
        marks [1] = 20;
        marks [2] = 30;
        marks [3] = 40;
        marks [4] = 50;
        System.out.println(marks [4]);
        int [] total ;              // 2. declare and then allocate memory
        total = new int[5];
        int [] array = {10, 20, 30, 40}; // 3. declare memory allocate and initialize
        System.out.println(array[3]);
        System.out.println(marks.length);
        System.out.println("Printing marks using for loop:");
        for (int i =0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing marks using for loop in reverse order: ");
        for (int i= marks.length -1; i>=0; i-- ){
            System.out.println(marks[i]);
        }
        System.out.println("Printing marks using for-each loop: ");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
