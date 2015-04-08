package com.company.day2.lab06;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {
    @Override
    public void persistMessage(String msg) {
        throw new DatabaseException("Failed to save msg");
    }
}