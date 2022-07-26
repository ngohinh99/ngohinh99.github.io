public class Bai2 {
    public static void main(String[] args) {
        int primeCount = 0;
        int primeTotal = 0;
        int num = 2;
        while(primeCount <= 100){
            if (num ==2){
                primeCount= 2;
                primeTotal = primeTotal + primeCount;
                System.out.print(primeCount+ " + ");
                num++;
                continue;
            }
            boolean isPrime = true;
            for(int i = 2; i <= num / 2; i++){
                int temp = num % i;
                if(temp == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                primeCount = num;
                if (num < 100 ){
                    primeTotal= primeTotal + primeCount;
                    System.out.print(primeCount+ " + ");
                }
                
            }
            num++;
        }
        System.out.print("= "+ primeTotal);        
    }
}
