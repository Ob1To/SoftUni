﻿function variablesTypes(value) {
    var name = value[0];
    var age = value[1];
    var isMale = value[2];
    var food = new Array();
    for (i = 3; i <= value.length - 1; i++) {
        food[i - 3] = value[i];
    }
    return "My name is: " + name + " //type is " + typeof (name) + "\nMy age: " + age + " //type is " + typeof (age) + "\nI am male: " + isMale
           + " //type is " + typeof (isMale) + "\nMy favourite foods are: " + food + " //type is " + typeof (food);
}
console.log(variablesTypes(['Ivan', 27, true, ['fries', 'banana', 'cake']]));