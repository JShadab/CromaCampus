
const body = document.querySelector("body");

const table = document.createElement('table')
table.style.border = "1px solid red";
table.style.borderCollapse = "collapse";
table.style.width = "80%";

const data = [
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


addHeaderRow(table);
addDataRow(table);

body.appendChild(table)


function addHeaderRow(table) {
    const headerRow = document.createElement('tr')

    const headerCol1 = document.createElement('th')
    headerCol1.innerHTML = "NAME"
    headerCol1.style.border = "1px solid red"

    const headerCol2 = document.createElement('th')
    headerCol2.innerHTML = "AGE"
    headerCol2.style.border = "1px solid red"

    const headerCol3 = document.createElement('th')
    headerCol3.innerHTML = "SALARY"
    headerCol3.style.border = "1px solid red"

    headerRow.appendChild(headerCol1);
    headerRow.appendChild(headerCol2);
    headerRow.appendChild(headerCol3);

    table.appendChild(headerRow);
}

function addDataRow(table) {

    for (emp of data) {
        const dataRow = document.createElement('tr')

        const col1 = document.createElement('td')
        col1.innerHTML = emp.name;
        col1.style.border = "1px solid red"

        const col2 = document.createElement('td')
        col2.innerHTML = emp.age;
        col2.style.border = "1px solid red"

        const col3 = document.createElement('td')
        col3.innerHTML = emp.salary;
        col3.style.border = "1px solid red"

        dataRow.appendChild(col1);
        dataRow.appendChild(col2);
        dataRow.appendChild(col3);

        table.appendChild(dataRow);
    }

}
