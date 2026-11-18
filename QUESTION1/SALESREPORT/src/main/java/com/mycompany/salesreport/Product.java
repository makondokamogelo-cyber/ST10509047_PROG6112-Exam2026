package com.mycompany.salesreport;

public class Product implements IProduct {
    // 1D Array for product names
    private String[] productNames;
    // 2D Array for sales data [products][months]
    private int[][] salesData;

    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int totalSales = GetTotalProductsSold();
        int totalEntries = salesData.length * salesData[0].length;
        return (double) totalSales / totalEntries;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int popularIndex = 0;

        for (int i = 0; i < salesData.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }
            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                popularIndex = i;
            }
        }
        
        // Returns the name and total sales 
        return productNames[popularIndex] + "(" + maxSales + ")";
    }
    
    
    public String[] getProductNames() {
        return productNames;
    }

    public int[][] getSalesData() {
        return salesData;
    }
}