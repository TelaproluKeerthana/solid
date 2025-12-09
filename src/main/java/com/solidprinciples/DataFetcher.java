package com.solidprinciples;

import java.util.List;

// DIP: This is the Abstraction. High-level modules depend on this.
public interface DataFetcher {
    List<List<String>> fetchData();
}