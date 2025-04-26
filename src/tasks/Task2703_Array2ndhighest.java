package tasks;

public class Task2703_Array2ndhighest {
    public static void main(String[] args) {
        int[] a={1,2,5,6,7,9,65};
                int temp=0;
                for(int i=0;i<a.length;i++) {
                    for (int j = i; j < a.length; j++) {
                        if (a[i] > a[j]) {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                        }
                }
                    for (int k = 0; k < a.length; k++) {
                        System.out.println(a[k]);
                    }
        System.out.println("second highest "+a[a.length-2]);
    }
}
