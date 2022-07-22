var stud1 = { name: 'Abc', age: 21, course: 'Java' }
var stud2 = { name: 'Kbc', age: 19, course: 'Html' }
var stud3 = { name: 'Xyz', age: 25, course: 'Python' }
var stud4 = { name: 'Pqr', age: 22, course: 'Node' }

var arr = [stud1, stud2, stud3, stud4]

console.log('Before Sorting:');
console.log(arr);

// arr.sort(function (s1, s2) {
//     return s1.age - s2.age
//   })

arr.sort(function (s1, s2) {
    return s1.name.localeCompare(s2.name)
  })

console.log('After Sorting:');
console.log(arr);