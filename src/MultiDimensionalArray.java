public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] flats = {{001, 002, 003}, {101, 102, 103}};
        System.out.println("Printing Flats using for loop");
        for (int i=0; i< flats.length; i++){
            for (int j=0; j<flats[i].length ;j++){
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing Flats using for-each loop: ");
        for(int [] row: flats){     // from flats gets each element as an array in row. {001, 002, 003} {101, 102, 103} as seperate array (row)
            for(int element: row){  // from each array of row takes each element as an element and prints it. 001, 002, 003 as seperate element
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
