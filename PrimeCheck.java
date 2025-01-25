public class PrimeCheck {
    public static boolean isprime(int number){
    if (number<=1){
        return false;
    }
    for (int i=2;i<=Math.sqrt(number);i++){
        if (number % i==0){
            return false;
        }
        
    }
    return true;
}
    public static void main(String[] args){
        int[] testNumber = {3,4,5,15,16,17,25,19,20};
        for (int i=0; i< testNumber.length;i++){
            System.out.println( testNumber[i] + " is prime :"+ isprime(testNumber[i]));
        }
    
    }
}