function sortArray(arrayToSort) {
    for (var i = 0; i < arrayToSort.length - 1; i++) {
        for (var j = i + 1; j < arrayToSort.length; j++) {
            if (arrayToSort[i] > arrayToSort[j]) {
                var temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = temp;
            }
        }
    }
    var result = arrayToSort.join(', ');
    return result;
}

console.log(sortArray([5, 4, 3, 2, 1]));
console.log(sortArray([12, 12, 50, 2, 6, 22, 51, 712, 6, 3, 3]));