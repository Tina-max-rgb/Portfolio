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
    return List.of(
        new Project(1L, "Portfolio",
            "Mon portfolio personnel",
            "Java, Angular",
            "",
            "https://github.com/"),

        new Project(2L, "Blog",
            "Blog pour partager mes projets",
            "Spring Boot, Angular",
            "",
            "https://github.com/")

    );
}

}
