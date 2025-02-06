package ru.netology.stats;

public class StatsService {

    public int amountSales(long[] sales) {
        int amount = 0;

        for (long i : sales) {
            amount += (int) i;
        }
        return amount;
    }

    public int averageSales(long[] sales) {
        int amount = 0;

        for (long i : sales) {
            amount += (int) i;
        }
        return amount / sales.length;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverageSales(long[] sales) {
        long amout = 0;

        for (long i : sales) {
            amout += i;
        }

        double average = (double) amout / sales.length;
        int month = 0;

        for (long i : sales) {
            if (i < average) {
                month++;
            }
        }

        return month;
    }

    public int aboveAverageSales(long[] sales) {
        long amout = 0;

        for (long i : sales) {
            amout += i;
        }

        double average = (double) amout / sales.length;
        int month = 0;

        for (long i : sales) {
            if (i > average) {
                month++;
            }
        }

        return month;
    }
}
