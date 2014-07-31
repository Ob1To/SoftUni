function sumTwoHugeNumbers(value) {
    include('biginteger.js')
    var a = BigInteger(value[0])
    var b = BigInteger(value[1])
    var c = BigInteger()
    c = a.add(b);   

    return c.toString(10);
    
}

function include(filename) {
    var head = document.getElementsByTagName('head')[0];

    var script = document.createElement('script');
    script.src = filename;
    script.type = 'text/javascript';

    head.appendChild(script)
}
console.log(sumTwoHugeNumbers(['347135713985789531798031509832579382573195807',
 '817651358763158761358796358971685973163314321']
))
console.log(sumTwoHugeNumbers(['155', '65']))
console.log(sumTwoHugeNumbers(['123456789', '123456789']))
console.log(sumTwoHugeNumbers(['887987345974539', '4582796427862587']))
