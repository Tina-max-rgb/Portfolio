import { Component } from '@angular/core';
import { ProjectService } from '../../services/project.service';
import { NgForOf } from "../../../../node_modules/@angular/common/common_module.d-NEF7UaHr";

@Component({
  selector: 'app-projects',
  imports: [NgForOf],
  templateUrl: './projects.component.html',
  styleUrl: './projects.component.css'
})
export class ProjectsComponent {
[x: string]: any;
  projects: any [] = [];
  constructor (private projectService:ProjectService){}
  ngOnInit():void{
    this.projectService.getProjects().subscribe(data =>{
      this.projects = data;
    });
  }
}
