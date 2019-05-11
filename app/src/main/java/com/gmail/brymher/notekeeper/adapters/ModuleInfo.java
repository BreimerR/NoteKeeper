package com.gmail.brymher.notekeeper.adapters;

public class ModuleInfo {

    private String id;

    private String title;

    private boolean complete = false;

    ModuleInfo(String id, String title) {
        this.id = id;
        this.title = title;

    }

    String getId() {
        return id;
    }


    String getTitle() {
        return title;
    }

    boolean isComplete() {

        return false;
    }

    void setComplete(boolean complete) {
        this.complete = complete;
    }
}
