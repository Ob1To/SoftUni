function lastDigitAsText(number){
    var a = number.toString()
    var c = a[a.length - 1];
    var b='';
    switch (parseInt(c)) {
        case 0:
            b = 'Zero';
            break
        case 1:
            b = 'One';
            break
        case 2:
            b = 'Two';
            break
        case 3:
            b = 'Three';
            break
        case 4:
            b = 'Four';
            break
        case 5:
            b = 'Five';
            break
        case 6:
            b = 'Six';
            break
        case 7:
            b = 'seven';
            break
        case 8:
            b = 'eight';
            break
        case 9:
            b = 'nine';
            break
        default:
            b = "Not a number"
            break
    }
    return b;
}

console.log(lastDigitAsText(356));

