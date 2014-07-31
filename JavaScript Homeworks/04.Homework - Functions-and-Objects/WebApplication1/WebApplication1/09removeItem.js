Array.prototype.removeItem = function removeItem(value) {
    var b = []
    var a=this
    for (var i in a) {
        if (a[i] === value) {

        }
        else {
            b.push(a[i]);
        }
    }
    return b;
}

var arr = [1, 2, 1, 4, 1, 3, 4, 1, 111, 3, 2, 1, '1'];
var b=arr.removeItem(1);
console.log(b);