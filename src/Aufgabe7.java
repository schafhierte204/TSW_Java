public class Aufgabe7 {
    public static void main(String[] args){
        int[] zahlen = new int[10];
        for(int i=0;i<10;i++){
            zahlen[i]= (int) Math.round(Math.random()*2+2);
        }
        for(int i=0;i<10;i++){
            System.out.print(" "+zahlen[i]);
        }
    }
}
