package com.example.krishbhatia.eduassets.POJO;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String title;
    private ArrayList<ResourcePOJO> resources;

    public Topic() {
    }

    public Topic(String title, ArrayList<ResourcePOJO> resources) {
        this.title = title;
        this.resources = resources;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<ResourcePOJO> getResources() {
        return resources;
    }

    public void setResources(ArrayList<ResourcePOJO> resources) {
        this.resources = resources;
    }
}
