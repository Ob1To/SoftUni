function biggerThanNeighbors(position, array) {
    var left;
    var right;
    if (array[position - 1] === undefined) {
        left = array[position] - 1
    }
    else {
        left = array[position - 1]
    }
    if (array[position + 1] === undefined) {
        right = array[position] - 1
    }
    else {
        right = array[position + 1]
    }
    if (array[position] === undefined) {
        return "invalid index"
    }
    else if (position === 0) {
        return "Only one neighboor"
    }
    else if (position === (array.length-1)) {
        return "Only one neighboor"
    }
    else if ((array[position] > right) && (array[position] > left)) {
        return "bigger"
    }
    else {
        return "not bigger"
    }
}

console.log(biggerThanNeighbors(2, [1, 2, 3, 3, 5]))
console.log(biggerThanNeighbors(2, [1, 2, 5, 3, 4]))
console.log(biggerThanNeighbors(5, [1, 2, 5, 3, 4]))
console.log(biggerThanNeighbors(0, [1, 2, 5, 3, 4]))