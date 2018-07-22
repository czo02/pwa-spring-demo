import {Component, Input, OnInit} from '@angular/core';
import {Profile} from '../entities/Profile';
import {ProfileService} from '../profile.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {

  @Input()
  private _profile: Profile;

  constructor(private profileService: ProfileService) { }

  ngOnInit() {
  }

  get name(): String {
    return this._profile.name;
  }

  get description(): String {
    return this._profile.description;
  }

  get pictureUrl(): String {
    const url = this._profile.pictureUrl;
    if (!url || url === "") {
      return "assets/img/user.svg";
    }
    return url;
  }

  get likes(): Number {
    return this._profile.likes;
  }

  public like() {
    this.profileService.like(this._profile.name).subscribe((profile: Profile) => {
      this._profile = profile;
    });
  }
}
