// Default Parameters
console.log("default parameters");
function add(n1, n2) {
    if (n1 === void 0) { n1 = 10; }
    if (n2 === void 0) { n2 = 35; }
    return n1 + n2;
}
console.log(add());
console.log(add(5, 6));
console.log(add(7));
console.log("-------------------------");
// Optional Parameters
console.log("optional parameters");
function printF(msg) {
    if (!msg) {
        msg = "Hello";
    }
    console.log(msg);
}
printF();
printF("TypeScript - JavaScript that Scales.");
console.log("-------------------------");
// rest parameters (varargs)
console.log("rest parameters");
function show(message) {
    var names = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        names[_i - 1] = arguments[_i];
    }
    for (var _a = 0, names_1 = names; _a < names_1.length; _a++) {
        var n = names_1[_a];
        console.log(message + " " + n);
    }
}
show("Hello ", "John", "Deo");
show("Hai ", "Anders Hejlsberg", "Rod Jhonson", "Bjarne Stroustrup", "Dennis Ritchie");
