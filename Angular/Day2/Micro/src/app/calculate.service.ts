import { Injectable } from '@angular/core';

@Injectable()
export class CalculateService {

  getAddition(a:number,b:number)
  {
    return a+b;
  }
  getSubstarction(a:number,b:number)
  {
    return a-b;
  }
}
