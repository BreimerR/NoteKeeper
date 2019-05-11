package com.gmail.brymher.notekeeper.adapters;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager instance = null;

    private List<Note> notes = new ArrayList<>();

    private List<CourseInfo> courses = new ArrayList<>();

    private DataManager() {
        initializeCourses();
        initializeExampleNotes();
    }


    public static DataManager getInstance() {
        if (instance == null) instance = new DataManager();

        return instance;
    }

    public List<CourseInfo> getCourses() {
        return courses;
    }

    public List<Note> getNotes() {
        return notes;
    }

    private void initializeCourses() {


        List<ModuleInfo> ITModules = new ArrayList<>();
        List<ModuleInfo> cyberSecModules = new ArrayList<>();

        courses.add(new CourseInfo("1", "IT", ITModules));
        courses.add(new CourseInfo("1", "Cyber Security", cyberSecModules));
    }


    private void initializeExampleNotes() {
        // Loop through the courses and add notes as we want them to be
    }


    int createNewNote() {
        Note note = new Note(null, null, null);
        notes.add(note);
        return notes.size() - 1;
    }

    int findNote(Note note) {
        int mSize = notes.size();

        for (int i = 0; i < mSize; i++) {
            if (note.equals(notes.get(i))) return i;
        }

        return -1;
    }

    void removeNote(int i) {
        notes.remove(i);
    }

    CourseInfo getCourse(String id) {
        for (CourseInfo course : courses) {
            if (id.equals(course.getId())) {
                return course;
            }
        }


        return null;
    }
}
