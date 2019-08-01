import java.util.Scanner;

public class PoolingArray {
    public static void createArr(int[] arr, int size, int index) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a element of array " + index + " ,index " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void listArr(int[] arr, int index) {
        System.out.print("\nList array " + index + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2;
        int[] arr1, arr2, arr3;
        do {
            System.out.print("Enter a size 1: ");
            size1 = sc.nextInt();
            System.out.print("Enter a size 2: ");
            size2 = sc.nextInt();
            if (size1 > 20 || size2 > 20) {
                System.out.println("Size 1 or size 2 does not exceed 20");
            }
        } while (size1 > 20 || size2 > 20);

        //tao array 1
        arr1 = new int[size1];
        createArr(arr1, size1,1);

        //tao array 2
        arr2 = new int[size2];
        createArr(arr2, size2,2);

        //tao array 3 kich thuoc bang 2 array tren, gop 2 array, in ra
        arr3 = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        listArr(arr1, 1);
        listArr(arr2, 2);
        listArr(arr3, 3);
    }
}
