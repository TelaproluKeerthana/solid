package com.solidprinciples;

import java.util.Arrays;
import java.util.List;

// DIP: This is the Detail. It implements the Abstraction (DataFetcher).
public class FinancialDataFetcher implements DataFetcher {
    
    @Override
    public List<List<String>> fetchData() { 
        System.out.println("-> [Data Layer] Fetching financial data from database...");
        // Simulate fetching data from a database
        return Arrays.asList(
            Arrays.asList("Date", "Revenue", "Expenses", "Profit"),
            Arrays.asList("2024-01", "$150k", "$80k", "$70k"),
            Arrays.asList("2024-02", "$160k", "$90k", "$70k")
        );
    }
    
    // Note: The original getFinancialData() method can be removed, 
    // or renamed to fetchData() and annotated with @Override.
}