import { Component, OnInit } from '@angular/core';
import { UserAuthService } from '../services/user-auth.service';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent {

  constructor(private userAuthService: UserAuthService,
    private router: Router,
    public userService:UserService,
    ){}
  public isLoggedIn() {
    return this.userAuthService.isLoggedIn();
  }
}
