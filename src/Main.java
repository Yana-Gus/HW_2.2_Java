public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount = 300;

        int bonus = 0;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        }

        int finalAccount = initialAccount + replenishmentAmount + bonus;
        System.out.println("Итоговый счет: " + finalAccount + "рулей");
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}