function createArray() {
    var taskArray = new Array(20);

    for (var i = 0; i < taskArray.length; i++) {
        taskArray[i] = i * 5
    }

    console.log(taskArray.join(', '));
}

createArray();