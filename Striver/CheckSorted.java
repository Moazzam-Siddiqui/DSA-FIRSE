package Striver;

// public class CheckSorted{
//     public static  boolean sol(int[] arr){
//         for(int i = 0; i < arr.length;i++ ){
//             for(int j = i +1; j < arr.length;j ++){
//                 if(arr[j] < arr[i]){
//                     return false;
//                 }
//             }
//         }return true;
//     }
//     public static void main(String[] args) {
// int[] arr = {1,3,4,6,8};
// int[] arr2 = {9,3,4,7,8};
// System.out.println(sol(arr));
// System.out.println(sol(arr2));
//     }
// }
public class CheckSorted {

    public static boolean sol(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8};
        int[] arr2 = {9, 3, 4, 7, 8};

        System.out.println(sol(arr));
        System.out.println(sol(arr2));
    }
}
