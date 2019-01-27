
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] lol) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите колличество столбцов первой матрицы: ");
        int n1 = sc.nextInt();
        System.out.print("Введите колличество строк первой матрицы: ");
        int m1 = sc.nextInt();
        int[][] Matrix1 = new int[m1][n1];
        
        System.out.print("Введите элементы первой матрицы: " + System.getProperty("line.separator"));
        for(int i = 0; i < m1; i++) {
		    for(int j = 0; j < n1; j++) {
                Matrix1[i][j] = sc.nextInt();
		    }
		}
		System.out.println();
		System.out.println();
		
        System.out.print("Введите колличество столбцов второй матрицы: ");
        int n2 = sc.nextInt();
        System.out.print("Введите колличество строк второй матрицы: ");        
        int m2 = sc.nextInt();
        int[][] Matrix2 = new int[m2][n2];
        
        System.out.print("Введите элементы второй матрицы: " + System.getProperty("line.separator"));
        for(int i = 0; i < m2; i++) {
		    for(int j = 0; j < n2; j++) {
                Matrix2[i][j] = sc.nextInt();
		    }
		}
		
        int m = Matrix1.length;
        int n = Matrix2[0].length;
        int o = Matrix2.length;
        int[][] res = new int[m1][n2];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += Matrix1[i][k] * Matrix2[k][j]; 
                }
            }
        }
        
        System.out.println();
        System.out.println("Произведение матриц:");
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}