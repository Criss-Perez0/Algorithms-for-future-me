import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = new int[] { 49, 27, 32, 18, 1, 11, 22, 44 };
        System.out.println(Arrays.toString(mergesort(a)));
    }

    public static int[] bubblesort(int[] a) {
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    check = true;
                }
            }

        }
        return a;
    }

    public static int[] selectionsort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            
            int index = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[index]) {
                        index = j;
                    }
                }
                int temp = a[i];
                a[i] =a[index];
                a[index]=temp;
        }
        return a;
    }

    public static int[] insertionsort(int[] a){
        for(int i=1; i<a.length; i++){
            int org = a[i];
            int j=i-1;
            while(j>=0 && a[j] >org){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=org;
        }
        return a;
    }

    public static int[] mergesort(int[] a){
        if(a.length<=1){
            return a;
        }
        int middle = a.length/2;
        int[] left = new int[middle];
        int[] right = new int[a.length-middle];
        for(int i=0; i<middle; i++){
            left[i]=a[i];
        }
        for(int i=middle; i<a.length; i++){
            right[i-middle]=a[i];
        }

        left = mergesort(left);
        right=mergesort(right);

        int[] results = new int[a.length];
        int i=0;
        int j=0;
        int m=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                results[m++] = left[i++];
            }
            else{
                results[m++] = right[j++];
            }
        }
        while(i<left.length){
            results[m++] = left[i++];
        }
        while(j<right.length){
            results[m++] = right[j++];
        }
        return results;
    }

}
