function findMaxSequence(arrWithSequence) {
    var tempFrequency = 0;
    var bestFrequency = 0;
    var mostFreqNumber;
    for (var i = 0; i < arrWithSequence.length; i++) {
        tempFrequency = 0;
        for (var j = 0; j < arrWithSequence.length; j++) {
            if (arrWithSequence[i] === arrWithSequence[j]) {
                tempFrequency++;
                if (tempFrequency > bestFrequency) {
                    bestFrequency = tempFrequency;
                    mostFreqNumber = arrWithSequence[i];
                }
            }
            
        }
    }
    return mostFreqNumber + " (" + bestFrequency + " times)";
}

console.log(findMaxSequence([4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3]));
console.log(findMaxSequence([2, 1, 1, 5, 7, 1, 2, 5, 7, 3, 87, 2, 12, 634, 123, 51, 1]));
console.log(findMaxSequence([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]));