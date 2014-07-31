function findMaxSequence(arrWithSequence) {
    var startIndex = 0;
    var tempStartIndex = 0;
    var longestSeq = 1;
    var tempLongSeq = 1;
    var longestArraySeq = [];
    for (var i = 1; i < arrWithSequence.length; i++) {
        if (arrWithSequence[i] === arrWithSequence[i - 1]) {
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
    return console.log(longestArraySeq);
}

findMaxSequence([2, 1, 1, 2, 3, 3, 2, 2, 2, 1]);
findMaxSequence(['happy']);
findMaxSequence([2, 'qwe', 'qwe', 3, 3, '3']);