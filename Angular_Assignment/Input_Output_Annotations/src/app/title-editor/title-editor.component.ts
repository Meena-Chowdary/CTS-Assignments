import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';


@Component({
  selector: 'app-title-editor',
  templateUrl: './title-editor.component.html',
  styleUrls: ['./title-editor.component.css']
})
export class TitleEditorComponent implements OnInit {
  @Input() //parent wants to pass it's data to child
  webTitle:string;
  //when child wants to send data to parent
  @Output() //when button is clicked another event is happening and i.e. titleChanged
  titleChanged:EventEmitter<string>; //one who can emit a event which must be used by parent
  constructor() { 
    this.titleChanged=new EventEmitter<string>();
  }

  ngOnInit() {
  }
  notifyTitleChanged(){  //emiting event along with changed value
    this.titleChanged.emit(this.webTitle); //new event is titleChanged
  }
}
