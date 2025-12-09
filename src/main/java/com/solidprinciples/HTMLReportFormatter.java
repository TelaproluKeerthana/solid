package com.solidprinciples;

// OCI PRINCIPLE - Interface Segregation Principle - Implementing PDF report formatting in its own class

public class HTMLReportFormatter implements ReportFormatterInterface {
    private String reportName;

    public HTMLReportFormatter(String reportName) {
        this.reportName = reportName;
    }

    @Override
    public String format(java.util.List<java.util.List<String>> data) {
        System.out.println("-> [Formatting Layer] Generating HTML content...");
        StringBuilder html = new StringBuilder();
        html.append("<html><body>");
        html.append("<h1>").append(this.reportName).append("</h1>");
        
        // Simple table generation
        html.append("<table border='1'>");
        for (java.util.List<String> row : data) {
            html.append("<tr>");
            for (String cell : row) {
                html.append("<td>").append(cell).append("</td>");
            }
            html.append("</tr>");
        }
        html.append("</table>");
        
        html.append("</body></html>");
        return html.toString();
    }

}
