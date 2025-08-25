import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{49,27,32,18,1,11,22,44};
        System.out.println(Arrays.toString(bubblesort(a)));
    }

     public static int[]  bubblesort(int[] a) {
        boolean check = true;
        while(check){
            check=false;
            for(int i=0; i<a.length-1; i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    check=true;
                }
            }

        }
        return a;
    }

    public static int[] selectionsort(int[] a){

        return a;
    }
}
