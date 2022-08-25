import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  public empArr: Employee[] = [];

  constructor(private empService: EmployeeService) { }

  ngOnInit(): void {

    // this.empArr = this.empService.getEmployeeData();
    this.empService.getEmployeeDataFromJSON().subscribe(data => this.empArr = data);
  }


}
