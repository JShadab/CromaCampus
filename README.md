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














































