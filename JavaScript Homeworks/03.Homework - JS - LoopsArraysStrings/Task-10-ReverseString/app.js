function reverseString(stringToReverse) {
    var stringResult = [];
    for (var i = stringToReverse.length - 1; i >= 0; i--) {
        stringResult.push(stringToReverse[i]);
    }

    return (console.log(stringResult.join('')));

    //return console.log(stringToReverse.split("").reverse().join("")); //alternative solution
}

reverseString('sample');