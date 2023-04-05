// *****************************************************************************
// Matrix.java       Author: Michael Robert
//
// Submission for Assignment 3 in CS 114
// *****************************************************************************

public class Matrix {
  //String that resets text color to white when printed
  private final String ANSI_RESET = "\u001B[0m";

  //String that changes text color to yellow when printed
  private final String ANSI_YELLOW = "\u001B[33m";

  //Declare an empty integer matrix container
  private int[][] matrix;

  //Declare an empty integer named matrixSize
  private int matrixSize;

  //----------------------------------------------------------------------------
  //  Constructor: Creates a matrix of a user-specified size full of 0s.
  //----------------------------------------------------------------------------
  public Matrix(int value)
  {
    matrixSize = value;
    matrix = new int[matrixSize][matrixSize];
  }

  //----------------------------------------------------------------------------
  //  Public method to fill the matrix with increasing integers.
  //----------------------------------------------------------------------------
  public void populateMatrix()
  {
    //Number of rows is equal to the user-entered matrixSize
    for(int row = 0; row < matrixSize; row++){
      //Number of columns is equal to the user-entered matrixSize
      for(int col = 0; col < matrixSize; col++){
        //Fill each cell with the proper number, add 1 since indices start at 0
        matrix[row][col] = (row*matrixSize) + col + 1;
      }
    }
  }

  //----------------------------------------------------------------------------
  //  Public method to print the matrix with proper spacing in the console with
  //  the diagonal values highlighted in yellow.
  //----------------------------------------------------------------------------
  public void printMatrix()
  {
    //Return carriage for visual purposes
    System.out.println("");

    //Number of rows is equal to the user-entered matrixSize
    for(int row = 0; row < matrixSize; row++){
      //Add a tab to each new row to indent entire matrix
      System.out.print("\t");

      //Number of columns is equal to the user-entered matrixSize
      for(int col = 0; col < matrixSize; col++){
        //The row and column of diagonal numbers add up to the size minus 1
        if(row+col == matrixSize - 1){
          //Make any following text yellow
          System.out.print(ANSI_YELLOW);
        }
        //Print number in the current cell with a width of 2 and 2 spaces after
        System.out.printf("%4d ", matrix[row][col]);
        //Reset the text color back to the default white
        System.out.print(ANSI_RESET);
      }

      //Return carriage after each row
      System.out.println();
    }
    //Return carriage after the matrix has fully printed
    System.out.println();
  }

  //----------------------------------------------------------------------------
  //  Public method to calculate the rows and columns of the two matrix cells
  //  that need to be swapped with each other.
  //----------------------------------------------------------------------------
  public void flipMatrix()
  {
    //Number of rows is equal to the user-entered matrixSize
    for(int row = 0; row < matrixSize; row++){
      //Number of columns is equal to the user-entered matrixSize
      for(int col = 0; col + row < matrixSize; col++){
        //The col # to swap with equals the matrix size minus the col # minus 1
        int swapColIndex = matrixSize - col - 1;
        //The row # to swap with equals the matrix size minus the row # minus 1
        int swapRowIndex = matrixSize - row - 1;
        //Call the swap method with the proper targets as the arguments
        swap(col, row, swapColIndex, swapRowIndex);
      }
    }
  }

  //----------------------------------------------------------------------------
  //  Private method which takes the x and y coordinates of the two cells to
  //  swap as input and swaps them.
  //----------------------------------------------------------------------------
  private void swap(int x1, int y1, int x2, int y2)
  {
    //Declare an integer to temporarily hold a number during the swap
    int tempNumHolder;
    //Follow the process to swap one specified matrix cell with the other
    tempNumHolder = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = tempNumHolder;
  }
}
