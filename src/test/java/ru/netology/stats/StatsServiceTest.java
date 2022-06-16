package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService result = new StatsService();
        int[] sales = {8, 15, 25, 8, 26, 18, 66, 78, 0, 4};
        int methodResult = result.calculateSum(sales);
        int excepted = 248;
        assertEquals(excepted, methodResult);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService result = new StatsService();
        int[] sales = {8, 15, 25, 8, 26, 18, 66, 78, 0, 4};
        int methodResult = result.calculateAvg(sales);
        int excepted = 24;
        assertEquals(excepted, methodResult);
    }

    @Test
    void shouldMaxSales() {
        StatsService result = new StatsService();
        int[] sales = {8, 15, 25, 8, 26, 78, 66, 78, 0, 4};
        int methodResult = result.maxSales(sales);
        int excepted = 8;
        assertEquals(excepted, methodResult);
    }

    @Test
    void shouldMinSales() {
        StatsService result = new StatsService();
        int[] sales = {8, 15, 25, 8, 26, 78, 66, 78, 0, 4};
        int methodResult = result.minSales(sales);
        int excepted = 9;
        assertEquals(excepted, methodResult);
    }

    @Test
    void shouldMinSalesAvg() {
        StatsService result = new StatsService();
        int[] sales = {8, 15, 25, 8, 26, 78, 66, 78, 0, 4};
        int methodResult = result.minMonthSalesAvg(sales);
        int excepted = 7;
        assertEquals(excepted, methodResult);
    }

    @Test
    void shouldMaxSalesAvg() {
        StatsService result = new StatsService();
        int[] sales = {8, 15, 25, 8, 26, 78, 66, 78, 0, 4};
        int methodResult = result.maxMonthSalesAvg(sales);
        int excepted = 3;
        assertEquals(excepted, methodResult);
    }
}
