import java.util.Scanner;
import java.util.Random;
public class Main{

    static void main(){
        while(true){
            Scanner in = new Scanner(System.in);
            while (true) {
                System.out.println("Введите номер");
                int choice = in.nextInt();
                switch (choice) {
                    case 1: {
                        int[] array = new int[10];
                        for (int i = 0; i < array.length; i++) {
                            array[i] = (int)(Math.random() * 21);
                        }

                        System.out.print("Массив: ");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();

                        int sum = 0;
                        for (int i = 0; i < array.length; i += 2) {
                            sum += array[i];
                        }
                        System.out.println("Сумма четных позиций: " + sum);
                        break;
                    }
                    case 2: {
                        int size = 5;
                        int[][] matrix = new int[size][size];

                        for (int i = 0; i < size; i++) {
                            for (int j = 0; j < size; j++) {
                                matrix[i][j] = (int) (Math.random() *10)+1;
                            }
                        }

                        System.out.println("Матрица первоначально:");
                        for (int i = 0; i < size; i++) {
                            for (int j = 0; j < size; j++) {
                                System.out.print(matrix[i][j] + " ");
                            }
                            System.out.println();
                        }

                        for (int i = 0; i < size; i++) {
                            matrix[i][size - 1 - i] = matrix[i][size - 1 - i] * matrix[i][size - 1 - i];
                        }

                        System.out.println("Матрица после возведения диагонали в квадрат:");
                        for (int i = 0; i < size; i++) {
                            for (int j = 0; j < size; j++) {
                                System.out.print(matrix[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    default:
                        in.close();
                        break;
                }
            }
        }}}