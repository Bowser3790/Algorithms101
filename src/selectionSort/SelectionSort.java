package selectionSort;

public class SelectionSort {
    public static void selectionSort(int[] arr){ //[7,4,5,9,8,2,1]
        for(int i = 0; i<arr.length; i++){
            int minIndex = i;
            for(int j= i+1; j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }
            // swapping number with smallest element
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}
