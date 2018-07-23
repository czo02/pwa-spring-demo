package de.czobel.profileservice.entity;

public class Profile {

    private String name;
    private String description;
    private String pictureUrl;
    private int likes;

    public Profile(String name, String description, String pictureUrl) {
        this.name = name;
        this.description = description;
        this.pictureUrl = pictureUrl;
    }

    public Profile(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public int getLikes() {
        return likes;
    }

    public void addLike() {
        likes++;
    }
}
