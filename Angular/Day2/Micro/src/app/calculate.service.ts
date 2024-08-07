import { Injectable } from '@angular/core';
import { stock } from './model/stock';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class CalculateService {
  url:string;
  Arr:stock[];
  st:stock;
constructor(private http: HttpClient) {
 this.url="http://localhost:3004/st";
 this.st=new stock();
 this.Arr=[];

}
insertstock(st:stock)
{
 this.http.post<stock>(this.url,st).subscribe();
 return "Employee Details Added";
}
updatestock(st:stock)
{
 this.http.put<stock>(this.url+"/"+st.id,st).subscribe();
 return "Employee Details Updated";
}
deletestock(Id:number)
{
 this.http.delete<stock>(this.url+"/"+Id).subscribe();
 return "Employee Details deleted";
}
findstock(Id:number)
{
 this.http.get<stock>(this.url+"/"+Id).subscribe(data=> this.st=data);
 return this.st;
}
findallstock()
{
 this.http.get<stock[]>(this.url).subscribe(data=> this.Arr=data);
 return this.Arr;
}
}
