package session1;

public class HelloWorld {

    public static void doSomething(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += 1;
            }
        }

        System.out.println("Array from inside 'doSomething' is....");
        printArray(matrix);
    }

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1) {
                    System.err.println(matrix[i][j]);
                    break;
                }
                System.out.print(matrix[i][j]+"\t"); // escape character - \t => tab
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 36},
            {43, 50, 6},
            {7, 98, 99}
        };

        System.out.println("Array before manipulation...");
        printArray(matrix);

        doSomething(matrix);

        System.out.println("Array after manipulation...");
        printArray(matrix);
    }
}
