import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = new int[] { 49, 27, 32, 18, 1, 11, 22, 44 };
        System.out.println(Arrays.toString(insertionsort(a)));
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

}
