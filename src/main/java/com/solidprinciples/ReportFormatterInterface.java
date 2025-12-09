package com.solidprinciples;


// OCI PRINCIPLE - Interface Segregation Principle - Segregating the report formatting functionality into its own interface 

public interface ReportFormatterInterface {
    String format(java.util.List<java.util.List<String>> data);
}
