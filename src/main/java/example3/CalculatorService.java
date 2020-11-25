package example3;

public class CalculatorService {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public int add(int firstDigit, int secondDigit){
        return firstDigit + secondDigit;
    }
    public int subtract(int firstDigit,int secondDigit){
        return firstDigit - secondDigit;
    }
    public int multiply(int firstDigit,int secondDigit){
        return firstDigit * secondDigit;
    }
    public int divide(int firstDigit,int secondDigit){
        return firstDigit / secondDigit;
    }
    public int findMax(int masyvas[]){
        int maxValue = masyvas[0];
        for (int i = 0; i<masyvas.length; i++){
            if(maxValue < masyvas[i]){
                maxValue = masyvas[i];
            }
        }
        return maxValue;
    }



}
