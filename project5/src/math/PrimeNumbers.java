package math;

/**
 * Created by rrt on 7/30/2016.
 */
public class PrimeNumbers {

  public static boolean isPrime(int num){
        for(int j=2; j<num; j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int limit = 1000000, counter =0;
        for(int i=2; i<limit; i++){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers: " + counter);
    }
}
