import Solutions.ArraySort;

public class Main {
    public static void main(String[] args) {

        int[] nums = {23, 1, 34, 43, 6, 0, -32, 21, -21};

        ArraySort objArraySort = new ArraySort();
        int[] sortedArray = objArraySort.getSortedArray(nums);
        System.out.println("Sorted array is : ");
        for (int i = 0; i < sortedArray.length; i++) {
                System.out.print(sortedArray[i] + " ");
        }
    }
}
