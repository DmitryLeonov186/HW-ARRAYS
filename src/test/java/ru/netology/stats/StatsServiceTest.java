package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSalesTest() {


        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void averageTest() {


        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSaleMonthTest() {


        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSaleMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSaleMonthTest() {


        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSaleMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityMonthBelowAverageTest() {


        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.quantityMonthBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityMonthAboveAverageTest() {


        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.quantityMonthAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
