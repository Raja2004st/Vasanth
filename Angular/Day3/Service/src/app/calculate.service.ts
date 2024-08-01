import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculateService {

  getAddition(a:number,b:number)
  {
    return a+b;
  }
  getSubstarction(a:number,b:number)
  {
    return a-b;
  }
  getFactorial(a:number)
  {
    let v=1;
    for(let i=1;i<=a;i++)
    {
      v=v*i;
    }
    return v;
  }
}
