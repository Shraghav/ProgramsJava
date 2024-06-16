public class DuplicatesRemove {
    public static void main(String[] args) {
        int val[] = {10,20,30,30,30,30,40,40};
        int j = 0;
        for (int i=0;i<val.length-1;i++){
            if(val[i]!=val[i+1]){
                val[j++] = val[i];
            }
        }
        val[j++] = val[val.length-1];
        for (int i=0;i<j;i++){
            System.out.print(val[i]+" ");
        }
    }
}
