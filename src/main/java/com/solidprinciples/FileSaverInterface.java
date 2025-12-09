package com.solidprinciples;

// ISP: A small, role-specific interface for clients that only need to save a file.
public interface FileSaverInterface {
    String save(String filename, String content);
}