package ru.netology;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sale + sum;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {

        return calculateSum(sales) / sales.length;
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

    public int lessAverage(int[] sales) {
        int minimumMonth = 0;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                minimumMonth = minimumMonth + 1;
            }
        }
        return minimumMonth;
    }

    public int aboveAverage(int[] sales) {
        int maxMonth = 0;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                maxMonth = maxMonth + 1;
            }
        }
        return maxMonth;
    }
}