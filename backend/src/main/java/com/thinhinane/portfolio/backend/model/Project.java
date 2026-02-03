package com.tinhinane.portfolio.model;

public class Project {

    private Long id;
    private String title;
    private String  nameProject;
    private String description;
    private String techStack;
    private String githubLink;

    public Project() {}

    public Project(Long id, String title, String nameProject, String description, String techStack, String githubLink) {
        this.id = id;
        this.title = title;
        this.nameProject = nameProject;
        this.description = description;
        this.techStack = techStack;
        this.githubLink = githubLink;

    }
    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getnameProject(){ return nameProject;}
    public void setnameProject(String nameProject) { this.nameProject = nameProject;}

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getTechStack() { return techStack; }
    public void setTechStack(String techStack) { this.techStack = techStack; }

    public String getGithubLink() { return githubLink; }
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }
}