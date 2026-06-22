package Striver;

// Brute Force

// import java.util.Arrays;

// class solution{
//     public int LarEle(int[] arr){

//         Arrays.sort(arr);

//         return arr[arr.length -1];
//     }
// }

// public class LargestElement {
//     public static void main(String[] args){
//         int[] arr = {2, 5, 1, 3, 0};
//         int[] arr1 = {8, 10, 5, 7, 9};

//         solution S = new solution();
//         System.out.println(S.LarEle(arr));
//         System.out.println(S.LarEle(arr1));

//     }
// }



class LARELE{
    int solution(int arr[], int n){
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            
            if( max < arr[i]){
                max = arr[i];
            }
        }return max;
    


    }

}


public class LargestElement{

    public static void main(String[] args){

        int[] arr = {2, 5, 1, 3, 0};
        int size = 5;
        int[] arr1 = {8, 10, 5, 7, 9};

        LARELE L = new LARELE();

        System.out.println(L.solution(arr, size));
        System.out.println(L.solution(arr1, size));
        
    }
}