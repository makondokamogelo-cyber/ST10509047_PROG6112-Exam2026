package com.mycompany.salesreport;

import java.util.Scanner;

public class SALESREPORT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Initialize the 1D Array for product names
        String[] productNames = {
            "Cozy Nights Monarch mattress", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress"
        };
        
        // 2. Initialize the 2D Array for sales data [3 products][3 months]
        int[][] salesData = new int[3][3];

        // 3. Gather input matching the screenshot format
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
            System.out.println(); // Add a blank line after each product's 3 months
        }

        // 4. Create the Product object
        Product product = new Product(productNames, salesData);
        
        // 5. Create the PrintProduct object and print the report
        PrintProduct printer = new PrintProduct();
        printer.displayReport(product);
        
        scanner.close();
    }
}