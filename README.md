# CromaCampus
Training notes and content 18 July 2022
1. HTML
2. CSS + Bootstrap
3. Java Script 

4. JavaSE
5. Spring Framework

6. React

7. Capstone Project
------------------------------------------
Full Stack Development with Java and Spring

FSD = Frontend + Backend

Web Application:
--------------------
The application which will provide services over the web are called web applications.

Exmple: google.com, github.com, facebook.com

Every web aplication contains 2 main components

1. Frontend 
2. Backend

Frontend technologies:
----------------------
It represents what user is seeing on the website.
We can develop Front-End cnent to using the following technoogies:

1. HTML
2. CSS 
3. JavaScript
4. Frameworks or libraries (Bootstrap | React JS | Angular | Vue JS)

Backend technologies:
----------------------
It is the technology used to decide what to show to the end user on the Front-end.
i.e. Backend is responsible to generate reuired response to the end use, which is displayed by the Front-end.

Back-end has 3 important components:
----------------------------------------
1. The language like Java, Python, Go .....
2. The Framework like Spring, Django, Flask .....
3. The Database like MySQL, Oracle, MongoDB .......

1. Node JS
2. PHP
3. ASP.NET
4. Python with Frameworks(Django, Flask,...)
5. Go lang
6. Java with Spring Framework

Static Resposne VS Dynamic Response:
------------------------------------
If the response is not varied from time to time and person to person 
 then it is cosidered as static response.
 
E.g. 
----
login page of gmail
home page of icici

If the response is varied from time to time and person to person 
 then it is cosidered as dynamic response.
 
E.g. 
----
inbox of gmail
balance page of icici


HTML ( HyperText Markup Language):
---------------------------------
This is the most basic building block of every web application.

Structure of HTML page:
------------------------
Every HTML page contains 2 parts:
1. head : contains meta data lie title of the page, css files and/or javascript files.
2. body : contains actual content.


Example:
----------
<HTML>
	<Head>
	</head>
	
	<BODY>
	</body>
</html>

------------------------------------------------
HTML comments:
--------------
<!-- This is HTML comment, Browser will ignore it -->

HTML headings:
--------------
<h1>, <h2> , ..., <h6>

<h1> This is Heading </h1>

HTML paragraph:
---------------
We can use this tag to represent paragraph of text.

	<p>
		Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur ratione rem aliquid eum. Consectetur, impedit,
		cumque enim labore libero, minus nihil corrupti est ipsum tempora dolorum iusto neque vitae vel tenetur. Neque
		voluptate aperiam magni dignissimos repellat, necessitatibus nulla sapiente reprehenderit sunt, suscipit
		incidunt enim dolores? Quae recusandae vitae architecto!
	</p>

Bold and Italic:
----------------

legacy tags:
============
<b> This is bold text </b>
<i> This is italic text </i>

These are old(legacy) html tags and not recommended to use.

advance tags:
=============
We can use the following HTML5 advance tags for bold and italic

<strong> This is stong(bold) text.</strong>
<em> for emphasis(itatlic) text </em>

HTML List:
----------
There are 2 type of list:

1. ordered list:

	<ol>
		<li>HTML</li>
		<li>CSS</li>
		<li>JavScript</li>
		<li>React</li>
	</ol>

2. unordered list
    <ul>
		<li>HTML</li>
		<li>CSS</li>
		<li>JavScript</li>
		<li>React</li>
	</ul>

HTML table:
------------

	<table border="1">
		<tr>
			<th>NAME</th>
			<th>AGE</th>
			<th>SALARY</th>
		</tr>
		<tr>
			<td>Musa</td>
			<td>36</td>
			<td>1234.50</td>
		</tr>
	</table>
	
Div and Span Tags:
-------------------
We can use div and span tags to group related tags into a single unit.

<div>
	<h1> Group One </h1>
	<p> this division tag helpful to style a group of html tags with css</p>
</div>

<span> tag is exactly same as div tag except that it inline i.e. to define group within the line of text we can use <span> tag

Note: div and span tags are helpful for styling HTML. Hence the will always work with css.

HTML hyperlinks:
-------------------
	<a href="https://www.google.com/" target="_blank">Google</a>
	<a href="https://github.com/JShadab/CromaCampus" target="_blank">Github</a>
	<a href="a.html" target="_blank">A.html</a>

Input Tags:
-----------
Text Field : <input type="text"> <br><br>
Password Field : <input type="password"><br><br>
Number Field : <input type="number"> <br><br>
Email Field : <input type="email"> <br><br>
Range Field : <input type="range"> <br><br>
Calender : <input type="date"> <br><br>
File Browser : <input type="file"><br><br>
    <hr>
