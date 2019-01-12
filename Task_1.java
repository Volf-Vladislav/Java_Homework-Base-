import java.util.Scanner;
 
public class Task_1 {
    public static void main(String[] lol) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите колличество столбцов и строк: ");
        int n = sc.nextInt();
        System.out.print("Введите элементы матрицы:" + System.getProperty("line.separator"));
        int[][] b = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int mass = b[i][j];
                b[i][j] = b[b.length - 1 - j][b.length - 1 - i];                
                b[b.length - 1 - j][b.length - 1 - i] = mass;                
            }           
        }

        System.out.println();
        System.out.println("Отзеркаленная матрица:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}