package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }


    public int calculateAvg(int[] sales) {
        int avg = calculateSum(sales) / sales.length;
        return avg;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minMonthSalesAvg(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale <= calculateSum(sales) / sales.length) {
                month = month + 1;
            }
        }
        return month;
    }

    public int maxMonthSalesAvg(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale >= calculateSum(sales) / sales.length) {
                month = month + 1;
            }
        }
        return month;
    }
}
