import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
  private allProfilesUrl = 'api/profiles';

  constructor(private http: HttpClient){

  }

  public getAllProfiles() {
    return this.http.get(this.allProfilesUrl);
  }
}
