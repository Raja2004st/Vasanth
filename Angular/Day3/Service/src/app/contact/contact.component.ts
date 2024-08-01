import { Component } from '@angular/core';
import { CalculateService } from '../calculate.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})
export class ContactComponent {
  sum:number;
  fact:number;
  constructor(private cal:CalculateService)
  {
    this.sum=cal.getAddition(34,22);
    this.fact=cal.getFactorial(7);
  }
  }
  