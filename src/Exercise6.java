import java.util.Arrays;

class Exercise6 {

    public static void main(String[] args) {


        int[] arr1 = {15,25,41,99,35,66};
        int[] arr2 = {55,53,10,12,99,49,15,36,41};
        System.out.println(Arrays.toString(findIntersection(arr1, arr2)));
    }

    public static int[] findIntersection(int[] a, int[] b) {
        int index = 0;
        int j = 0;
        int[] temp = new int[a.length];
        while (index < a.length && j < a.length) {
            if (!isStranger(a, b, j)) {
                temp[index] = a[j];
                j++;
                index++;
            } else {
                j++;
            }
        }
        int[] fixedSize = new int[index];
        for (int k = 0; k < index; k++)
            fixedSize[k] = temp[k];

        return fixedSize;
    }

            public static boolean isStranger ( int[] a, int[] b, int val){
                for (int i : b) {
                    if (i == a[val]) {
                        return false;
                    }
                }
                return true;
            }

}