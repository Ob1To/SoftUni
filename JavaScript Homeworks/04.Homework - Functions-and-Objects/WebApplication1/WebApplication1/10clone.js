function clone(obj) {
    if (obj == null || typeof (obj) != 'object')
        return obj;

    var temp = obj.constructor(); // changed

    for (var key in obj)
        temp[key] = clone(obj[key]);
    return temp;
}

function compareObjects(obj, objCopy) {
    return obj==objCopy
}

var a = { name: { first: 'Pesho', last: "Petrov" }, age: 21 }
var b = clone(a); // a deep copy 

var c = { name: { first: 'Pesho', last: "Petrov" }, age: 21 };
var d = c; // not a deep copy


console.log("a == b -->"+compareObjects(a, b));
console.log("c == d -->"+compareObjects(c, d));

