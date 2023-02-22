public class Main {

    public static void main(String[] args) {

        int StartingScore = 100; // начальный счет данные входа
        int Replenishment = 100; // сумма пополнения
        int Bonus = 0; // сумма бонусов
        if (Replenishment > 1000) {
            Bonus = Replenishment / 100;
        } else {
            Bonus = 0;
        }
        System.out.println("Итоговый счет: "StartingScore + Replenishment + Bonus);
    }
}
