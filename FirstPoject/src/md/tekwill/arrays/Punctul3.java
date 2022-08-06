package md.tekwill.arrays;
import java.util.Arrays;

public class Punctul3 {
    public static int[] Array(int[] arr){

        int[] arr2 = new int[arr.length/2];
        int j = 0;
        for (int i=0;i<arr.length;i++) {

            if (arr[i] % 2 == 0) {

                arr2[j]=arr[i];
                    j++;

            }
        }

for (int i=0;i<arr2.length;i++)
    System.out.println(arr2[i]);


        return arr2;
}




    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

    Array(arr);



    }

}
