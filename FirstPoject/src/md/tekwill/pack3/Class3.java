package md.tekwill.pack3;


/**2. Construiti o clasa si in ea sa aveti o metoda publica care cheama in ea alte 2 metode private.
 *  Apoi din afara pachetului accesati metoda publica. - Apelam metoda publica din Class1*/


public class Class3 {
   public static void publicMethod3(){
privateMethod3();
      System.out.println(privateMethod3());
privateMethod33();
      System.out.println(privateMethod33());
publicMethod33();
      System.out.println(publicMethod33());
   }
   private static int  privateMethod3(){
return 10;
   }
   private static String privateMethod33(){
      return "lei";
   }
   static void defaultMethod3(){

   }
public static String publicMethod33(){
      return "Test";
}
}
