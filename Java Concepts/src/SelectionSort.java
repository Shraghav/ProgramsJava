public class SelectionSort {
    static void swap(int[] arr, int i, int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {99,34,41,69,10,9};
        for (int i=0;i<arr.length-2;i++){
            int min = i;
            for (int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        for (int num: arr){
            System.out.println(num);
        }
    }
}
