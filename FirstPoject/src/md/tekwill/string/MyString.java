package md.tekwill.string;


/**  Construiti o metoda care primeste un String. Ca rezultat final il returneaza inversat.
 *  Folositi doar metode din clasa String, fara a folosi StringBuilder sau StringBuffer. */


public class MyString {
    public static String primaryString(String prim){
        String finalString = "";
        for (int i=prim.length()-1;i>=0;i--){
            finalString+=prim.charAt(i);
        }




        return finalString;

    }

    public static void main(String[] args){
        System.out.println(MyString.primaryString("Tekwill"));
    }
}
