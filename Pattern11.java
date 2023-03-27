public class Pattern11 {
    public static void main(String[] args) {
        int rows = 5;
        
        int[][] triangle = new int[rows][rows];
        
        // Fill in the triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else if (j < i) {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
        }
        
        // Print the triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (triangle[i][j] == 0) {
                    System.out.print("* ");
                } else if (j == 0 || j == i) {
                    System.out.print("a ");
                } else if (j < i) {
                    System.out.print("b ");
                }
            }
            System.out.println();
        }
    }
}