package com.tinhinane.portfolio.controller;
import com.tinhinane.portfolio.model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
 
@RestController
public class ProjectController {

    @GetMapping("/api/projects")
    public List<Project> getProjects() {
        return Arrays.asList(
                new Project(1L, "Portfolio", "Mon portfolio personnel", "Java, Angular", ""),
                new Project(2L, "Blog", "Un blog pour partager mes projets", "Spring Boot, Angular", ""),
                new Project(3L, "App Mobile", "Application mobile pour gérer mes tâches", "React Native, Firebase", ""),
                new Project(4L, "App Gestion de recette", "Application mobile pour gérer mes recettes", "React Native, Firebase",""),
                new project(5L, "App de gestion de rendez vous", "Application code avec du php"),
                new  project(6L, "App mesagerie securisee avec un chat intelligent", "App codé avec node js et hebergée")
        );
    }
}
