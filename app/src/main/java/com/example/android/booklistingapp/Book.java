package com.example.android.booklistingapp;

public class Book {
    private String Title;
    private String Auther;
    public Book(String Title, String Auther)
    {
        this.Title = Title;
        this.Auther = Auther;
    }
    public String getAuther() {
        return Auther;
    }
    public String getTitle() {
        return Title;
    }
}
