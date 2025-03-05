//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }


        //
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }


        System.out.println();

        //
        double y = 12000000;
        double dateRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;
        for (int year = 1; year <= 10; year++) {
            double death = y * deathRate;
            double date = y * dateRate;
            y = y + date - death;
            System.out.printf("Год %d, численность населения составляет %,d%n", year, (int) y);
        }


        //
        double totalSecond = 15000;
        int monthSecond = 0;
        double procent = 0.07;

        while (totalSecond <= 12000000) {
            monthSecond++;
            double interest = totalSecond * procent;
            totalSecond += interest;
            if (monthSecond % 6 == 0)
                System.out.printf("Месяц %d, накоплено %.2f%n", monthSecond, totalSecond);

        }


        //
        double totalThird = 15000;
        for (int monthSec = 1; monthSec <= 108; monthSec++) {
            double interest = totalThird * procent;
            totalThird += interest;
            if (monthSec % 6 == 0)
                System.out.printf("Месяц %d, накоплено %.2f%n", monthSec, totalThird);
        }


        //
        int firstFriday = 3;
        int daysInMonth = 31;

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", day);

        }


        //
        int cometPeriod = 79;
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR); // Получаем текущий год
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int year = 0; year <= endYear; year += cometPeriod) {
            if (year >= startYear && year <= endYear) {
                System.out.println(year);

            }
        }
    }
}