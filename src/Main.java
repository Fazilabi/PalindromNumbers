public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            System.out.println("last number - " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("reversenumber - " + reverseNumber);
            temp = temp / 10;
            System.out.println("tempNumber - "+temp);
            System.out.println("**********");
        }
        if (number == reverseNumber)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(929));
    }
}