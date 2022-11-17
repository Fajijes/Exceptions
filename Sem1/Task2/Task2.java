package Sem1.Task2;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task2 {
    public static void main(String  args[]) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {1,2,3,4};
        int [] arrDif= difOfArr(arr1,arr2);
        System.out.println(Arrays.toString(arrDif));
    }

    private static int[] difOfArr(int[] arr1, int[] arr2) {
        if (arr1== null || arr2 == null){
            throw new RuntimeErrorException(null, "Some array is null");
        }
        if (arr1.length!=arr2.length){
            throw new RuntimeErrorException(null, "Arrays length ins`t equal");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr1[i]-arr2[i];
            
        }
        return arr;
    }
    
}
