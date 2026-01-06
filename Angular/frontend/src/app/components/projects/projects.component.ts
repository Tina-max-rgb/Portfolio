import { Component } from '@angular/core';
import { ProjectService } from '../../services/project.service';

@Component({
  selector: 'app-projects',
  imports: [],
  templateUrl: './projects.component.html',
  styleUrl: './projects.component.css'
})
export class ProjectsComponent {
  projects: any [] = [];
  constructor (private projectService:ProjectService){}
  ngOnInit():void{
    this.projectService.getProjects().subscribe(data =>{
      this.projects = data;
    });
  }
}
