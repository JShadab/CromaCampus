import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';

import { Employee } from './Employee';
import { catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  baseUrl = 'http://localhost:3000/emploayees1';

  constructor(private httpClient: HttpClient) { }

  getEmployeeData(): Employee[] {
    let data = [
      { "id": 101, "name": "Krishna", "age": 25, "salary": 1100 },
      { "id": 102, "name": "Ram", "age": 41, "salary": 8975 },
      { "id": 103, "name": "Sita", "age": 43, "salary": 4700 },
      { "id": 104, "name": "Musa", "age": 36, "salary": 9999 }
    ];

    return data;
  }
  getEmployeeDataFromJSON(): Observable<Employee[]> {
    const filePath = '/assets/emp_db.json';
    return this.httpClient.get<Employee[]>(filePath);
  }
  getEmployeeDataFromAPI(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.baseUrl)
      .pipe(catchError(err => this.handleError(err)));
  }
  private handleError(error: HttpErrorResponse) {
    console.log(error);    
    return throwError(() => new Error(error.message 
      || 'Something went wrong'));
  }

  saveEmployee(emp: Employee): Observable<Employee> {
    // Call POST API to SAVE emp
    return this.httpClient.post<Employee>(this.baseUrl, emp, {});
  }
  editEmployee(emp: Employee) {
    // Call PUT API to update emp
    let editUrl = this.baseUrl + '/' + emp.id;
    return this.httpClient.put<Employee>(editUrl, emp);
  }

  deleteEmployee(empId: number) {
    // Call DELETE API to delete an emp
    let deleteUrl = this.baseUrl + '/' + empId;
    return this.httpClient.delete(deleteUrl, {});

  }

 
}
