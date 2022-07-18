
// function( number) {
// cast int to string, get length = number of digits
// for each (string character)
//  cast back to int, power of (number of digits)
//  add to total
// if total = input number:
// returns true, else false

public class Armstrong {

    public static boolean checkIfArmstrong(int input) {
        String number = Integer.toString(input);
        String[] digits = number.split("");
        int power = digits.length;
        int total = 0;
        for (String digit : digits) {
            total += Math.pow(Double.parseDouble(digit), power);
        }
        return total == input;
    }
}
