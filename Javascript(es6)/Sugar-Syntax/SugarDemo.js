//Multi-line strings
msg1="This is a txt msg"+
      "This is second line";
msg2=`This is a back quote msg.
    This is second line`;
console.log(msg1);
console.log(msg2);
//arrow functions - already told

//template literals
var name1="Meena";
var name2="Soumya";
var n=1;
msg3=name1+" and "+name2+" are friends from "+n+" month";//previous method
msg4=`${name1} and ${name2} are friends from ${n} month`;
console.log(msg3);
console.log(msg4);

//default parameters
function greetUser(userName="Meena"){ 
    return "Hello " + userName;
}
console.log(greetUser());
console.log(greetUser("Soumya"));

//Block variables
const MIN_BAL=500; //we use final in java for creating constants
if(true){
    var x=50;
    let y=45;
    z=15;//default type is var
    console.log(x);
    console.log(y);
    console.log(z);  
}
console.log(x);
//console.log(y); will generate error
console.log(z);

//Class and modules
class Box{
    constructor(){
        this.length=0;
        this.width=0;
        this.height=0;
    }
}
let b=new Box();
b.height=56;
b.width=4;
b.length=67;
console.log(b);
let b2=new Box();
b2={length:67,height:34,width:12};
console.log(2);
//destructing assignment
let{height,width}=b2;
console.log(height);
console.log(width);
