import java.util.Arrays;

public class ArraySubset {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {2, 5, 8};

        // sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // use binary search to check if each element of arr2 is present in arr1
        boolean isSubset = true;
        for (int i = 0; i < arr2.length; i++) {
            if (Arrays.binarySearch(arr1, arr2[i]) < 0) {
                isSubset = false;
                break;
            }
        }

        // print the result
        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}
