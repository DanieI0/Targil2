public class Exercise5 {
    public static void main(String[] args) {
        int[] array = {1,4,5,4,2};
        System.out.println(checkArray(array));
    }


    public static int checkArray(int[] arr) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            } else break;
        }
        if (index == 0 || index == arr.length-1) {
            return -1;
        }
        return index;
    }
}