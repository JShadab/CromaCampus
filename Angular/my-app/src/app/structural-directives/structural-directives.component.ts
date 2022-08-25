import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {

  isShow = true;
  day = 9;

  colors = ['red', 'green', 'blue', 'pink', 'orange', 'violet', 'yellow', 'black']

  constructor() { }

  ngOnInit(): void {
  }

  showHide(): void {
    this.isShow = !this.isShow;
  }

}
