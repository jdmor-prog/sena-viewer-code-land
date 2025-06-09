package models;

import java.util.Date;

public class Magazine extends Publication {
    private int id;

    public Magazine(String title, String editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ":: MAGAZINE ::" +
                "\n Title: " + getTitle() +
                "\n Id: " + getId() +
                "\n Edition Date: " + getEditionDate() +
                "\n Editorial: " + getEditorial();
    }
}