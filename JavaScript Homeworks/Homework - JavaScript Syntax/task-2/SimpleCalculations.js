function roundNumber(value) {
    var rounded = Math.round(value);
    var floor = Math.floor(value);
    console.log('Rounded number with value: ' + value + ' is - ' + rounded);
    console.log('Floor number with value: ' + value + ' is - ' + floor);
    console.log();
}

roundNumber(22.7);
roundNumber(12.3);
roundNumber(58.7);