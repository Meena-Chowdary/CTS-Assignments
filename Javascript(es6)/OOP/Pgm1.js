class Shop {
    
    constructor(title,price){
        this.title=title;
        this.price=price;                                             
    }

    estimateFor(quantity){
        return quantity*this.price;
    }

    discountedEstimateFor(quantity,discPercent){
        let estimate = this.estimateFor(quantity);
        return estimate * discPercent/100;
    }

    static getShopTitle(){
        return "E-Mart";
    }
}


console.log(Shop.getShopTitle());


f1 = new Shop("Dress",45);

console.log(f1);
console.log(f1.estimateFor(100));
console.log(f1.discountedEstimateFor(100,25));