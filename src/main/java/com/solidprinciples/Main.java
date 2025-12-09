package com.solidprinciples;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportGenerator rg = new ReportGenerator("financialReports", Arrays.asList("a", "b", "c"));
        
        FinancialDataFetcher fd = new FinancialDataFetcher();
        List<List<String>> data = fd.getFinancialData();

        ReportFormatterInterface rf = new HTMLReportFormatter(rg.getReportName());
        String reportContent = rf.format(data);
        
        ReportDelivery rd = new ReportDelivery(rg.getRecipients());
        rd.sendViaEmail(reportContent);

        rf = new PDFReportFormatter(rg.getReportName());
        reportContent = rf.format(data);

        rd.sendViaEmail(reportContent);
    }
}