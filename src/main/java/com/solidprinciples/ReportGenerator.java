package com.solidprinciples;

import java.util.List;

public class ReportGenerator {

    private String reportName;
    private List<String> recipients;

    public ReportGenerator(String reportName, List<String> recipients) {
        this.reportName = reportName;
        this.recipients = recipients;
    }

    public String getReportName(){
        return reportName;
    }

    public List<String> getRecipients(){
        return recipients;
    }
}