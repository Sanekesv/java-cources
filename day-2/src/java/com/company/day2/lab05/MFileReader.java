package com.company.day2.lab05;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.File;

public class MFileReader {
    private long fileSize;

    //@Value("${file.path}")
    @Value("file.txt")
    private String path;

    @PostConstruct
    public void postConstruct() {
        File f = new File(path);
        fileSize = f.length();
        System.out.println("Read file: " + fileSize);
    }

    public long getFileSize() {
        return fileSize;
    }
}