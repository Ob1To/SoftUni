function findNthDigit(arr) {
    var num=arr[1];
    var n = arr[0];
    var inputToStr = num.toString();
    inputToStr = inputToStr.replace('.','');
    inputToStr = inputToStr.replace(',','');
    inputToStr = inputToStr.replace('-','');
    if(n>inputToStr.length)
    {
        return "The number doesn’t have "+ n+" digits"
    }
    else {
        return inputToStr[inputToStr.length - n];
    }
}

console.log(findNthDigit([1, 6]))
console.log(findNthDigit([2, -55]))
console.log(findNthDigit([6, 923456]))
console.log(findNthDigit([3, 1451.78]))
console.log(findNthDigit([6, 888.88]))
