package KataCalc;

 public class ArabicNumberCalculation {
     public static String plus (String a, String b) {
         int x = Integer.parseInt(a);
         int y = Integer.parseInt(b);
         if (x<1 || y<1 || x>10 || y>10){
             throw new IllegalArgumentException("Число не от одного до десяти");
         } else return String.valueOf( x+y);
     }


     public static String minus (String a, String b) {
         int x = Integer.parseInt(a);
         int y = Integer.parseInt(b);
         if (x<1 || y<1 || x>10 || y>10){
             throw new IllegalArgumentException("Число не от одного до десяти");
         } else return String.valueOf( x-y);
     }

     public static String umn (String a, String b) {
         int x = Integer.parseInt(a);
         int y = Integer.parseInt(b);
         if (x<1 || y<1 || x>10 || y>10){
             throw new IllegalArgumentException("Число не от одного до десяти");
         } else return String.valueOf( x*y);
     }

     public static String del (String a, String b) {
         int x = Integer.parseInt(a);
         int y = Integer.parseInt(b);
         if (x<1 || y<1 || x>10 || y>10){
             throw new IllegalArgumentException("Число не от одного до десяти");
         } else return String.valueOf( x/y);
     }
}
