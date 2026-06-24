// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
// package Striver;
// import java.util.Arrays;
// public class SecondLargestElement {
//     public static int Solution(int[] arr) {
//         int nig = arr.length;
//         Arrays.sort(arr);
//         for (int i = nig - 2; i >= 0; i--) {
//             if (arr[i] != arr[nig - 1]) {
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr1 = {12, 35, 1, 10, 34, 1};
//         int[] arr2 = {10, 5, 10};
//         int[] arr3 = {10, 10, 10};
//         System.out.println(Solution(arr1));
//         System.out.println(Solution(arr2));
//         System.out.println(Solution(arr3));
//     }
// }
package Striver;

public class SecondLargestElement {

    static int solu(int[] arr) {
        int max = -1;
        int secmax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (secmax < arr[i] && arr[i] != max) {
                secmax = arr[i];
            }
        }
        return secmax;

    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 7, 3};
        System.out.println(solu(arr));

    }
}
