var v1 : number = 10;
var v2 : string = "Hello";
var v3 : boolean = true;
var v4 : string;//undefined variable
var v5 : string = null;//null variable

console.log(v1);
console.log(v2);
console.log(v3);
console.log(v4);
console.log(v5);

console.log("The value of v1 = " + v1 + ", value of v2 = " + v2 + " value of v3 = " + v3);
// Interpolation using back quotes
console.log(`The value of v1 = ${v1}, value of v2 = ${v2}, value of v3 = ${v3},value of v4=${v4},value of v5=${v5}`);