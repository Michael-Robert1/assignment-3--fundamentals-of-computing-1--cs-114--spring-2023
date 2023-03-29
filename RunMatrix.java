import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    Matrix matrix = new Matrix();

    matrix.initiateMatrix(5);

    matrix.populateMatrix();

    matrix.printMatrix();
    matrix.flipMatrix();
    matrix.printMatrix();

  }
}
