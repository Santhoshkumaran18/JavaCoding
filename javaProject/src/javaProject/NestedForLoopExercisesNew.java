package javaProject;

public class NestedForLoopExercisesNew {
    public static void main(String[] args) {
        int rows = 9; // Adjust this for the height of the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces to align stars to the right
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
