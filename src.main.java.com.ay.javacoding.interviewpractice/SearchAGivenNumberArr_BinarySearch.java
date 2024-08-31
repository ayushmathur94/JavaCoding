import java.util.Arrays;

public class SearchAGivenNumberArr_BinarySearch {
    
    public static void main(String[] args) {
        int n = 84;
        int[] arr = {5,84,10,19,12};
        Arrays.sort(arr);
        int result= binarySearch(arr, n);
        if(result == -1){
            System.out.println("Not Found in Array");
        }else {
            System.out.println("element found at index " + result);
        }
    }


    public static int binarySearch(int[] arr, int x){
        int left = 0;
        int right = arr.length-1;

while(left <= right){
int mid = left + (right-left)/2;
if(arr[mid]== x){
    return mid;
} else if (arr[mid]<x){
    left = mid +1;
} else{
    right = mid-1;
}
}
return -1;
}

    
}
