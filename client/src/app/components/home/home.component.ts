import {Component, OnInit} from '@angular/core';
import { UserService } from '../../services/user.service';
import { GLOBAL } from '../../services/global';
import { User } from '../../models/user';
import { Router, ActivatedRoute, Params } from '@angular/router';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  providers: [UserService]
})
export class HomeComponent implements OnInit {
  public title: string;
  public user: User;
  public status: string;

  constructor(private _userService: UserService) {
    this.title = 'Accenture register client test';
    this.user = new User(null, '', '', '');
  }

  ngOnInit() {
    console.log('home.component cargado !!');
  }

  public validateIdentification(identification: string) {
    this._userService.validateIdentification(identification).subscribe(
      response => {
          console.log('response', response);
          if (response.code === 1) {
            console.log('Identification already exist');
          }
        },
        error => {
          if (error.status === 204) {
            let response = new Response();
            response = JSON.parse(error._body);
          }
        }
      );
  }

  onSubmit() {
    this._userService.register(this.user).subscribe(
      response => {
        console.log(response);
        this.status = 'success';
      },
      error => {
        this.status = 'error';
        console.log(<any>error);
      }
    );
  }
}

