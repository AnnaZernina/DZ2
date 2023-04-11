public class main {

    public static void main(String[] args) {

        int startingScore = 100; // начальный счет данные входа
        int replenishment = 100; // сумма пополнения
        int bonus = 0; // сумма бонусов
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        system.out.println("Итоговый счет: "startingScore + replenishment + bonus);
    }
}
