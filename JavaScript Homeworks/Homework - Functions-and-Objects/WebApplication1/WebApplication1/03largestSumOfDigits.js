function findLargestBySumOfDigits(nums) {
    var sum=0;
    var maxSum=0;
    var numMaxSum;
    var final = 0;
   
    if ((nums.length)===0)
    {
        final= "undefined";
    }
    for (var i = 0; i < nums.length; i++) {
        if (isNaN(parseInt(nums[i])) === true) {
            final = "undefined";
            break
        }
    }
       if (final !== "undefined") {
           for (var j = 0; j < nums.length; j++) {
               var numToStr = nums[j].toString();
               numToStr=numToStr.replace("-",'');
               if (numToStr.indexOf(".") !== -1) {
                   final = "undefined"
                   break;
               }
               else{
               sum = 0;
               for (var k = 0; k < numToStr.length; k++) {
                   sum = sum + parseInt(numToStr[k]);
               }
               if (sum > maxSum) {
                   maxSum = sum;
                   final = nums[j];
               }
           }
           }
       }
             
       return final;
}

console.log(findLargestBySumOfDigits([5, 10, 15, 111]));
console.log(findLargestBySumOfDigits([33, 44, -99, 0, 20]));
console.log(findLargestBySumOfDigits(['hello']));
console.log(findLargestBySumOfDigits([5, 3.3]));


