function compareChars(charArrOne, charArrTwo) {
    var firstArrLonger;

    if (charArrOne.length != charArrTwo.length) {
        return console.log('Not Equal');
    }
    else {
        for (var i = 0; i < charArrOne.length; i++) {
            if (charArrOne[i] != charArrTwo[i]) {
                return console.log('Not Equal');
            }
        }
        return console.log('Equal');
    }
}

compareChars(['1', 'f', '1', 's', 'g', 'j', 'f', 'u', 's', 'q'],
['1', 'f', '1', 's', 'g', 'j', 'f', 'u', 's', 'q']
);

compareChars(['3', '5', 'g', 'd'],
['5', '3', 'g', 'd']
);

compareChars(['q', 'g', 'q', 'h', 'a', 'k', 'u', '8', '}', 'q', '.', 'h', '|', ';'],
['6', 'f', 'w', 'q', ':', '”', 'd', '}', ']', 's', 'r']
);