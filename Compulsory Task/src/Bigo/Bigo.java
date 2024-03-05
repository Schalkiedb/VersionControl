package Bigo;
import java.util.*;

public class Bigo {

    public static void main(String[] args) {
        // Testing the algorithms
    	//O(n) call
        ArrayList<Integer> bigOlist1 = new ArrayList<>();
        insertElementLinear(bigOlist1, 5);
        System.out.println(bigOlist1);

        //O(n^2) call
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        iterate2DArray(array2D);
        
        //O(log n) call
        ArrayList<Integer> sortedList = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        insertElementSortedList(sortedList, 6);
        System.out.println(sortedList);
    }
    
    // O(n) Algorithm for Sequentially Inserting an Element into a List
    public static ArrayList<Integer> insertElementLinear(ArrayList<Integer> bigO1array, int elementToInsert) {
    	bigO1array.add(elementToInsert);
        return bigO1array;
    }

    // O(n^2) Algorithm for Iterating Over a 2D Array
    // This basically loops through each column and each row and displaying the values
    public static void iterate2DArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Process each element in the 2D array
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // O(log n) Algorithm for Sequentially Inserting an Element into a Sorted List
    //This loops through the array and finds the correct index for the value of 6 which should go after 5
    public static ArrayList<Integer> insertElementSortedList(ArrayList<Integer> sortedList, int elementToInsert) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (sortedList.get(mid) == elementToInsert) {
                // Insert at the middle to maintain order
                sortedList.add(mid, elementToInsert);
                return sortedList;
            } else if (sortedList.get(mid) < elementToInsert) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the element is not found, insert at the correct position
        sortedList.add(left, elementToInsert);
        return sortedList;
    }
}
