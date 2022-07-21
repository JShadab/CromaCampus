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



















































































