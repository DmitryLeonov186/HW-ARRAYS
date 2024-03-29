package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long totalSale = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long averageSale = sumSales(sales) / 12;
        return averageSale;
    }

    public int maxSaleMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] <= sales[i]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int minSaleMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] >= sales[i]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int quantityMonthBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int quantityMonthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}

