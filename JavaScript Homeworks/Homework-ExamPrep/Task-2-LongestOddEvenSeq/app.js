function solve(input) {
    var numbersString = input[0];

    var numbers = numbersString.split(/[()\s]+/);

    numbers = numbers.filter(Boolean);

    var sequence = 1;
    var tempSeq = 1;

    for (var i = 1; i < numbers.length; i++) {

        if (isEven(numbers[i - 1]) && isOdd(numbers[i])) {
            tempSeq++;
        }
        else if (isOdd(numbers[i - 1]) && isEven(numbers[i])) {
            tempSeq++;
        }
        else {
            if (tempSeq > sequence) {
                sequence = tempSeq;
            }
            tempSeq = 1;
        }
    }
    if (tempSeq > sequence) {
        sequence = tempSeq;
    }
    

    function isEven(number) {
        if (number === '0') {
            return true;
        }
        else {
            if (number % 2 === 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    function isOdd(number) {
        if (number === '0') {
            return true;
        }
        else {
            if (number % 2 !== 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    //console.log(sequence);
    return sequence;
}

solve(['0 0 0 (102)(103)(0)(105)  (107)(1)']);
