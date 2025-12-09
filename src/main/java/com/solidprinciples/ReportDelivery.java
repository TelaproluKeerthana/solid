package com.solidprinciples;

import java.util.List;

class EmailReportDelivery implements ReportSender {
    
    @Override
    public void send(String reportTitle, String content, List<String> recipients) {
        System.out.println("-> [Delivery Layer] Sending report via EMAIL...");
        System.out.println("   - Subject: " + reportTitle);
        System.out.println("   - Recipients: " + String.join(", ", recipients));
        System.out.println("   - Content (Excerpt): " + content.substring(0, Math.min(content.length(), 100)) + "...");
        System.out.println("-> EMAIL Report sent successfully.");
    }
}

class FtpReportDelivery implements ReportSender {

    @Override
    public void send(String reportTitle, String content, List<String> recipients) {
        System.out.println("-> [Delivery Layer] Sending report via FTP...");
        System.out.println("   - Report Title: " + reportTitle);
        System.out.println("   - Recipients (FTP Users): " + String.join(", ", recipients));
        System.out.println("   - Content (Excerpt): " + content.substring(0, Math.min(content.length(), 100)) + "...");
        System.out.println("-> FTP Report sent successfully.");
    }
    
}

