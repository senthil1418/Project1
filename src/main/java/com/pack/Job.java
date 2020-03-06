package com.pack;

public class Job {

    private String name;

    public Job(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                '}';
    }
}
