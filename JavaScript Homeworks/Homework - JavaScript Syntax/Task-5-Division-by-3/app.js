function divisionBy3(value) {
    var sumOfNumbers = 0;
    while (value > 0) {
        sumOfNumbers += value % 10;
        value = Math.floor(value / 10);
    }

    switch (sumOfNumbers % 3) {
        case 0: console.log('the number is divided by 3 without remainder');
            break;
        default: console.log('the number is not divided by 3 without remainder');
    }
}

divisionBy3(333);
divisionBy3(425);
divisionBy3(591);