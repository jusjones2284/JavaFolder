import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        String card = "Jack";
        int currentTotalValue = 15;

        int currentValue = switch (card){
            case "Jack", "Queen", "King" -> 10;
            case "Ace" -> {

                if (currentTotalValue < 11){
                    yield 11;
                } else {
                    yield 1;
                }

            }
            default -> Integer.parseInt(card);
        };




    }
}