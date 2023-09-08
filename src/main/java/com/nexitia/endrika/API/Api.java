package com.nexitia.endrika.API;

public class Api {
    private String id;
    private String fileName;

    public String getId() {
        return id;
    }

    public Api() {
    }

    public Api(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
