import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  public empArr: Employee[] = [];
  errMessage = '';

  constructor(private empService: EmployeeService) { }

  ngOnInit(): void {

    // this.empArr = this.empService.getEmployeeData();
    // this.empService.getEmployeeDataFromJSON().subscribe(data => this.empArr = data);


  }

  getData() {
    this.empService.getEmployeeDataFromAPI()
    .subscribe(data => { this.empArr = data },
      err => { this.errMessage = err });
  }

  postData() {
    let emp = { "id": 201, "name": "Ryan", "age": 29, "salary": 1234.50 }
    this.empService.saveEmployee(emp)
      .subscribe(e => {
        console.log(e);
        this.getData();
      });
  }
  putData() {
    let emp = { "id": 201, "name": "Ryan", "age": 28, "salary": 6789.50 }
    this.empService.editEmployee(emp).subscribe(e => {
      console.log(e);
      this.getData();
    });
  }
  deleteData() {
    let id = 201;
    this.empService.deleteEmployee(id).subscribe(e => {
      console.log(e);
      this.getData();
    });

  }


}