Radio Button : Male <input type="radio" name="gender"> 
    | Female <input type="radio" name="gender" checked><br><br>

Check box : Biryani <input type="checkbox" name="food"> | Kabab <input type="checkbox" name="food"> | Shahi Paneer
    <input type="checkbox" name="food"> |<br><br>
    <hr>
DropDown : <select name="" id="">
        <option value="Java">Java</option>
        <option value="Python">Python</option>
        <option value="NodeJS">NodeJS</option>
    </select>
    <hr>
Text Area: <textarea name="" id="" cols="30" rows="10"></textarea>
    <hr>
    Normal Button : <input type="button" value="Button"> |
    Submit Button : <input type="submit"> |
    Reset Button : <input type="reset">

--------------------------------------------------------
Special tags:
--------------
<script>
	All JavaScript goes here...
</script>

<style>
    All CSS goes here..
</style>

------------------------------------
Special Symbols:
----------------
&nbsp;
&copy;
&euro
&dollar
&alpha
---
---

Form Tag:
---------

<form>
  All Input tags
</form>

-----------------------------------------
CSS (Cascading Style Sheet):
----------------------------
The main objective of CSS to add styles to HTML. CSS describes how HTML elements are displayed on a page.
 Styling incluses colors, fonts, size, borders....
 
We can define CSS tyling inside HTML. But it is highly recommended to define styling inside a separate CSS file(.css)
and link to HTML

Various way to define style for HTML elements:
---------------------------------------------------
1. In line CSS (by using style attribute)
2. Internal CSS (by using style tag)
3. External CSS (by using css file)

1. In Line CSS:
---------------
<h1 style="color:red;"> This is heading </h1>

2. Internal CSS:
---------------
<head>
	<style>
	  h1{
		color:red;		
		}
	</style>
</head>

1. External CSS:
---------------
<head>
 <link rel="stylesheet" href="myStyle.css">
</head>

How to write css comments:
-----------------------------
/*  This is CSS comments  */

CSS Color:
-----------
1. color : red;
2. color : rgb(244, 66, 220);
3. color : #f44e42
4. color : rgb(244, 66, 220, 0.5);
The allowed value for alpha attribute is 0.0 to 1.
1 means full dark.
0 means full light

CSS Background Color:
---------------------

body{
 background-color : cyan;
}

CSS Background Image:
---------------------

body{
   background-image: url('../images/bg.jpg');
   background-repeat: no-repeat;
   background-size: cover;
 
}

How to set border:
------------------
Normal way:
--------------
h1{
    border-color: blue;
    border-width: 5px;
    border-style: solid;
}

Shortcut way:
--------------
h1{
    border: solid red 6px;   
}

Basic CSS Selector:
--------------------
1. Element selectors:
----------------------
Select all instance of given element i.e style is applicable for every tag of the specified type.

h1{
	color:red;
}

2. ID selectors:
----------------------
Select an element with the given id. But with in the HTML page ID is always unique.

#papa{
	color:green;
}

3. Class selectors:
----------------------
Select all elements with the given class.

HTML:
--------
<h1>This is heading 1</h1>
<h1 class="mummy">This is heading 2</h1>
<h1 class="mummy">This is heading 3</h1>
<h1>This is heading 4</h1>

CSS:
--------
.mummy{
	color:blue;
}

----------------------------------------------------
Advannce Selectors:
-------------------
1. * selector:
--------------
* means everything. This style is applicable for everything in the web page.

2. Decendant selector:
-----------------------

li a {
      color: red;
     }

'li' is considered as parent tag and 'a' is considered as child tag. 
For every anchor tag rsent in li tag this style is applicable.

3. Adjacent selector:
-----------------------

li a {
      color: red;
     }

'li' is considered as parent tag and 'a' is considered as child tag. 
For every anchor tag rsent in li tag this style is applicable.

4. Attribute selector:
-----------------------
We can define style based on attributes

input[type='password']{
            color: red;
            background-color: bisque;
        }
		
5. nth of type slectors:
------------------------


Mini Assignment:
------------------

https://openlibrary.org/

Create a Book App with Dashboard view having three sections - Display
Favorite, Author, recommendations for a book from openlibrary.org
developer api one under the other.
- This Dashboard is the default view to be shown.
- The 3 sections are:
- Favorite books
- Author
- Recommended books
- View All Favorite book cards under Favorite section
- Display all Author under Author section
- View all book recommendations from 3rd party books service provider
(openlibrary.org) under recommendations section

----------------------------------------------------------
In HTML -> Customer Registration Page --> Apply Bootstrap 


Name
Email
Password
Confirm Password

contact
Gender
DOB

Address

Register Button and Reset Button

====================
Java Script:
--------------
We can use browser's console to execute JS code.

