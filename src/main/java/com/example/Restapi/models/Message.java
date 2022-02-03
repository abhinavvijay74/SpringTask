package com.example.Restapi.models;

public class Message {
    private String message;
    private long id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SampleResponse{" +
                "message='" + message + '\'' +
                ", id=" + id +
                '}';
    }
}
