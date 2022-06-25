package ru.netology;

public class StatsService {
    public long sum(long[] sales) {  //Сумма всех продаж средняя
        long a = 0;
        for (long sale : sales) {
            a += sale;
        }
        return a;
    }

    public long average(long[] sales) { //Сумма продаж в месяц
        long sum = sum(sales);
        return sum / 12;
    }

    public int maxSale(long[] sales) { //месяц с максиалььным оборотом
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    public int minSales(long[] sales) { //Месяц с минимальным оборотом
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long lowerAverage(long[] sales) {  //Месяцы в которых продажи были ниже среднего
        long a = average(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < a) {
                numberMonth++; //счетчик
            }
        }
        return numberMonth;
    }

    public long upperAverage(long[] sales) {  //Месяцы в которых продажи были выше среднего
        long a = average(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale > a) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}