package junit.lab;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberLab {

    public List<Integer> getPrimeNumbersBetween(int lowerBound, int upperBound){

        List<Integer> primes = new ArrayList<>();

        for(int i = lowerBound; i <= upperBound; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(int number){

        for (int i = 2; i < number; i++){

            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
