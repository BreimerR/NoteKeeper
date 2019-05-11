package com.gmail.brymher.notekeeper.adapters;

import android.support.annotation.Nullable;

public class Note {
    // The course owning the course
    private CourseInfo course;
    // Title of the notes.
    private String title;
    // Content inside the note
    private String text;

    Note(@Nullable CourseInfo course, @Nullable String title, @Nullable String text) {
        setTitle(title);
        setCourse(course);
        setText(text);
    }

    public void setCourse(CourseInfo course) {
        this.course = course;
    }

    public CourseInfo getCourse() {
        return course;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    private String getCompareKey() {
        return course.getId() + "|" + title + "|" + text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        return getCompareKey().equals(note.getCompareKey());
    }

    @Override
    public int hashCode() {
        return getCompareKey().hashCode();
    }

    @Override
    public String toString() {
        return getCompareKey();
    }
}
