
const body = document.querySelector('body')

const thinBorder = "1px solid black";
const thickBorder = "3px solid blue";

var currentCell = null;
let x = 1;
let y = 1;
function onPageLoad() {
    createUI();

    applyThickBorder();

}

function createUI() {
    createTable();
    createButtons();
}
function createTable() {

    const table = document.createElement('table');

    table.style.border = "1px solid black";
    table.style.borderCollapse = "collapse";

    const headerRow = document.createElement('tr')

    const headerCol1 = document.createElement('th')
    headerCol1.innerHTML = "HEADER-1"
    headerCol1.style.border = thinBorder;

    const headerCol2 = document.createElement('th')
    headerCol2.innerHTML = "HEADER-2"
    headerCol2.style.border = thinBorder;

    const headerCol3 = document.createElement('th')
    headerCol3.innerHTML = "HEADER-3"
    headerCol3.style.border = thinBorder;

    const headerCol4 = document.createElement('th')
    headerCol4.innerHTML = "HEADER-4"
    headerCol4.style.border = thinBorder;


    headerRow.appendChild(headerCol1);
    headerRow.appendChild(headerCol2);
    headerRow.appendChild(headerCol3);
    headerRow.appendChild(headerCol4);

    table.appendChild(headerRow);

    /********************************/

    for (let i = 1; i < 4; i++) {

        const row1 = document.createElement('tr')

        const col11 = document.createElement('td')
        col11.innerHTML = i + ",1"
        col11.id = i + ",1"
        col11.style.border = "1px solid black";

        const col12 = document.createElement('td')
        col12.innerHTML = i + ",2"
        col12.id = i + ",2"
        col12.style.border = "1px solid black";

        const col13 = document.createElement('td')
        col13.innerHTML = i + ",3"
        col13.id = i + ",3"
        col13.style.border = "1px solid black";

        const col14 = document.createElement('td')
        col14.innerHTML = i + ",4"
        col14.id = i + ",4"
        col14.style.border = "1px solid black";

        row1.appendChild(col11);
        row1.appendChild(col12);
        row1.appendChild(col13);
        row1.appendChild(col14);

        table.appendChild(row1)
    }

    /********************************/



    body.appendChild(table)


}
function createButtons() {
    body.appendChild(document.createElement('br'))

    const btnUp = document.createElement('button');
    btnUp.innerHTML = 'UP';
    btnUp.onclick = goUP;

    const btnDown = document.createElement('button');
    btnDown.innerHTML = 'DOWN';
    btnDown.onclick = goDOWN;

    const btnRight = document.createElement('button');
    btnRight.innerHTML = 'RIGHT';
    btnRight.onclick = goRIGHT;

    const btnLeft = document.createElement('button');
    btnLeft.innerHTML = 'LEFT';
    btnLeft.onclick = goLEFT;

    const btnMark = document.createElement('button');
    btnMark.innerHTML = 'MARK';
    btnMark.onclick = markCell;


    body.appendChild(btnUp)
    body.appendChild(btnDown)
    body.appendChild(btnRight)
    body.appendChild(btnLeft)
    body.appendChild(btnMark)

}

function applyThickBorder() {
    if (currentCell) {
        currentCell.style.border = thinBorder;
    }
    currentCell = document.getElementById(x + "," + y);
    currentCell.style.border = thickBorder;
}

function goUP() {
    if (x == 1) {
        return;
    }
    x = x - 1;

    applyThickBorder()
}
function goDOWN() {
    if (x == 3) {
        return;
    }
    x = x + 1;
    applyThickBorder()
}
function goRIGHT() {
    if (y == 4) {
        return
    }
    y = y + 1;
    applyThickBorder()
}
function goLEFT() {
    if (y == 1) {
        return
    }
    y = y - 1;
    applyThickBorder()
}
function markCell() {
    currentCell.style.backgroundColor = 'yellow'
}