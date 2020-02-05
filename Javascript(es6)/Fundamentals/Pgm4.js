//declaring and defining functions

function f1(){
    console.log("function with no parameters and no return");    
}

function f2(userName){
    console.log("function with parameters and no return");    
    console.log("received " + userName);
}
            
function f3(userName){
    console.log("function with parameters and return");    
    console.log("received " + userName);
    return "Hello " + userName;
}

//call them
f1();
f2("Meena");
console.log(f3("Meena"));