The 5 basic JS primitive Data types:
-------------------------------------
1. Numbers:
-------------
10
-10
10.5

All these are of 'number' type.

x=10, y=-10, z = 10.5

typeof x -> 'number'
typeof y -> 'number'
typeof z -> 'number'

10 + 20 -> 30
10 - 20  -> -10
10 * 20  -> 200
10/20  -> 0.5
10%3  -> 1
10 ** 3 ->  -> 1000

2. string:
-------------
Any sequence of character within either single quotes or double quotes is treated as string.

x = 'Musa'
y = "Java"

10 + 20 => 30
'10' + '20' => 1020
10 + 'Abc' => 10Abc

Q. How to find  the number of characters present in the string?
Ans: We can find by using length variable.

name = 'MUSA'
name.length => 4

Q. How to access characters of string?
Ans: By using index

name[0]
'M'
name[1]
'U'
name[10]
undefined
name[-1]
undefined

3. boolean:
-------------
The only allowed values are : true and false (case sensitive)

JS Variables:
--------------
Variables are containers to store values.

Syntax:
----------
var <variableName> = <variableValue>

Example:
----------
 var x = 10 // data type of x is number
 
 x = 'Hello' // data type of x is string
 
 x = false // data type of x is boolean
 
 Age and Death calculator:
 ===========================
 Enter name:
 enter age:
 
 lets suppose max age is 60 years
 
 OUTPUT: Hello <name> your age is <age> and your remaining days are <remaining days>.

<script>
        var name = prompt('Enter your Name: ');
        var age = Number(prompt('Enter your age in years: '));

        var remainingYears = 60 - age;
        var remainingDays = remainingYears * 365;

        alert('Hello ' + name + ' your age is ' + age + ' and your remaining days are ' + remainingDays)
</script>

Operators:
-----------
1. Arithmetic Operators:
-------------------------
+, -, *, /, %, **

2. Comparision Operators:
-------------------------
<, <=, >, >=, !=, ==, ===, !==

10 < 20 ======> true
10 > 20 ======> false
10 <= 20 ======> true
10 >= 20 ======> false
10 == 20 ======> false
10 != 20 ======> true

Difference between == and === 
-----------------------------------
In case of == operator internally type coersion will be performed. Hence if arguments are different types 
first both arguments will be converted to same type and then comparision will be performed.
Hence both arguments need not be same type.

10 == '10'   ====> true


Here both content and type is important.
10 === '10'  ====> false

More Examples:
===============

true == "1" ====> true
false == "0" ====>  true
null == undefined ====> true

true === "1" ====> false
false === "0" ====> false
null === undefined ====> false

NaN( Not a Number):
--------------------
If the result is undefined then we will get NaN

e.g: 0/0 ===> NaN

NaN == NaN ====> false
NaN != NaN ====> true

isNaN(---)

3. Logical operators:
---------------------
&& --> AND
|| --> OR
!  --> NOT

 X && Y ==> both argumenta are true then only result is true i.e. 
            if atleast one argument is false then the result is always false.
			
 X || Y ==> if atleast one argument is true then the result is always true.
 
Note:
------
1. Non-zero values treated as true and zero treated as false.
2. Empty string treated as false whereas non empty string treated as true.
3. null, undefined, NaN are treated as false

Conditional Statements:
------------------------
1. if
2. if else
3. else if

Syntax:
--------
if(<boolExpr>)
{
	//body
}

---------------------------------------
if(<boolExpr>)
{
	//body
}
else
{
	//body
}
---------------------------------------
if(<boolExpr>)
{
	//body
}
else if(<boolExpr>)
{
	//body
}
else if(<boolExpr>)
{
	//body
}
else
{
	//body
}

----------------------------------------------
Iterative Statements:
---------------------
If we want to execute a group of statements iteratively, then we shoud go for iterative statements

1. While loop:
-----------------
As long as some condition is true execute code then we should go for while loop.

Sysntax:
-----------
while (<condition>)
{
	//body
}

1. WAP to print hello 10 times

var i =1;

while( i <= 10)
{
  console.log("Hello");
  i= i+1;
}        

2. WAP to print every character of a given string

3. WAP to print all numbers divisible by 3 and 5 between 5 to 100


2. for loop:
---------------
If we know the number of iteratonsin advance then we sholud use for loop.

syntax:
--------
for(<initialization>; <condition> ; <updation>){
	//bofy
}

Example:
---------
for (var i = 1; i < 11; i = i + 1) 
{
   console.log("hello " + i);
}

JS Functions:
--------------
Functions are set of statements which can be involked by another peice of code.
Its provide code reusability.

Syntax:
---------

function <name>(<arguments>)
	{
		// body
		return
	}

