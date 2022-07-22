const emps = [
    { name: 'Musa', age: 36, salary: 1234.50 },
    { name: 'Amith', age: 36, salary: 1234.50 },
    { name: 'Harshita', age: 36, salary: 1234.50 },
    { name: 'Pooja', age: 36, salary: 1234.50 },
]



const table = document.querySelector('#table');

const headerRow = document.createElement('tr'); // header row

const headerColName = document.createElement('th');
headerColName.innerHTML = 'NAME';

const headerColAge = document.createElement('th');
headerColAge.innerHTML = 'AGE';

const headerColSalary = document.createElement('th');
headerColSalary.innerHTML = 'SALARY';

// add header columns to the header row
headerRow.appendChild(headerColName);
headerRow.appendChild(headerColAge);
headerRow.appendChild(headerColSalary);

table.appendChild(headerRow);


for (let emp of emps) {
    // Now Data Rows
    const row = document.createElement('tr');

    const colName = document.createElement('td');
    colName.innerHTML = emp.name;

    const colAge = document.createElement('td');
    colAge.innerHTML = emp.age;;

    const colSalary = document.createElement('td');
    colSalary.innerHTML = emp.salary;

    // add data columns to the data row
    row.appendChild(colName);
    row.appendChild(colAge);
    row.appendChild(colSalary);

    table.appendChild(row);
}


