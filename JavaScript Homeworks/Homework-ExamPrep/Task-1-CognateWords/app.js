﻿function solve(input) {
    var text = input[0];

    var words = text.split(/[^A-Za-z]+/);
    words = words.filter(Boolean);

    var output = [];

    for (var a = 0; a < words.length; a++) {
        for (var b = 0; b < words.length; b++) {
            for (var c = 0; c < words.length; c++) {
                if (a!==b) {
                    var check = words[a] + words[b] === words[c];
                    if (check) {
                        var cognateWord = words[a] + '|' + words[b] + '=' + words[c];
                        if (output.indexOf(cognateWord) < 0) {
                            output.push(cognateWord);
                        }
                    }
                }
            }
        }
    }
    //console.log(output.join('\n'));

    if (output.length === 0) {
        return 'No';
    }
    else {
        return output.join('\n');
    }
}

solve(['Uni(lo,.ve=I love SoftUni (Soft)']);
