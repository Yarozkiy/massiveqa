package ru.netology;

public class StatsService {
    public long sum(long [] sales){
        long a = 0;
        for(long sale : sales){
            a += sale;
        }
        return a;
    }

    public long average (long[] sales) {
        long sum = sum(sales);
        return sum / 12;
    }
    public int maxSale (long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] >= sales[maxi]){
                maxi = i;
            }
        }
        return maxi;
    }
    public int aboveAverage(long[] sales) {
        int count =0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}
