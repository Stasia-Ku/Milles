public class Main {
    public static void main(String[] args) {
        float ticketPrice = 4990.0f;
        int bonusValue = 20;

        int milles = (int) (ticketPrice / bonusValue);

        System.out.println("Количество бонусных миль: " + milles);
    }
}
