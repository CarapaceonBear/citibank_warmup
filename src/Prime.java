
// function (number)
// boolean isPrime
// loop backwards from number:
//   divide number by looping number. If modulus is 0 : ! isPrime
// return isPrime

public class Prime {

    public static boolean checkPrime(int input) {
        for (int i = (input - 1); i > 1; i--) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
