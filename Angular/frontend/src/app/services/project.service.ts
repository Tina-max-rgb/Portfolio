import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {
private apiUrl = 'http://localhost:8080/api/projects';

  constructor(private http: HttpClient) { }
  getProjects(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}

export interface project {
   id:number;
   title:string;
   nameProject:string;
   description:string;
   techStack:string;
   githubLink:string;

}