import {Component, Input, OnInit} from '@angular/core';
import {Profile} from '../entities/Profile';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {

  @Input()
  private _profile: Profile;

  constructor() { }

  ngOnInit() {
  }

  get profile(): Profile {
    return this._profile;
  }
}
