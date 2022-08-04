package md.tekwill.pack1;
import md.tekwill.pack2.*;
import md.tekwill.pack3.*;

public class Class1 {
    public static void publicMethod1(){

    }
    private static void privateMethod1(){

    }
    static void defaultMethod1(){


    }

    /** 1. Construiti 3 pachete diferite. In fiecare pachet sa aveti cite o clasa cu citeva metode private , default si
        publice. Construiti obiecte in alte pachete si observati rezultatele.*/

    public static void main (String[] args){
        Class2 Class2 = new Class2();
        Class3 Class3 = new Class3();

        Class2.publicMethod2(2);
        Class3.publicMethod3();




//        Class2.defaultMethod2();  - observed that it cannot be accessed from another package
//        Class2.privateMethod2();  - cannot be accessed from another package

    }

}
