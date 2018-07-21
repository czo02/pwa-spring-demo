package de.czobel.profileservice.entity;

public class Profile {

    private String name;
    private String description;
    private String pictureUrl;

    public Profile(String name, String description, String pictureUrl) {
        this.name = name;
        this.description = description;
        this.pictureUrl = pictureUrl;
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
}
