function printNumbers(n) {
    if (n <= 0) {
        return console.log('no');
    }

    var numbers = [];
    for (var i = 0; i <= n; i++) {
        if (i % 4 === 0 || i % 5 === 0) {
            continue;
        }
        else {
            numbers.push(i);
        }
    }
    console.log(numbers);
}
printNumbers(20);
printNumbers(-5);
printNumbers(13);