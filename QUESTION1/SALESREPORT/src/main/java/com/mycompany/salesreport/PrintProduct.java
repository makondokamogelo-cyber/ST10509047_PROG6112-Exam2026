package com.mycompany.salesreport;

public class PrintProduct {
    
    public void displayReport(Product product) {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
        
        
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
        
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}