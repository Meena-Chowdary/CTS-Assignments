greet = function(userName="Meena"){
    console.log("Hello " + userName);
}

setTimeout(greet,2000);
setTimeout(()=>{greet("Soumya");},1000);
console.log("Program Terminated");
setInterval(() => {greet("Vamsy");},2000);