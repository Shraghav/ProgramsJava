import java.util.ArrayList;

public class MergeSort {
    static void arrayDivide(int[] arr, int low , int high){
        if(low == high) return;
        int mid = (low+high)/2;
        arrayDivide(arr,low,mid);
        arrayDivide(arr,mid+1,high);
        mergeArray(arr,low,mid,high);
    }
    static void mergeArray(int[] arr,int low,int mid,int high){
        ArrayList <Integer> temp = new ArrayList();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,7,86,76,25,17};
        int low = 0;
        int high = arr.length-1;
        arrayDivide(arr, low, high);
        for (int i : arr){
            System.out.println(i);
        }
    }
}
