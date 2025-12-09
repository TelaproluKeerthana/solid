package com.solidprinciples;

import java.util.List;

public class ReportDelivery {
    private List<String> recipients;
    public ReportDelivery(List<String> recipients) {
        this.recipients = recipients;
        
    }

    public void sendViaEmail(String content) {
        System.out.println("-> [Delivery Layer] Sending report via email...");
        System.out.println("   - Subject: Daily Financial Report");
        System.out.println("   - Recipients: " + String.join(", ", this.recipients));
        // In a real application, this would use a Mail API
        System.out.println("   - Content (Excerpt): " + content.substring(0, Math.min(content.length(), 100)) + "...");
        System.out.println("-> Report sent successfully.");
    }
    
}
