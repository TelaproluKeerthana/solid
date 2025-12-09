package com.solidprinciples;

import java.util.Arrays;
import java.util.List;

// made the code to follow all the 5 SOLID principles - Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion    
public class Main {
    public static void main(String[] args) {
        String reportName = "Q4 Financial Summary";
        List<String> recipients = Arrays.asList("a@corp.com", "b@corp.com");
        
         
        DataFetcher concreteFetcher = new FinancialDataFetcher(); 
        ReportFormatterInterface pdfFormat = new PDFReportFormatter(reportName);
        ReportSender emailSender = new EmailReportDelivery(); 

        ReportProcessor processor = new ReportProcessor(concreteFetcher, pdfFormat, emailSender);
        
        processor.generateAndDeliver(reportName, recipients);
        
    }
}