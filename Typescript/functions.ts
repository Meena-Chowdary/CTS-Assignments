// function add(n1 : number, n2:number) : number {
//     let result : number;
//     result = n1+n2;
//     return result;
// }
// console.log(add(10,20));

// function add(n1 : number, n2:number, n3:number) : number {
//     let result : number;
//     result = n1+n2+n3;
//     return result;
// }
// console.log(add(10,20,30));

// function diff(n1 : number, n2 : number) : number {
//     let result : number;
//     result = n1-n2;
//     return result;
// }
// console.log(diff(10,20));

//In above code we should have multiple function declarations but only 1 function implementation
//The below code works and this is called function overloading
function f1(x:number) : void;
function f1(s:string) : void;
function f1(x:number, s:string) : void;

function f1(n:any, s?:any) {
    console.log(`Value of ${n}, Type of ${n} = ${typeof(n)}`);
    if (s) {
        console.log(`Second Parameter : ${s},Type of ${typeof(s)}`);
    }
}

f1("Type Script");
f1(10);
f1(10, "PQR");
print();