Exmple-1:
---------
function greet()
	{
		alert('Hello Friends!!!')
	}

greet();
greet();
greet();

Exmple-1:
---------
function greet(name) 
{
  alert('Hello '+ name)
}

greet('Musa'); // Hello Musa
greet(); // Hello undefined
greet('Java', 'JavaScript'); // Hello Java


Function with default arguments:
----------------------------------
function greet(name ='Guest') {
   alert('Hello '+ name)
}

 greet('Musa'); // Hello Musa
 greet(); // Hello Guest

Function with return value:
----------------------------------
function sum(a, b) {
   return (a + b)
}

var result = sum(50, 20)
console.log(result);

----------------------------------------------------------------------
1. WAP to define a function which takes a number as an input and will return square of this.
2. WAP to define a function which takes a string and return its UPPERCASE version.
3. WAP to define a function which takes a number and return its factorial.

--------------------------------------
JavaScript Scopes:
---------------------
1. Global scope
2. Local scope

1. Global scope:
-----------------
The variables which are declared outside of function are having global scope 
and these variables are avialable for all the functions,

var x = 10 // GLOBAL scope

function fun1() { console.log(x) }
function fun2() { console.log(x) }

fun1()
fun2()

2. Local scope:
-----------------
The variables which are declared inside a function are having local scope and are avaialable ony for that particular fucton. 
Outside of the function we cannot use these local scoped variables.

var x = 10 // GLOBAL scope

function fun1() {
            var y = 20 // LOCAL scope
            console.log(y)
            console.log(x)
        }
function fun2() {
            console.log(y)  // Uncaught ReferenceError: y is not defined
            console.log(x)
        }

        fun1()
        fun2()

-------------------------------
Higher order function:
----------------------
We can pass a function as argument to another  function. A function can return another function.
Such type of special functions are called Higher Order Functions.

E.g. setInterval(function, time_in_miliseconds)

function singASong() 
{
  console.log("Munni Badnaam hi, Darling tere liye.....");
}

setInterval(singASong, 3000);

Anonymous function:
----------------------
Some times we can define a funtion without name, suchtype of nameless functions are called anonymous functions.

The main objective of anonymous function is just for instant use(One time usage)

  setInterval(
            function () {
            console.log("Anonymous Function.....");
        }, 3000);
		
JS Array:
============
An array is an indexed collection of elements.

The main advantage of arrays concept is we can represent multiple values by using a single variable so that 
length of the code will be reduced and readability will be improved.var

Without array:
----------------

var n1 = 10;
var n2 = 20;
var n3 = 30;
var n4 = 40;

With array:
----------------
var nums= [10, 20, 30, 40];

Accessing Array elements by using index:
------------------------------------------
By using index we can access array elements. JS array follow 0-based index i.e. index of first element is 0.

       var fruits = ['Banana', 'Apple', 'Orange', 'Grapes']

        console.log(fruits); // ['Banana', 'Apple', 'Orange', 'Grapes']

        console.log(fruits[0]); // 'Banana'
        console.log(fruits[3]); // 'Grapes'
        console.log(fruits[99]); // undefined

Updating array elements by using indes:
-----------------------------------------
var fruits = ['Banana', 'Apple', 'Orange', 'Grapes']

console.log(fruits); // ['Banana', 'Apple', 'Orange', 'Grapes']
fruits[1]= 'PineApple';
console.log(fruits); // ['Banana', 'PineApple', 'Orange', 'Grapes']

Adding new elements to the array by using index:
-------------------------------------------------
        var fruits = ['Banana', 'Apple', 'Orange', 'Grapes']

        fruits[4] = 'Lichi';
        console.log(fruits); //['Banana', 'Apple', 'Orange', 'Grapes', 'Lichi']

        fruits[40] = 'Mango';
        console.log(fruits);  // ['Banana', 'Apple', 'Orange', 'Grapes', 'Lichi', empty × 35, 'Mango']

How to create an empty array:
-----------------------------
1.  var nums = [];
2.  var nums = new Array();

How to Find length of array:
------------------------------
By using length variable

        var fruits = ['Banana', 'Apple', 'Orange', 'Grapes']
		console.log(fruits.length); // 4

Is JavaScript array can hold only homogenous elements?
-------------------------------------------------------

var arr = [101, "Musa", false, null]

Important Methods related to JS arrays:
----------------------------------------
JS defines several methods which are applicable on arrays.

The following are some important methods:
----------------------------------------
1. push()
-----------
We can use push() to add elements to the end of the Array. 
After adding element this mehod returns length of the array.

var nums = [10, 20, 30, 40];
nums.push(50);
console.log(nums); //[10, 20, 30, 40, 50]

2. pop()
-----------
We can use push() to remove and return last element of the array.

