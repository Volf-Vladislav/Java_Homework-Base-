import java.util.Scanner;
public class Task_3 {
    public static void main (String[] lol) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите колличество столбцов: ");
        int n = sc.nextInt();
        System.out.print("Ведите колличество строк: ");
        int m = sc.nextInt();
        int[][] Matrix = new int [m][n];
        int[][] result = new int[n][m];
        
        System.out.print("Ведите элементы матрицы:" + System.getProperty("line.separator"));
        for(int y = 0; y < m; y++) {
            for(int x = 0; x < n; x++) {
                Matrix[y][x] = sc.nextInt();
            }
        }
        
        for(int y = 0; y < m; y++) {
            for(int x = 0; x < n; x++) {
                result[x][y] = Matrix[y][x];
            }
        }
        System.out.println();
        System.out.println("Транспонированная матрица:");
        for(int y = 0; y < n; y++) {
            for(int x = 0; x < m; x++) {
                System.out.print(result[y][x] + " ");
            }
            System.out.println();
        }       
        
    }
}