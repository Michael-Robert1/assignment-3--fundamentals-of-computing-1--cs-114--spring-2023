import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    Matrix matrix = new Matrix();

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the desired width of the matrix")

    int matrixWidth = input.nextInt();

    matrix.initiateMatrix(matrixWidth);

    matrix.populateMatrix();

    matrix.printMatrix();
    matrix.flipMatrix();
    matrix.printMatrix();

  }
}
