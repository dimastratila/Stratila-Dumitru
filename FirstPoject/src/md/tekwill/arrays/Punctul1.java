package md.tekwill.arrays;

public class Punctul1 {



public static int Array(int[] num, int a){
   int k=-1;
   for(int i=0;i<num.length;i++){
       if (num[i]==a){
           k=i;

       }

   }



return k;



}

public static void main(String[] args){

 int[] num = {1,2,3,4};


    System.out.println(Array(num,4));


}
}