var nums = [10, 20, 30, 40];

console.log(nums.pop()); //40
console.log(nums); //[10, 20, 30]

console.log(nums.pop()); //30
console.log(nums); //[10, 20]

console.log(nums.pop()); //20
console.log(nums); //[10]

3. unshift()
-----------
We can use unshift() to add elements in the first position. 
It is couter part of push().

var nums = [10, 20, 30, 40];
nums.unshift(50);
console.log(nums); //[50, 10, 20, 30, 40]

4. shift()
-----------
We can use unshift() to remove and return first element of the array. 
It is couter part of pop().

var nums = [10, 20, 30, 40];

console.log(nums.shift()); //10
console.log(nums); //[20, 30, 40];

console.log(nums.shift()); //20
console.log(nums); //[ 30, 40];

console.log(nums.shift()); //30
console.log(nums); //[ 40];


5. indexOf()
-----------
We can use indexOf() to find the index of specified element.
If the element present multiple times then this method will return index of first occurance.
If the speified element is not available then we will get -1.


var nums = [10, 20, 10, 30, 40];

console.log(nums.indexOf(10)); // 0
console.log(nums.indexOf(50)); // -1

6. slice():
---------------
We can use slice() to get the part og=f the array as slice.

slice(begin, end) # returns the array of elements from begin to end-1 index
slice() # returns total array. This can be used for cloing purpose

var nums = [10, 20, 30, 40, 50, 60, 70, 80, 90];

var nums1 = nums.slice(1, 5) // [20, 30, 40, 50]

var nums2 = nums.slice() // [10, 20, 30, 40, 50, 60, 70, 80, 90]

1. How to search an element inside it?
2. How to reverse an array?
3. How to print an array of strings to the output console?
4. How to search the minimum and the maximum element in an array?
5. How to merge two arrays?
6. How to find common elements from arrays?
7. How to check if two arrays are equal or not?
8. Write a Java program to sum values of an array.
9. Write a Java program to calculate the average value of array elements.
10. Write a Java program to find the index of an array element.

---------------------------------------------------------------------------------
Retrieving Elements of Array:
------------------------------

We can retrieve elements of array by using the following ways:

1. while loop
2. for loop
3. for-of loop
4. forEach method

1. while loop:
---------------
        var nums = [10, 20, 30, 40, 50];

        var i = 0;

        while (i < nums.length) {
            console.log(nums[i]);
            i++;
        }

2. for loop:
-------------
        var nums = [10, 20, 30, 40, 50];

        for (var i = 0; i < nums.length; i++) {
            console.log(nums[i]);
        }

3. for-of loop:
----------------
It is the convinient loop to reteive elements of array.

        var nums = [10, 20, 30, 40, 50];

        for (x of nums) {
            console.log(x);
        }

4. forEach method:
--------------------
forEach() is specially designed mehod to retrive elements of Array.

Sysntax:
-----------------
arrObj.forEach(function)

Example:
--------
        function doubeIt(x) {
            console.log(2 * x);
        }

        var nums = [10, 20, 30, 40, 50];
        nums.forEach(doubeIt);

 
nums.forEach(console.log);
nums.forEach(alert);

How to delete array element based on index:
-----------------------------------------------
We have splice() function.

Syntax:
-------

arrObj.splice(index, numOfElements)

        var nums = [10, 20, 30, 40, 50];
        console.log(nums);//[10, 20, 30, 40, 50]
        nums.splice(2,2);
        console.log(nums);// [10, 20,  50]


JavaScript Objects:
--------------------
-> By using arra e can store a group of individual objects and it is not possible to store key-value pair.

-> If we want to represent a grou of key-value pairs then we should go for the Objects.

Array: a group of individual objects
Object: a group of key-value pairs.

-> JS objects are similar to Java Map and Python dict

Syntax:
----------
var variableName = {key1:value1, key2:value2, key3:value3, .......}

Example:
--------
var movie = {

	name : 'Bahubali',
	year: 2016,
	hero: 'Prabhas'

}

-> In the case of JS objects , no gurantee for the orders and hence index concept is not applicable.

How to access values from Object:
----------------------------------
1. obj["key"]:
---------------
Here quotes are mandatory.

movie["name"] // Bahubali
movie[name] // Invalid

1. obj.key
-----------
Here we calculatennot use quotes

movie.hero // Prabhas


console.log(movie["name"]) // Bahubali
console.log(movie.name) // Bahubali

How to create and initialize JS objects:
------------------------------------------
1. To create an empty object

	var nums = {};
	     OR
	var nums = new Object()

Once we creates empty object we can add key-value pair as follows:
----------------------------------------------------------------------
1st Way:
--------
nums["fno"]=100
nums["sno"]= 200

