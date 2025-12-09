package com.solidprinciples;

import java.util.List;

public class ReportProcessor {
    DataFetcher concreteFetcher;
     ReportFormatterInterface rf;
     ReportSender rs;

    // performs main business logic for fetching, formatting, saving, and sending reports
    public ReportProcessor(DataFetcher concreteFetcher, ReportFormatterInterface rf, ReportSender rs) {
        this.concreteFetcher = concreteFetcher;
        this.rf = rf;       
        this.rs = rs;
    }

    public void generateAndDeliver(String reportName, List<String> recipients) {
        System.out.println("\n--- Starting Report Processing ---");
        
        List<List<String>> data = concreteFetcher.fetchData();
        String reportContent = rf.format(data);
        rs.send(reportName, reportContent, recipients);

        System.out.println("--- Report Processing Complete ---");
    }
}
