class Box{
    about(){
        return "I am Box";
    }
}
class BigBox extends Box{
    about(){
        return super.about()+" and I am Big";
    }
}
b1=new Box();
b2=new BigBox();
console.log(b1.about());
console.log(b2.about());