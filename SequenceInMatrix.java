import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SequenceInMatrix {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] matrixSize = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int matrixRows = matrixSize[0];
        int matrixCols = matrixSize[1];
        int currentSequenceLength = 1;
        int bestSequenceLength = 1;
        String[][] matrix = new String[matrixRows][matrixCols];

        for (int i = 0; i < matrixSize[0]; i++) {
            String[] line = reader.readLine().split("\\s+");
            matrix[i] = line;
        }

        //try rows
        for (int row = 0; row < matrixRows; row++) {
            currentSequenceLength = 1;
            for (int col = 0; col < matrixCols - 1; col++) {
                if (matrix[row][col].equals(matrix[row][col+1])) {
                    currentSequenceLength++;
                }
                else {
                    currentSequenceLength = 1;
                }
                if (currentSequenceLength > bestSequenceLength) {
                    bestSequenceLength = currentSequenceLength;
                }
            }
        }
        //try columns
        for (int col = 0; col < matrixCols; col++) {
            currentSequenceLength = 1;
            for (int row = 0; row < matrixRows - 1; row++) {
                if (matrix[row][col].equals(matrix[row +1][col])) {
                    currentSequenceLength++;
                }
                else {
                    currentSequenceLength = 1;
                }
                if (currentSequenceLength > bestSequenceLength) {
                    bestSequenceLength = currentSequenceLength;
                }
            }
        }

        //try diagonal to bottom right
        for (int i = 0; i < matrixRows-1; i++) {
            for (int j = 0; j < matrixCols-1; j++) {
                currentSequenceLength = 1;
                for (int row = i, col = j; row < matrixRows - 1 && col < matrixCols - 1; row++, col++){
                    if (matrix[row][col].equals(matrix[row+1][col+1])) {
                        currentSequenceLength++;
                    }
                    else {
                        currentSequenceLength = 1;
                    }
                    if (currentSequenceLength > bestSequenceLength) {
                        bestSequenceLength = currentSequenceLength;
                    }
                }
            }
        }


        //try diagonal to top right
        for (int i = matrixRows - 1; i > 1; i--) {
            currentSequenceLength = 1;
            for (int j = 0; j < matrixCols-1; j++) {

                if (matrix[i][j].equals(matrix[i-1][j+1])) {
                    currentSequenceLength++;
                }
                else {
                    currentSequenceLength = 1;
                }

                if (currentSequenceLength > bestSequenceLength) {
                    bestSequenceLength = currentSequenceLength;
                }
            }
        }
        System.out.println(bestSequenceLength);
    }
}
