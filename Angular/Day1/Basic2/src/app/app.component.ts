import { Component, input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  flag:boolean;
  arr:string[];
  select1:string;
  style:{};
  myclass:string;
  constructor()
  {
    this.select1="";
   this.flag=true;
   this.arr=["Raja","Suje","Karthi"];
   this.style={'width':'50%','border':'2px solid black','border-radius':'10px'};
   this.myclass="myclass1";
  }
  change()
  {
   this.flag=! this.flag;
  }
  select(v:string)
  {
    this.select1=v;
  }
   changestyle()
   {
    this.style={'width':'50%','border':'2px solid green','border-radius':'10px'};
   }
}

