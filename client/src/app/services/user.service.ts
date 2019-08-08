import { Injectable } from '@angular/core'; // nos permite definir los sercvicio y poder inyectarlos
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from '../../../node_modules/rxjs';
// import { Observable } from 'D:/Productos_Quipux/Accenture/accentureregisterbank/client/node_modules/rxjs';
import { GLOBAL } from './global';
import { User } from '../models/user';

@Injectable()
export class UserService {
  public url: string;
  public identity;
  public token;
  public stats;

  constructor(public _http: HttpClient) {
    this.url = GLOBAL.url;
  }

  /**
   * Sercice to register user in the system
   * @param user
   */
  register(user: User): Observable<any> {
    console.log(user);
    const params = JSON.stringify(user);
    const headers = new HttpHeaders().set('Content-Type', 'application/json');
    return this._http.post(this.url + 'register', params, { headers: headers });
  }


  /**
   * Service to validate identification od  the user
   * @param identification
   */
  validateIdentification(identification) {
    return this._http.get<any>(this.url + 'validateIdentification?identification=' + identification);
  }

}
