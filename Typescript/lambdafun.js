// Normal Function
function getNextEven(n) {
    var result;
    result = n % 2 == 0 ? n + 2 : n + 1;
    return result;
}
console.log(getNextEven(5));
// Lambda Block
var nextEven = function (n) {
    return n = n % 2 == 0 ? n + 2 : n + 1;
};
console.log(nextEven(10));
// Lambda Expression
var nextEvenNumber = function (n) { return n % 2 == 0 ? n + 2 : n + 1; };
console.log(nextEvenNumber(15));
