function findMaxIncSeq(arrWithSequence) {
    var startIndex = 0;
    var tempStartIndex = 0;
    var longestSeq = 1;
    var tempLongSeq = 1;
    var longestArraySeq = [];
    for (var i = 1; i < arrWithSequence.length; i++) {
        if (arrWithSequence[i] > arrWithSequence[i - 1]) {
            tempLongSeq++;
            if (tempLongSeq >= longestSeq) {
                longestSeq = tempLongSeq;
                startIndex = tempStartIndex;
            }
        }
        else {
            tempLongSeq = 1;
            tempStartIndex = i;
        }
    }

    for (var i = startIndex; i < startIndex + longestSeq; i++) {
        longestArraySeq.push(arrWithSequence[i]);
    }
    if (longestArraySeq.length > 1) {
        return console.log(longestArraySeq);
    }
    else {
        return console.log('no');
    }
}

findMaxIncSeq([3, 2, 3, 4, 2, 2, 4]);
findMaxIncSeq([3, 5, 4, 6, 1, 2, 3, 6, 10, 32]);
findMaxIncSeq([3, 2, 1]);