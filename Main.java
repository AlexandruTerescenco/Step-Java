public class Main {

   public static void main(String[] args) {
      //1. Declarați o variabilă de tip int și atribuiți-i o valoare.
      int num0 = 6;
      //2. Declarați o variabilă de tip double și atribuiți-i o valoare.
      double db = 3.6;
      //3. Declarați o variabilă de tip boolean și atribuiți-i o valoare.
      boolean alive = true;
      //4. Declarați o variabilă de tip String și atribuiți-i o valoare.
      String str = "Word";

      //5.  Declarați două variabile int și efectuați o adunare între ele.
      int num1 = 5;
      int num2 = 15; 
      System.out.println(num1+num2);
      
      //6. Declarați două variabile int și efectuați o scădere între ele.
      System.out.println(num1-num2);
      //7. Declarați două variabile int și efectuați o înmulțire între ele.
      System.out.println(num1*num2);
      //8. Declarați două variabile int și efectuați o împărțire între ele.
      System.out.println(num2/num1);
      //9. Declarați o variabilă int și o variabilă double și efectuați o conversie de la int la double.
      int n3 = 7;
      double dd = (double)n3;
      System.out.println(dd);

      //10. Declarați o variabilă double și efectuați o conversie de la double la int.
      double d = 4.4;
      int n4 = (int)d;
      System.out.println(n4);

      //11. Declarați o variabilă de tip int și efectuați incrementarea cu 1.
      System.out.println(++n4);

      //12. Declarați o variabilă de tip int și efectuați decrementarea cu 1.
      System.out.println(--num2);

      //13. Declarați o variabilă de tip double și efectuați rotunjirea la întreg.
      double f = 3.4;
      f += 0.5;
      int fi = (int)f;
      System.out.println(fi);

      //14. Declarați o variabilă de tip double și efectuați extragerea părții întregi in alta variabila.
      double x = 4.9;
      int s = (int)x;
      System.out.println(s);

      //15. Declarați o variabilă de tip int și verificați dacă este pară sau impară.
      System.out.println(num0%2);
   }

}