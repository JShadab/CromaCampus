import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dynamic-table',
  templateUrl: './dynamic-table.component.html',
  styleUrls: ['./dynamic-table.component.css']
})
export class DynamicTableComponent implements OnInit {

  allEmps = [
    {
      "name": "Abc",
      "age": "25",
      "salary": "1100"
    }, {
      "name": "Kbc",
      "age": "43",
      "salary": "4700"
    }, {
      "name": "Kbc",
      "age": "43",
      "salary": "4700"
    }];

  constructor() { }

  ngOnInit(): void {
  }

  addRow(): void {

    let e = {
      "name": "papa", "age": "60", "salary": "778899"
    };

    this.allEmps.push(e);

  }
  removeRow(): void {

    let e = this.allEmps.pop();
    console.log(e);


  }

}
