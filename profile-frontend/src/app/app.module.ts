import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatSidenav, MatSidenavContainer, MatSidenavContent, MatToolbarModule} from '@angular/material';
import {ProfileComponent} from './profile/profile.component';
import {ProfilesListComponent} from './profiles-list/profiles-list.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfilesListComponent,
    ProfileComponent,
    MatSidenav,
    MatSidenavContainer,
    MatSidenavContent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatToolbarModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
