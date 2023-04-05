// *****************************************************************************
// RunMatrix.java       Author: Michael Robert
//
// Submission for Assignment 3 in CS 114
// *****************************************************************************

//Import scanner library
import java.util.Scanner;

public class RunMatrix {
  // ---------------------------------------------------------------------------
  //  Construct, populate, and flip a matrix based on user-input
  // ---------------------------------------------------------------------------
  public static void main(String[] args) {

    //Construct a new scanner called input
    Scanner input = new Scanner(System.in);

    //Prompt the user for the size of the matrix
    System.out.print("\n\n\tPlease enter the desired size of the matrix: ");

    //Store the user-entered integer in an integer named matrixWidth
    int matrixSize = input.nextInt();

    //Confirm the matrix dimension
    System.out.printf("\n\n\tThe size of your matrix is %d x %d\n\n",
      matrixSize, matrixSize);

    //Construct and print matrix with a user-specified size
    System.out.println(
      "\n\tPrinting your newly constructed, zero filled matrix...");
    Matrix matrix = new Matrix(matrixSize);
    matrix.printMatrix();

    //Populate and re-print matrix
    System.out.println("\n\tPopulating and re-printing your matrix...");
    matrix.populateMatrix();
    matrix.printMatrix();

    //Flip and re-print matrix
    System.out.println("\n\tFlipping and re-printing your matrix...");
    matrix.flipMatrix();
    matrix.printMatrix();

    //Closes the scanner to prevent a resource leak
    input.close();
  }
}
