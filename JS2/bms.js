const books = []

function main(){
    let operation = prompt('Which operation You want to perform [add | delete | list | exit]');

    while(operation != 'exit'){

        if(operation == 'add'){
            addBook();
        }
        else if(operation == 'delete'){
            deleteBook();
        }
        else if(operation == 'list'){
            listBooks();
        }else{
            console.log('Are u crazy!!!!');
        }

        operation = prompt('Which operation You want to perform [add | delete | list | exit]');
    }
}

function addBook() {
    let bookName = prompt('Enter a book name');
    books.push(bookName)
}

function deleteBook() {
    let bookName = prompt('Enter a book name');

    const index = books.indexOf(bookName);

    if (index == -1) {
        console.log('Specified book is not available');
    }
    else {
        books.splice(index, 1);
        console.log('Specified book is deleted');
    }
}

function listBooks() {

    for (book of books) {
        console.log(book);
    }

}

