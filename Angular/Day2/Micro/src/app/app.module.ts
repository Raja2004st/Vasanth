import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import {RouterModule, Routes  }from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { CalculateService } from './calculate.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
const ROUTES: Routes =[
  {path: 'home' , component :HomeComponent},
  {path: 'contact' , component :ContactComponent},
  {path: 'about' , component :AboutComponent},

]
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [ CalculateService],
  bootstrap: [AppComponent]
})
export class AppModule { }
