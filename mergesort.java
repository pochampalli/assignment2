public class mergesort {
    public static void main(String[] args) {
        int[] A = {9, 1, 4, 14, 4, 15, 6};
        int n = 7;
        printArray(A, n);
        mergeSort(A, 0, 6);
        printArray(A, n);
    }

    public static void printArray(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] A, int mid, int low, int high) {
        int i = low, j = mid + 1, k = low;
        int[] B = new int[100];

        while (i <= mid && j <= high) {
            if (A[i] < A[j]) {
                B[k] = A[i];
                i++;
                k++;
            } else {
                B[k] = A[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            B[k] = A[i];
            k++;
            i++;
        }

        while (j <= high) {
            B[k] = A[j];
            k++;
            j++;
        }

        for (int p = low; p <= high; p++) {
            A[p] = B[p];
        }
    }

    public static void mergeSort(int[] A, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(A, low, mid);
            mergeSort(A, mid + 1, high);
            merge(A, mid, low, high);
        }
    }
}