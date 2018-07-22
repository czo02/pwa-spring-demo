import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
  private allProfilesUrl = 'api/profiles';
  private likeUrl = 'api/profile/like/';

  constructor(private http: HttpClient){

  }

  public getAllProfiles() {
    return this.http.get(this.allProfilesUrl);
  }

  public like(name: String) {
    return this.http.get(this.likeUrl + name);
  }
}
