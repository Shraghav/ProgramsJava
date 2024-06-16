public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {76,70,98,90,10,9};
        int n = arr.length;
        for (int i=n-1;i>=1;i--){
            for (int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
