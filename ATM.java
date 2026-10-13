
import java.util.Random;

class ATM{
    public static void main(String[]args){
final String firstsix ="123456";

        Random r = new Random();
         int lastFour= 1000 + r.nextInt(9000);
         String pin = firstsix + lastFour;
         System.out.println("ATM PIN:"+ pin );
    }
}








