package ru.netology.stats;

public class StatsService {

    public long amountSales(long[] sales) {
        long totalSale = 0;

        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        return amountSales(sales) / 12;
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
        long average = averageSales(sales);
        int couter = 0;
        for (long sale : sales) {
            if (sale < average) {
                couter++;
            }
        }
        return couter;
    }

    public int aboveAverageSales(long[] sales) {
        long average = averageSales(sales);
        int couter = 0;
        for (long sale : sales) {
            if (sale > average) {
                couter++;
            }
        }
        return couter;
    }
}
