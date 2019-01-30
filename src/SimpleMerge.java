/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {

        int size = arr1.length + arr2.length;
        int[] Array = new int[size];
        for (int i=0;i<arr1.length;i++)
        {
            Array[i] = arr1[i];
        }


       for (int j=0; j<arr2.length;j++)
        {
            Array[j+arr1.length] = arr2[j];
        }

        quickSort(Array,0,Array.length-1);
return Array;


    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left<right)
        {
            int pivot = Partition(arr,left,right);

            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    public static int Partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;

        for (int j = left; j <right;j++)
        {
            if (arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
