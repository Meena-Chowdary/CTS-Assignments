// Default Parameters
console.log("default parameters");
function add(n1:number=10, n2:number=35) {
    return n1+n2;
}
console.log(add());
console.log(add(5,6));
console.log(add(7));
console.log("-------------------------");

// Optional Parameters
console.log("optional parameters")
function printF(msg?: string) {
    if (!msg) {
        msg = "Hello";
    }
    console.log(msg);
}
printF();
printF("TypeScript - JavaScript that Scales.");
console.log("-------------------------");

// rest parameters (varargs)
console.log("rest parameters")
function show(message : string, ...names:string[]) {
    for(let n of names) {
        console.log(message + " " + n);
    }
}

show("Hello ", "John", "Deo");
show("Hai ", "Anders Hejlsberg", "Rod Jhonson", "Bjarne Stroustrup", "Dennis Ritchie");
