package com.mycompany.salesreport;

// JUnit 5 Imports
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    String[] testNames = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
    int[][] testSales = {
        {25, 18, 20}, 
        {15, 10, 12}, 
        {18, 15, 20}  
    }; 
    
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(testNames, testSales);
        int expectedTotal = 153; 
        assertEquals(expectedTotal, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(testNames, testSales);
        double expectedAverage = 17.0; 
        assertEquals(expectedAverage, product.GetAverageProductSold(), 0.01);
    }
}