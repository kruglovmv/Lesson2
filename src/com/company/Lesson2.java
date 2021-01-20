package com.company;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson2 {


        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            int arrayNumber[] = {2, 2, 2, 1, 2, 2, 10, 1};
            System.out.println(task6(arrayNumber));
            int dimenshion = new Random().nextInt(21)+1;
            int[] arrayNumber2 = new int[dimenshion];
            for (int i = 0; i < dimenshion; i++) {
                arrayNumber2[i] = new Random().nextInt(101) - 50;
            }
            int count =new Random().nextInt(250)-125;;
            task7(arrayNumber2,count);
        }

        public static void task1() {
            int dimenshion = new Random().nextInt(20)+1;
            int[] array = new int[dimenshion + 1];
            System.out.println("Task №1");
            System.out.println("Инициализация массива, состоящего из " + array.length + " элементов, и смена значений элементов на обратные:");
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextInt(2);
                System.out.print("array[" + i + "] = " + array[i]);
                if (array[i] == 0) array[i] = 1;
                else array[i] = 0;
                System.out.println(" --> " + array[i]);
            }
        }

        public static void task2() {
            System.out.println("Task №2");
            int array[] = new int[8];
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 3;
                switch (i) {
                    case 7:
                        System.out.println(array[i]);
                        break;
                    default:
                        System.out.print(array[i] + ",");
                }
            }
        }

        public static void task3() {
            System.out.println("Task №3");
            int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Исходный массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) array[i] *= 2;
            }
            System.out.println("Измененый массив " + Arrays.toString(array));
        }

        public static void task4() {
            System.out.println("Task №4");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размерность массива");
            int dimension = scanner.nextInt();
            int array[][] = new int[dimension][dimension];
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if ((i == j) || (i + j == dimension - 1)) array[i][j] = 1;
                    else array[i][j] = new Random().nextInt(101) - 50;
                    System.out.print(array[i][j] + "   ");
                }
                System.out.println();
            }
        }

        public static void task5() {
            System.out.println("Task №5");
            int dimenshion = new Random().nextInt(21)+1;
            int[] array = new int[dimenshion];
            int min, max;
            for (int i = 0; i < dimenshion; i++) {
                array[i] = new Random().nextInt(101) - 50;
            }
            System.out.println("Исходный массив: " + Arrays.toString(array));
            min = max = array[0];
            for (int element : array) {
                if (min > element) min = element;
                if (max < element) max = element;
            }
            System.out.println("Минимальный элемент = " + min);
            System.out.println("Максимальный элемент = " + max);
        }

        public static boolean task6(int array[]) {
            System.out.println("Task №6");
            System.out.println("Исходный массив: "+Arrays.toString(array));
            int sum=0;
            for (int i = 0; i < array.length-1; i++) {
                sum+=array[i];
                int sum2 = 0;
                for (int j = i+1; j < array.length; j++) {
                    sum2+=array[j];
                }
                if(sum2==sum) return true;
            }
            return false;
        }
        public static void task7(int array[], int count) {
            System.out.println("Task №7");
            System.out.println("Исходный массив: "+Arrays.toString(array));
            System.out.println("Массив со сдвигом "+count+"("+count% array.length+") :");
            count%= array.length;
            if (count>0)
                for (int i = 0; i < count; i++) {
                    int variable = array[0];
                    array[0] = array[array.length-1];
                    for (int j = 1; j < array.length-1; j++) {
                        array[array.length-j]=array[array.length-j-1];
                    }
                    array[1] = variable;
                } else if(count<0)
                for (int i = 0; i > count; i--) {
                    int variable = array[array.length-1];
                    array[array.length-1] = array[0];
                    for (int j = 1; j < array.length-1; j++) {
                        array[j-1]=array[j];
                    }
                    array[array.length-2] = variable;
                }
            System.out.println(Arrays.toString(array));
        }
    }
