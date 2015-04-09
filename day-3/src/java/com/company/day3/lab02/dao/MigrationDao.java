package com.company.day3.lab02.dao;

import java.io.File;

public interface MigrationDao {

    boolean alreadyMigrated(String fileName);

    void migrate(File sql);

    void migrate(String folderName);

}
