function solve(input) {


    var arr = [], sortedArr = [],
        n = input[0],
        i;

    for (i = 0; i < n; i += 1) {
        // liniiki[i] = ip user time
        var lineSplit = input[i + 1].split(' '); // [0] = ip; [1] = user; [2] = time

        if (arr[lineSplit[1]]) { // if user already has entry
            arr[lineSplit[1]].time += parseInt(lineSplit[2]);
            arr[lineSplit[1]].IPs.push(lineSplit[0]);
        } else {
            arr[lineSplit[1]] = {
                time: parseInt(lineSplit[2]),
                IPs: [lineSplit[0]]
            };
        }
    }
    
    for (i in arr) {
        // remove duplicates
        arr[i].IPs = arr[i].IPs.filter(function (elem, pos, self) {
            return self.indexOf(elem) === pos;
        });

        // sort IPs
        arr[i].IPs.sort(function (a, b) {
            return a.localeCompare(b);
        });

        sortedArr.push([i, arr[i]]);
    }

    sortedArr.sort(function (a, b) {
        return a[0].localeCompare(b[0]);
    });

    for (i = 0; i < sortedArr.length; i += 1) {
        var key = sortedArr[i][0], // name
            value = sortedArr[i][1]; // .time = duration; .IPs = ips

        console.log(key + ': ' + value.time + " [" + value.IPs.join(', ') + "]");
    }
}