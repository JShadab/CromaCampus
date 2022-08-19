const emp = {
    "name": "Musa",
    "age": 36,
    "isMinor": false,
    "salary": 1234.50,
    "friends": [
        { "name": "Lala", "source": "ChildHood" },
        { "name": "Usman", "source": "Office" }, 
        { "name": "Tushar", "source": "College" }
    ],
    "address": {
        "area": "HammyBerg",
        "city": "Amsterdam",
        "country": "Netherlands"
    }
}

console.log(emp.friends[1].name); // USman


console.log(emp.address.country); // Netherlands


