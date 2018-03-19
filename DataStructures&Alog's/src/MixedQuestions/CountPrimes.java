package MixedQuestions;

/**
 * Created by kunal on 3/19/18.
 * Description:

 Count the number of prime numbers less than a non-negative number, n.
 */



public class CountPrimes {


    /*Approaches:
    * i) Brute Force : Every elemnt with every i
    * ii) By limiting our iteraton to sqrt since it should be less than sqrt of number to be divisible or( sqr<n)
    * iii)  We know all prime numbers are odd except even. so we handle number 2 case explicitly and iterate over only odd numbers and check if there squares(or run the loop till half of the n) are divisible and are prime and increase counter
    * iv) Perfect for counting like in this if use boolean array and already consider halfo the elements as prime. Other half are not prime since they are even except 2.
    * We iterate only over odd composites and mark them as true and decrease the counter. The remaining counter value are number of primes.
    * to find the odd composites we can use = 2i+i(sincd odd + even =odd and i = odd here). We need not do the same for even as we arleady have count=n/2.
    *
    */


    //Approach 2:
//    public int countPrimes(int n) {
//        int count=0;
//        boolean notPrime  = false;
//        if(n>2) count++;
//        for(int i=3;i<n;i+=2){
//            for(int j=2;j*j<i+1;j++){
//                notPrime  = false;
//                if(i%j==0){
//                    notPrime=true;;
//                    break;
//                }
//            }
//            if(!notPrime) count++;
//        }
//
//        return count;
//
//
//    }


    //Approach 4:
    public int countPrimes(int n) {

        if(n<3) return 0;
        int count = n/2;

        //Boolean array
        boolean a [] = new boolean[n];

        for(int i=3;i*i<n;i+=2){
            if(a[i]) continue; // Meaning this is composite and we marked as true below
            for(int j = i*i ;j<n;j+=2*i){
                if(!a[j]){
                    a[j]=true;
                    count--;
                }
            }


        }
      return count;


    }

    public static void main(String[] args) {
        CountPrimes p = new CountPrimes();
        System.out.println(p.countPrimes(1000));
    }



}
