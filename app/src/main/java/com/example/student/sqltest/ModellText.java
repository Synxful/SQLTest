package com.example.student.sqltest;

/**
 * Created by student on 20.10.2017.
 */

public class ModellText {
    int _id;
    String text;

    public ModellText() {
    }

    public ModellText(int _id, String text) {
        this._id = _id;
        this.text = text;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
