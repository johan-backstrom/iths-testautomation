package se.iths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumberImplementation {

    public List<Integer> getNumbersBetween(int lower, int upper){

        if (lower > upper){
            return Collections.emptyList();
        }

        List<Integer> primeNumbers = new ArrayList<>();
        if(isNumberPrimeNumber(lower)) {
            primeNumbers.add(lower);
        }

        primeNumbers.addAll(getNumbersBetween(lower + 1, upper));
        return primeNumbers;
    }

    public boolean isNumberPrimeNumber(int number){
        if(number == 1 || number == 2){
            return true;
        }
        for(int i = 2; i<number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
