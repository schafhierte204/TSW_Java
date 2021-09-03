public class Aufgabe6 {
    public static void main(String[] args)
    {
       int[] tage = {31,28,31,30,31,30,31,31,30,31,30,31};
       System.out.println("Die Tage in den einzelnen Monaten:");
       System.out.println("----------------------------------");
       for(int i = 1;i<=12;i++)
       {
           System.out.print("Monat "+i+":");
           for(int j=1;j<=tage[i-1];j++)
           {
               System.out.print(" "+j);
           }
           System.out.println();
       }

    }
}
