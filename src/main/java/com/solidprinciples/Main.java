package com.solidprinciples;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportGenerator rg = new ReportGenerator("financialReports", Arrays.asList("a", "b", "c"));
        
        FinancialDataFetcher fd = new FinancialDataFetcher();
        List<List<String>> data = fd.getFinancialData();

        ReportFormatter rf = new ReportFormatter(rg.getReportName());
        String reportContent = rf.formatAsHtml(data);

        ReportDelivery rd = new ReportDelivery(rg.getRecipients());
        rd.sendViaEmail(reportContent);
    }
}