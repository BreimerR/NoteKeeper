package com.gmail.brymher.notekeeper.adapters;

import java.util.List;

public class CourseInfo {

    private String id;

    private String title;

    private List<ModuleInfo> modules;


    public CourseInfo(String id, String title, List<ModuleInfo> modules) {
        this.id = id;
        this.title = title;
        this.modules = modules;
    }


    public List<ModuleInfo> getModules() {
        return modules;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }


    public void setModulesCompletionStatus(boolean[] status) {
        int mSize = modules.size();

        for (int i = 0; i < mSize; i++)
            modules.get(i).setComplete(status[i]);
    }

    boolean[] getModulesCompletionStatus() {
        int mSize = modules.size();

        boolean[] statuses = new boolean[mSize];

        for (int i = 0; i < mSize; i++)
            statuses[i] = modules.get(i).isComplete();

        return statuses;
    }

    public ModuleInfo getModule(String id) {
        for (ModuleInfo module : modules) {
            if (id.equals(module.getId()))
                return module;
        }


        return null;
    }


    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        CourseInfo that = (CourseInfo) obj;


        return id.equals(that.id);
    }
}
