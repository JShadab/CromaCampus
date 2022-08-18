const friends = ['Lala', 'Arif', 'Adarsh', 'Tushar']

friends.splice(1, 2);

console.log(friends); // ['Lala',  'Tushar']


console.log('--------------Using while loop-------------');

let i = 0;
while (i < friends.length) {
    console.log(friends[i]);
    i++;
}

console.log('--------------Using for loop--------------');

for (let i = 0; i < friends.length; i++) {
    console.log(friends[i]);
}

console.log('--------------Using for-of loop--------------');

for (friend of friends) {
    console.log(friend);
}

console.log('--------------Using forEach method--------------');

//friends.forEach(print);

// function print(element){
//     console.log(element);
// }

friends.forEach(function (element) {
    console.log(element);
});









/*
console.log(friends[0]);
console.log(friends[1]);
console.log(friends[2]);
console.log(friends[3]);
*/
//friends[2]='Mohan';

// console.log(friends);

// friends[6] = 'Abc';

// console.log(friends);

// friends[50] = 'Kbc';

// console.log(friends);

// console.log(friends[11]);

// for (let i = 0; i < friends.length; i++) {
//     console.log(friends[i]);
// }

//console.log(friends[300]);