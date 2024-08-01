import { Component } from '@angular/core';
import { CalculateService } from '../calculate.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
  sum:number;
  fact:number;
  constructor(private cal:CalculateService)
  {
    this.sum=cal.getAddition(34,22);
    this.fact=cal.getFactorial(4);
  }
  }
  