2nd Way:
--------
nums.fno =100
nums.sno = 200

How to update the values:
-------------------------
nums["fno"]=111;
  OR
nums.fno =111  

-> How to Iterate Objects:
-------------------------------
to access all key-value pairs we can use for-in loop

Example:
------------
var nums = { fno: 100, sno: 200, tno: 300 }

        for(key in nums){
            console.log(key); // KEY
            console.log(nums[key]); // VALUE

            console.log(key +" : "+nums[key]); // KEY : VALUE
        }

LAB:
-------
Create an Student object with name, age, course

Create few Student ojects and store in an array.

print the array,

sort the array on the basis of student age

print the sorted array.

Solution:
------------
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

-------------------------------------------
Document Object Model (DOM):
------------------------------
DOM acts as interface between JS and HTML, CSS i.e. by DOM javaScript can communicate with Html and CSS

To display Document to the console:
------------------------------------
console.log(document)

How to Grab HTML elements from the DOM:
---------------------------------------

-> Importanat DOM attribute
----------------------------------
1. document.URL ===> This is original URL of the website
2. document.body ===> It returns everything inside the body
3. document.head ===> It returns head of the page
4. document.links ===> It returns list of all links of the page

Important methods of DOM:
----------------------------

1. document.getElementById():
---------------------------------
returns element with the specified id.

2. document.getElementsByClassName():
-----------------------------------
returns list of all elements belongs to the specified class.

3. document.getElementsByTagName():
---------------------------------
returns list of all elements belongs to the specified tag name.

4. document.querySelector():
---------------------------------
returns the first object matching CSS style selector

5. document.querySelectorAll():
---------------------------------
return all the objects matches the CSS style selector

---------------------------------------------------------------------
Why Java:
==========
-> Object Oriented Programming Language
-> Platform independent
-> Secure
-> Easy to learn
-> Robust
-> Functional Style of programming(From Java8)
....
....

Object Oriented Programming Language:
--------------------------------------
class
object
inheritance
polymorphism
encapsulation
abstraction

Class:
--------
1. Class is an imaginary thing or blueprint which describes the properties or behaviour of an object.
2. Class is a representation of similar kind of objects.
3. Class is an user defined data type.

Syntax:
--------
<modifier> class <name> <extends> <implements>
			{
				// body -> members
								1. variables
								2. methods
								3. *)constructor
								4. inner classes
								5. initializer blocks
			}
			
Member can be:
--------------
static : members are associated with Class or ClassName
instance :members are associated with Object or Object Refenece.
======================
Example:
--------
	class A
		{
		}


public class Car {

	int h; // instance variable
	int w; // instance variable

	static float wc; // static variable

	// instance method
	void move() {
		// body
	}

	// static method
	static void avg() {
		// body
	}

}
-----------------------------------------------------
2. Object:
-----------
1. Object is real world entity.
2. Object is an instance of a class.

Syntax:
----------
   <type>  <var> = new <type>(<parameters>)
   
Example:
----------
 Car c1 = new Car();
 
 Car c2 = new Car();
 
Acessing members:
-----------------
<ClassName>.<member> // static member
<ObjRef>.<member> // instance as well as static member

Car.wc = 100;

c1.h =15;
c2.w =30;

c1.wc =150;  //OK but not recommended

-----------------------------------------------
Data types:
-----------
1. Primitive Data Types

	Boolean data type
		-> boolean
	Character data type
		-> char
	Integer data type
		-> byte
		-> short		
		-> int
	l	-> long
	Floatig Point data type
		-> float
		-> double

byte -> short -> int -> long -> float -> double
        char  -> int
		
2. Reference Data Types
	-> class
	-> interface
	-> array
	-> enum


Why Char data type is 2 Bytes in Java?
----------------------------------------
In C/C++ , ASCII-8 uses as a encoding scheme

8 bits -> 1 Byte => 2 the power 8 => 256 chars maximum
a-z
A-Z
0-9
+ - / * @ # $ ...
Arabics 
Korean 
Chinese......

Java uses Unicode-16 bits encoding scheme

16 bits = 2 Bytes => 2 the power 16 => 65536 

-------------------------------------------------------
Operators:
==========
1. Arithmetic operators:
----------------------------
a) +, -, *, /, %

b) Extended assignement operators
	 a= a + b; ==>  a += b;
	 a= a - b; ==>  a -= b;
	 a= a * b; ==>  a *= b;
	 a= a / b; ==>  a /= b;
	 a= a % b; ==>  a %= b;

c)  
		int x = 10;
		System.out.println(x / 0); // java.lang.ArithmenticException: / by zero
		System.out.println(x / 0.0); // Infinity
		System.out.println(-x / 0.0); // -Infinity
		System.out.println(0.0 / 0.0); // NaN

