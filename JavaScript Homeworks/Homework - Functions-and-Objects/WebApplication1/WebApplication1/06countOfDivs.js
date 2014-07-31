function countDivs(html) {
    var divNumber = 0;
    var indexToCheck=0;
    while (html.indexOf("<div",indexToCheck) !== -1) {
        divNumber++;
        indexToCheck=html.indexOf("<div",indexToCheck)+1;
    }

    return divNumber;
}

console.log(countDivs('<!DOCTYPE html><html><head lang="en"><meta charset="UTF-8"><title>index</title><script src="/yourScript.js" defer></script></head><body><div id="outerDiv"><div class="first"><div><div>hello</div></div></div><div>hi<div></div></div><div>I am a div</div></div></body></html>'))
console.log(countDivs('<div>hello</div><a>hello</a>'));
console.log(countDivs('<!DOCTYPE html>' +
                        '<html>' +
                        '<head lang="en">' +
                            '<meta charset="UTF-8">' +
                                '<title>index</title>' +
                                '<script src="/yourScript.js" defer></script>' +
                            '</head>' +
                            '<body>' +
                                '<div id="outerDiv">' +
                                   '<div' +
                                    'class="first">' +
                                       '<div><div>hello</div></div>' +
                                    '</div>' +
                                    '<div>hi<div></div></div>' +
                                    '<div>I am a div</div>' +
                                '</div>' +
                            '</body>' +
                        '</html>'))