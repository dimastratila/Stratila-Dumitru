public class Part2 {

    public static int nrAdunate(int suma){
        suma=0;
        for (int i=0;i<=5;i++){
           suma+=i;
        }
        return suma;

    }


    public static void nrPare(int n){
        for (int i=0;i<=n;i++){
            if (i%2==0)
                System.out.println(i + " - Numar par");
        }

    }

    public static void Afisare(){
        for (int i=0;i<=10;i++)
            System.out.println(i+ " - Hello");
    }


    public static void nrImare(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println(i + " - Numar impar");
        }
    }


    public static void main(String[] args){
        System.out.println("Suma numerelor adunate este: " +nrAdunate(5));
            System.out.println();
        nrPare(10);
             System.out.println();
        Afisare();
             System.out.println();
        nrImare(10);

    }



}
