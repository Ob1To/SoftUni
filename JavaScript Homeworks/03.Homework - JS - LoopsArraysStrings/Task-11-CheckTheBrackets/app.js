function checkBrackets(expression) {
    //expression = expression.toString();

    var leftBracket = expression.match(/\(/g);
    var rightBracket = expression.match(/\)/g);
    var result;

    if (leftBracket.length !== rightBracket.length) {
        result = "Incorrect!";
    } else {
        result = "Correct!";
    }
    if (expression.indexOf(")") < expression.indexOf("(")) {
        result = "Incorrect!";
    }
    return result;
}

console.log(checkBrackets('( ( a + b ) / 5 – d )'));
console.log(checkBrackets(') ( a + b ) )'));
console.log(checkBrackets('( b * ( c + d *2 / ( 2 + ( 12 – c / ( a + 3 ) ) ) )'));
