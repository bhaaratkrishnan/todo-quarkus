package org.acme;

public class TodoModel {
    private int id;
    private String title;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TodoModel(int id, String title, boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

}
