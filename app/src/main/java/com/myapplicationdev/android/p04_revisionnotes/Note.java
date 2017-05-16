package com.myapplicationdev.android.p04_revisionnotes;

public class Note {

	//What's here?

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    private String noteContent;
    private int stars;

    public Note(String noteContent, int stars) {
        this.noteContent = noteContent;
        this.stars = stars;
    }

}
