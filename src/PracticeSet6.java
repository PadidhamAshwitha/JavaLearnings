public class PracticeSet6 {
    public static void main(String[] args) {
        System.out.println("---------------Question - 1 --------------------");
        System.out.println("Create an array of 5 floats and calculate their sum: ");
        float [] array = {10.5f, 11.5f, 12.5f, 13.5f, 14.5f};
        float sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println("---------------Question - 2 --------------------");
        System.out.println("Program to find the given integer is present in an array or not");
        float num = 11.5f;
        boolean isInArray = false;
        for(float element: array){
            if (element == num){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The element is present in the array");
        }
        else{
            System.out.println("The element is not present in the array");
        }

        System.out.println("---------------Question - 3 --------------------");
        System.out.println("calculating average marks from an array using for-each loop: ");
        float total = 0;
        for(float element: array){
            total += element;
        }
        float avg = total / array.length;
        System.out.println("The average marks of an array is: " + avg);

        System.out.println("---------------Question - 4 --------------------");
        int [][] matrix1 = {{101, 102, 103}, {201, 202, 203}};  // 2 matrices of size 2 * 3
        int [][] matrix2 = {{101, 102, 103}, {201, 202, 203}};
        int i=0;
        int j=0;
        int [][] matrixSum= {{0, 0, 0}, {0, 0, 0}};
        for (i=0; i<matrix1.length; i++){             // repeats row number of times
            for (j=0; j<matrix1[i].length;j++){       // repeats column number of times
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();                   // prints new line after each row
        }


        System.out.println("---------------Question - 5 --------------------");
        System.out.println("To reverse an array");
        int [] array1 = { 50, 60, 90, 80, 40};
        for(int k = array1.length -1 ; k>=0 ;k--){
            System.out.println(array1[k]);
        }
        System.out.println("-------------Another method for reverse of an array-------------");
        int length = array1.length;
        int mid = Math.floorDiv(length, 2);
        int temp ;
        for (i=0;i<=mid;i++){
            temp = array1[i];
            array1[i] = array1[length-1-i];
            array1[length-1-i] = temp;
        }

        for (i=0;i<=length-1;i++){
            System.out.println(array1[i]);
        }
        System.out.println("---------------Question - 6 --------------------");
        System.out.println("To find the maximum element of the array: ");
        int max = Integer.MIN_VALUE;
        for(int k=0;k<array1.length; k++){
            if (array1[k] > max){
                    max = array1[k];
            }
        }
        System.out.println("The maximum number from the array is: " + max);

        System.out.println("---------------Question - 7 --------------------");
        System.out.println("To find the minimum element of the array: ");
        int min =Integer.MAX_VALUE ;
        for(int k=0;k<array1.length; k++){
            if (array1[k] < min){
                min = array1[k];
            }
        }
        System.out.println("The minimum number from the array is: " + min);
        System.out.println("---------------Question - 8 --------------------");
        System.out.println("To find the array is sorted or not: ");
        boolean isSorted = true;
        for (int k=0; i<array1.length-1; i++){
            if(array1[i]> array1[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
