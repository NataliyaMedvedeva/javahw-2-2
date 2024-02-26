public class Main {
    public static void main(String[] args) {
        int onAccount = 120;
        int toBalance = 200;

        int result;
        if (toBalance >= 1000) {
            result = onAccount + toBalance + toBalance / 100 * 1;
        } else {
            result = onAccount + toBalance;
        }
        System.out.println("Ваш баланс равен: " + result);
    }
}