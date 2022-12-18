public class Main {
    public static void main(String[] args) {
        int ticketPrice = 30_000;//стоимость билета в руб.
        int percentInKopecks = 20;//стоимость одной бонусной мили в руб.

        int miles;  //объявление переменной для количества миль.
        if (ticketPrice < 0) {
            System.out.printf("Стоимость билета не может быть отрицательной"); //условие проверки отрицательной
            // стоимости билета.
        } else if (ticketPrice > 0) {
            miles = ticketPrice / percentInKopecks;//расчет количества миль за покупку билета.
            System.out.printf("Ваше количество миль за покупку билета: " + miles);// Вывод результата расчета на экран.

        }
    }
}