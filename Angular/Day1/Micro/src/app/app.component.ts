import { NgFor } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Micro';
  name:string;
  rate:string;
  number:string;
  a:string[];
  b:string;
  flag:boolean;
  show:boolean;
  cname:string;
  num:string; 
   constructor()
   {
    this.name="";
    this.rate=""; 
    this.number="";
    this.a=[""];
    this.b="";
    this.flag=true;
    this.show=false;      
    this.cname="";
    this.num="";
   }
   save()
   {
    this.b=""; 
     this.b+=this.name+"-";
     this.b+=this.rate+"-";
     this.b+=this.number+"";
     this.a.push(this.b);
   
   }
   update()
   {
         this.flag=!this.flag;
         this.show=true;
   }
   con()
   {
        for(let i=0;i<this.a.length;i++)
        {
          let split=this.a[i].split("-");
           if(split[0]===this.cname){
            this.a[i]=this.cname+"-"+split[1]+"-"+this.num;
           }
          
        }
        
      
   }
}
