public class quicksort {
    public void sort(int [] arr, int low, int high) {
        if (low < high) {
            int pivotindex = partition(arr, low, high);
            sort(arr, low, pivotindex - 1);
            sort(arr, pivotindex + 1, high);
        }
    }
    private int partition(int [] arr, int low , int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String [] args)
    {
        int [] arr={5,2,9,1,5,6};
        quicksort qs=new quicksort();
        qs.sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

            }
        }
    }

