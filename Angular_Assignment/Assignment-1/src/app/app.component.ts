import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
private firstNo:number=null;
private secondNo:number=null;
private result:number=null;

public add():number{
  this.result=this.firstNo + this.secondNo;
  return this.result;
}
public sub():number{
  this.result=this.firstNo-this.secondNo;
  return this.result;
}
public multiply():number{
  this.result=this.firstNo*this.secondNo;
  return this.result;
}
public divide():number{
  this.result=this.firstNo/this.secondNo;
  return this.result;
}
}
