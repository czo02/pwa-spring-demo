import { Component, OnInit } from '@angular/core';
import {ProfileService} from '../profile.service';
import {Profile} from '../entities/Profile';

@Component({
  selector: 'app-profiles-list',
  templateUrl: './profiles-list.component.html',
  styleUrls: ['./profiles-list.component.scss']
})
export class ProfilesListComponent implements OnInit {
  private profiles: Profile[];

  constructor(private profileService: ProfileService) { }

  ngOnInit() {
    this.showProfiles();
  }

  showProfiles() {
    this.profileService.getAllProfiles()
      .subscribe((data: Profile[]) => {
        this.profiles = data;
      });
  }

  getProfiles() {
    return this.profiles;
  }
}
