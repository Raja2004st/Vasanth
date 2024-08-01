import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import {RouterModule, Routes  }from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { FormsModule } from '@angular/forms';
const ROUTES: Routes =[
  {path: 'home' , component :HomeComponent},
  {path: 'contact' , component :ContactComponent},
  {path: 'about' , component :AboutComponent},

]
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTES)

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
