package com.solidprinciples;

// OCI PRINCIPLE - Interface Segregation Principle - Implementing PDF report formatting in its own class

public class PDFReportFormatter implements ReportFormatterInterface {
    private String reportName;

    public PDFReportFormatter(String reportName) {
        this.reportName = reportName;
    }

    @Override
    public String format(java.util.List<java.util.List<String>> data) {
        System.out.println("-> [Formatting Layer] Generating PDF content...");
        StringBuilder pdf = new StringBuilder();
        pdf.append("PDF Report: ").append(this.reportName).append("\n\n");
        
        // Simple table generation
        for (java.util.List<String> row : data) {
            for (String cell : row) {
                pdf.append(cell).append(" | ");
            }
            pdf.append("\n");
        }
        
        return pdf.toString();
    }
    
}
