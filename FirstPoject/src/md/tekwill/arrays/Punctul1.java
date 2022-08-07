package md.tekwill.arrays;



/** 1. Creati o metoda care primeste un array de int, si un parametru de tip int. Metoda trebuie sa returneze indexul elementului din array
 * ub care se afla valoarea argumentului transmis. Daca asa element nu exista in array, sa returneze -1;
 De ex. daca ii dau metodei un un arr {1,2,3,4,5} si argumentul 4, metoda trebuie sa-mi returneze 3; Daca ii dau ca argument 100, sa-mi returneze -1;*/

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
