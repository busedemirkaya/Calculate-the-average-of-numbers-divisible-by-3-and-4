import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int a=0,b=0,c=0;
       double avg;
       Scanner inp = new Scanner(System.in);
       System.out.println("Enter Number: ");
       a = inp.nextInt();
       for (int i=0;i<=a;i++) {
           if ((i%3==0) && (i%4==0)) {
               c += i;
               b++;


           }

       }
       avg = c / (b-1);
       System.out.println("Result: "+avg);
    }
}