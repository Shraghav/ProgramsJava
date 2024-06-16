public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {40,32,90,76,89,9};
        int n = arr.length;
        for (int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
               j--;
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
