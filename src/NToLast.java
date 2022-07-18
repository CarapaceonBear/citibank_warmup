
// function (string, number) {
// split() string by whitespace
// splitArray.length - number = index
// return splitArray.get(index)

public class NToLast {

    public static String findWord(String input, int number) {
        String[] splitArray = input.split(" ");
        int index = splitArray.length - number;
        return splitArray[index];
    }
}