d) MAX(int, <typ11>, <type2>, ..., <typeN>)
		int i = 10;
		float f = 2.5F;
		long l = 10;
		
	   float	x = (i+f) * l ; // MAX(int, int, float, long )

2. Relational Operators:
----------------------------
a) >, >=, <, <=

b) Operands: Numerics
	result : boolean
	
Example:
---------
  int x = 15;
  
  boolean b = 10 < x < 20; // true < 20 => Compile time error
  boolean b = (10 < x) & (x < 20); // true
  
3. Equality Operators:
----------------------------
a) ==, !=

b) Operands: Any
	result : boolean

Example:
-----------
  int i = 10;
  
  boolean b1 = i == 15; // false
          
  boolean b2 = b1 == false; // true

----------------------------------------
 Car c1 = new Car();
 Car c2 = new Car();
 
 boolean b3 = c1 == c2; // false

4. String Concatenation Operator ('+'):
---------------------------------------

String s1 = "I Love ";
String s2 = "Java";

String s3 = s1 + s2 ; // "I love Java"

SOP(100 + "Hello"); // "100Hello"

5. Variable Increment and Decrement operator:
---------------------------------------
a) ++, --

Example:
----------
a)
		int i = 10;

		// ++i; // pre-increment
		i++; // post-increment

		System.out.println(i); // 11

b)
        int j = ++i; // pre-increment
		System.out.println(i); // 11 
		System.out.println(j); // 11

		int j = i++; // post-increment		
		System.out.println(i); // 11 
		System.out.println(j); // 10


c) int x = ++5;  // CE

6. Boolean Logic operators:
------------------------------
a) &, |, ^, !

b) Operands: boolean expression
   result : boolean
   
Example:
---------
  int x = 15;
  
  boolean b = (10 < x) & (x < 20); // true
   
c) Short circuit Operators:
		&&, ||

d) Extended assignment operators:
	 a = a & b; ==> a &= b;
     a = a | b; ==> a |= b;
	 a = a ^ b; ==> a ^= b;


int i =10;

  boolean x = (20 < i ) &  (i > 5); // => false & true => false
  
  boolean y = (20 < i ) &&  (i > 5); // false && ---not evaluated-- => false


7. Ternary Operator:
---------------------
Syntax:
---------
  <boolExpr> ? <expr1> : <expr2>

 int a = ---;
 int b = ---;
 
 int max;
  
if(a>b)
  {
	max = a;
  }
else
  {
	max = b;
  }

SOP("Max is: "+ max);

In One Line:
------------
  int a = ---;
 int b = ---;
 
int max = a>b ? a: b;

SOP("Max is: "+ max);

LAB: Find maximum of 3 number using both approch

----------------------------------------------------------------
Iterative Statements:
----------------------
1. for loop
2. while loop
3. do-while
4. ForEach / Enhance for loop 

	for(<type> <var> : <source>) // Source can be Array or Collection
	{
	// body
	}

	int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("==================================");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("==================================");
		for (int x : arr) {
			System.out.println(x);
		}
----------------------------------
1. for loop:
------------
for(<initialization> ; <condition>; <updation>)
{
	// body 
}

2. while loop:
------------

<initialization> ;
--
---
--
while( <condition>)
{
	// body 
	 <updation>
}

2. do-while loop:
------------

<initialization> ;
--
---
--
do
{
	// body 
	 <updation>
}
while( <condition>);

-----------------------------------------------
Lab: print 1 to 10 using for, while and do-while

-------------------------------------------------
Branching:
-----------
a)
if(<boolExpr>{
// body
}

b)
if(<boolExpr>){
// body
}
else{
// body
}

c)

if(<boolExpr>){
// body
}
else if(<boolExpr>){
// body
}
else if(<boolExpr>){
// body
}
else{
// body
}

Switch statement:
------------------
**) char, byte, short, int, enum, String
switch(<noLongIntegralExpression>)
{
	case <label>:
			---
			---
	case <label>:
			---
			---
	case <label>:
			---
			---
	defualt:
		--
}

LAb:
-------
Take a number if it is 1 print Monday, 2 for TuesDay, ... 7 for Sunday, for any other numer Are u crazy...


int day = ----;

switch(day){-----}

============================
Array:
------------
-> Array is a linear Data Structure.
-> In java Arrays are objects.
-> Every array has an extra field named 'length' which contains size of an array.
-> Arrays are indexed starting from 0.
-> If we use an invalid index we will get an exception named ArrayIndexOutofBoundsException(AIOBE).

How we can create arrays in Java:
----------------------------------
1. <type> <var> = new <type>[<size>]
2. <type> <var> = {<values>};


