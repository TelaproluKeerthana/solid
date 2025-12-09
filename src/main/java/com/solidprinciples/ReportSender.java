package com.solidprinciples;

import java.util.List;

public interface ReportSender {
    void send(String reportTitle, String content, List<String> recipients);
}
