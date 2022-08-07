package md.tekwill.arrays;


/** 3. Creati o metoda care primeste un arr de int, si returneaza ul alt array doar cu elementele pare din primul array
 De ex. {1,2,3,4,5,6}, va returna {2,4,6} */

public class Punctul3 {
    public static int[] Array(int[] arr){

        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i=0;i<arr.length;i++) {

            if (arr[i] % 2 == 0) {

                arr2[j]=arr[i];
                    j++;

            }
        }

for (int i=0;i<arr2.length;i++){
    if (arr2[i]==0)
        continue;
    System.out.println(arr2[i]);}


        return arr2;
}




    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

    Array(arr);



    }

}
