function findMinAndMax(value) {
    var min = value[0];
    var max = value[0];

    for (var i = 0; i < value.length; i++) {
        if (value[i] < min) {
            min = value[i]
        }
        if (value[i] > max) {
            max = value[i]
        }
    }
    console.log('Min -> ' + min);
    console.log('Max -> ' + max);
}

findMinAndMax([1, 2, 1, 15, 20, 5, 7, 31]);
findMinAndMax([2, 2, 2, 2, 2]);
findMinAndMax([500, 1, -23, 0, -300, 28, 35, 12]);

