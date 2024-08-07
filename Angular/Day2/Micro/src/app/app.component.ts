import { NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { CalculateService } from './calculate.service';
import { stock } from './model/stock';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Micro';
Arr:stock[];
 st:stock;
   result:string;
   flag:boolean=false;
    constructor(private service:CalculateService)
    {
        this.st=new stock(); 
        this.result="";
        this.Arr=[];
  
        
    }
    insertstock(data:any)
    {
      this.st.id=data.Id;
      this.st.rate=data.rate;
      this.st.count=data.count;
      //alert(data.empId+" "+data.empName+" "+data.empSalary);
     this.result=this.service.insertstock(this.st);
    }
    updatestock(data:any)
    {
      this.st.id=data.Id;
      this.st.rate=data.rate;
      this.st.count=data.count;
      //alert(data.empId+" "+data.empName+" "+data.empSalary);
     this.result=this.service.updatestock(this.st);
    }
    deletestock(data:any)
    {
      
     this.result=this.service.deletestock(data.Id);
    }
    findstock(data:any)
    {
      
     this.st=this.service.findstock(data.Id);
     this.result=this.st.id+" "+this.st.rate+" "+this.st.count;
     
    }
    findallstock(data:any)
    {
      
     this.Arr=this.service.findallstock();
    this.flag=true;
     
    }
  }