1) int[] arr1 = new int[5];

		arr1[0] =10;
		arr1[1] =20;
		arr1[2] =30;
		arr1[3] =40;
		arr1[4] =50;

2) int[] arr2 = {10, 20, 30, 40, 50};

======================================
Input and Ouput:
------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name: ");
		String name = sc.next();

		System.out.println("Enter your Age: ");
		int age = sc.nextInt();

		System.out.println("Enter your Salary: ");
		double salary = sc.nextDouble();

		System.out.println("Hello " + name + " your age is " + age + " and salary is " + salary);

		sc.close();
		
LAB:
-----
Ask number of Student

Then takes there total Marks in a subject

then print average of those marks

then print maximum and minimum  marks

then print result:

> 60 -> First
> 50 Second
> 40 Third
< 40 Failedd..

Batch Will Start from 9 AM tomarrow and onwards

========================================================
Method:
-----------
-> A group of statements which can call multiple times from another code.

Syntax:
--------
<modifier> <returnType> <name> (<ListOfCommaSeparatedParameters>) <throws>
{
	// body
}

Example:
----------
 void foo(){
	SOP("Hello from foo");
 }
 
 int sum(int a, int b)
 {
	// 1K line
	return a+b;
 } 

Method Overloading (Compile time | early | static polymorphism ):
-----------------------------------------------------------------
Within a Java class, we can have 2 or more than  methods wich have same name but different parameter list.

Constructor:
-------------
-> Constructor is a special member of class which can be used to construct initial state of an object.
-> Constructors are similar to the method.
-> Rules for constructor creation:
	a) Same name as of the class
	b) Only access modifiers (public, protected, private) are permisable
	c) No return type even not a void

-> We can have default(no-args) constructor as well as parameterized constructor. 
  Hence constructor can be overloaded.
-> If we dont have any constructor in our class, Compiler will provide a default constructor.

===============================
Can we mak a cosntructor private?

If N -> Why
If Y -> why we do this?

---------------------------------------------
Modifier:
-----------
a) Access Modifier
	-> public
	-> protected
	-> default
	-> private
		
b) Other Modifier
	-> static
	-> final
	-> abstract
	-> native
	-> transient
	-> volatile
	-> synchronized
	-> strictfp
		

PUBLIC:
--------
Accessible everywhere.

Protected:
--------
a) Accessible with in the same package.
b) Can go out side the package through inheritance.

DEFAULT:
--------
Accessible with in the same package.

PRIVATE:
--------
Accessible only within the class.

--------------------------------------------
Java Packages:
---------------
hospital
	|- A.java, B.java, C.java, D.java, ...



hospital
	|- A.java, B.java
	|
	|-doctors
		|-C.java
		|-ent
			|-D.java
		|-cardio
			|-E.java
	
	|-staff
		|-F.java
		|-nursing
			|-G.java
		|-clerk
			|-H.java

	|-patient
		|-I.java
		|-admit
			|-J.java
		|-opd
			|-K.java

---------------------------------------------
Object Oriented Programming:
------------------------------
Inheritance [IS-A]:
-------------------
It is a way code reusability.

 Person
	|-eat()
	|-sleep()
	
 Employee INHERITS Person
	|- doWork()

 Student INHERITS Person
	|- study()


 Dog
  |- bark()

Aggregation | Composition[HAS-A]:
----------------------------------
             // Employee IS-A Person -> Inheritance
public class Employee extends Person {
	
	Dog dog;   // Employee HAS-A Dog -> Aggregation
		
	--
	---
}

-----------------------------------------------------
-> Java Supports SINGLE inheritance using CLASSES
-> Java also supports MULTIPLE inheritance wusing interfaces.
-> In java, java.lang.Object class is the ROOT class. Every class inherits it either directly or indirectly.
-> If a class doesnot mentions its parent class then taht class inherits Object class directly.

-------------------------------------------------------------------------
Method Overloading (Compile time | early | static polymorphism ):

=> Within a Java class, we can have 2 or more than  methods which have same name but different parameter list.

public class CompileTimePolymorphism {

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}

Method Ovrriding (Runtime | late | dynamic Polymorphism):
-----------------------------------------------------------
=> Between the classes which have IS-A relationship i.e. inheritance,
  child class have a method same as parent class.
  
Rules:
---------
-> Method name and parameter(s) should be same.

-> Return Type:
---------------
a) If primitive , we cannot do any thing
b) If reference , we can use same or any sub type (Co-Varient)

-> Accessibilty:
------------------
We can widen but narrowing is not allowed.

private -> default -> protected -> public

**) private and static methods will nat take participation in Method Overriding

-> throws clause:
--------------------
TODO

---------------------------------------------------------------------
Other Modifiers:
-------------------






























