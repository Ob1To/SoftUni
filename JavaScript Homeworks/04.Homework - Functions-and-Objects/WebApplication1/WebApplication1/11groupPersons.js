
var persons = [
   (new Person("Scott", "Guthrie", 38)),
   (new Person("Scott", "Johns", 36)),
   (new Person("Scott", "Hanselman", 39)),
   (new Person("Jesse", "Liberty", 57)),
   (new Person("Jon", "Skeet", 38))];



function Person(firstname, lastname, age) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
}



var a = group(persons, 'first')
console.log(a);

var b = group(persons, 'age')
console.log(b);

var c = group(persons, 'second')
console.log(c);

function group(object, groupType) {
    var finalArray = [];
    if (groupType === 'age') {
        for (var k in object) {
            if (finalArray[object[k].age] === undefined) {
                finalArray[object[k].age] = [{ first: object[k].firstname, last: object[k].lastname }]
            }
            else {
                finalArray[object[k].age].push({ first: object[k].firstname, last: object[k].lastname })
            }
        }
        var finalStr = '';
        for (var jj in finalArray) {
            finalStr = finalStr + "[" + "Group " + jj + ":";
            for (var jjj in finalArray[jj]) {
                finalStr = finalStr + jj + " " + finalArray[jj][jjj].first + "(" + finalArray[jj][jjj].last + ") "
            }
            finalStr = finalStr + "]" + '\n';
        }
        return finalStr

    }
    else if (groupType === 'first') {
        for (var k in object) {
            if (finalArray[object[k].firstname] === undefined) {
                finalArray[object[k].firstname] = [{ age: object[k].age, last: object[k].lastname }]
            }
            else {
                finalArray[object[k].firstname].push({ age: object[k].age, last: object[k].lastname })
            }
        }
      
        var finalStr='';
        for (var ii in finalArray) {
            finalStr = finalStr+"["+ "Group " + ii + ":";
            for (var iii in finalArray[ii]){
                finalStr = finalStr + ii +" "+ finalArray[ii][iii].last + "(" + finalArray[ii][iii].age + ") "
            }
            finalStr = finalStr + "]" + '\n';
        }
        return finalStr
    }
    else if (groupType === 'second') {

        for (var k in object) {
            if (finalArray[object[k].lastname] === undefined) {
                finalArray[object[k].lastname] = [{ age: object[k].age, first: object[k].firstname }]
            }
            else {
                finalArray[object[k].lastname].push({ age: object[k].age, first: object[k].firstname })
            }
        }

        var finalStr = '';
        for (var ii in finalArray) {
            finalStr = finalStr + "[" + "Group " + ii + ":";
            for (var iii in finalArray[ii]) {
                finalStr = finalStr + ii + " " + finalArray[ii][iii].first + "(" + finalArray[ii][iii].age + ") "
            }
            finalStr = finalStr + "]" + '\n';
        }
        return finalStr

    }

}