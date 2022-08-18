
function wish(name = 'Guest') {
    console.log('Hello ' + name + ', Good Morning')
    wish2();
}

function wish2(name = 'Guest') {
    console.log('Hello ' + name + ', Good Morning')
}

function factorial(num) {
    var fact = 1;

    for (var x = 1; x <= num; x++) {
        fact = fact * x;
    }
    return fact;
}