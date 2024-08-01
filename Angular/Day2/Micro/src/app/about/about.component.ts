import { Component } from '@angular/core';
import { CalculateService } from '../calculate.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
   sum:number;
   constructor(private calc:CalculateService)
   {
    this.sum=calc.getAddition(30,29);
    
   }
}
