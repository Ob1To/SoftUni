function reverseWordsInString(str) {
    var strToArray = str.split(' ');
    var resultAsArray = [];
    for (var i = 0; i < strToArray.length; i++) {
        resultAsArray.push(strToArray[i].split('').reverse().join(''))
    }
    var result = resultAsArray.join(' ');
    return result;
}

console.log(reverseWordsInString("Hello, how are you."));

str = 'he';
