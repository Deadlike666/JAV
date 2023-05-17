import bubbleSort.BubbleSort;

public class BinSearch {
    public static void main(String[] args){
        int[] Array = {1,5,8,7,1,3,5,26,46,71,2,3,34,71,54,2,11,34};
        Disply(Array);
        BubbleSort(Array);
        Disply(Array);
    }
    private static double search(int[] arr,int left,int right,int value){
        if(left>right){
            return -1;
        }
        int mid = left + (right-left)/2;
        if(value==arr[mid]){
            return mid;
        }
        else if(value>arr[mid]){
            return search(arr,mid,right,value);
        }
        else if(value<arr[mid]){
            return search(arr,left,mid,value);
        }
        return 0;
    }
    private static void BubbleSort(int[] arr){
        int i,j,k,t;
        for(i=0;i<arr.length-1;i++){
            k = i;
            for(j=i+1;j< arr.length;j++){
                if(arr[k]>arr[j]) k = j;
            }
            if(k!=i){
                t = arr[i];
                arr[i] = arr[k];
                arr[k] = t;
            }
        }
    }
    private static void Disply(int[] arr){
        System.out.println("The Array after BubbleSort:");
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
