
package com.solidprinciples;

// This class only depends on the "save" contract.
public class LocalDiskSaver implements FileSaverInterface {

    @Override
    public String save(String filename, String content) {
        System.out.println("-> [Storage Layer] Saving report to Local Disk...");
        // In a real application, this would write the content to a local file path
        String filePath = "/temp/reports/" + filename + ".html";
        System.out.println("   - Saved to path: " + filePath);
        System.out.println("   - Content size: " + content.length() + " bytes");
        return filePath;
    }
}