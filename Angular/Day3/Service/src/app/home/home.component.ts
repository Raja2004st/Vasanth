import { Component } from '@angular/core';
import { CalculateService } from '../calculate.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
sum:number;
fact:number;
constructor(private cal:CalculateService)
{
  this.sum=cal.getAddition(34,22);
  this.fact=cal.getFactorial(5);
}
}
