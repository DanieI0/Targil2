import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {
        int[] arr = {1,5,2,2,0,4,1};
        System.out.println(Arrays.toString(removeDupes(arr)));
    }

    public static int[] removeDupes(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!contains(temp, arr[i], j)) {
                temp[j] = arr[i];
                j++;
            }
        }
        int[] fixedSize = new int[j];
        for(int i = 0; i < j; i++)
            fixedSize[i] = temp[i];
        return fixedSize;
    }

    public static boolean contains(int[] arr, int value, int size) {
        for(int i = 0; i < size; i++)
            if(arr[i] == value) {
                return true;
            }
        return false;
    }
}