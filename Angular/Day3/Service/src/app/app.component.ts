import { Component } from '@angular/core';
import { CalculateService } from './calculate.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  sum:number;
  title = 'Service';
    constructor(private clac:CalculateService) 
  {
    this.sum=clac.getAddition(49,20);
  }
}
