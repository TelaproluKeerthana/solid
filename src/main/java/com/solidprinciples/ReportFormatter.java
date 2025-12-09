package com.solidprinciples;

import java.util.List;

public class ReportFormatter {
    private String reportName;

    public ReportFormatter(String reportName) {
        this.reportName = reportName;
    }

    public String formatAsHtml(List<List<String>> data) {
        System.out.println("-> [Formatting Layer] Generating HTML content...");
        StringBuilder html = new StringBuilder();
        html.append("<html><body>");
        html.append("<h1>").append(this.reportName).append("</h1>");
        
        // Simple table generation
        html.append("<table border='1'>");
        for (List<String> row : data) {
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
