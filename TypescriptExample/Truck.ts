import Car from "./Car";

class Truck extends Car {
    weight:number

    constructor(speed:number, regularPrice:number, color:string, weight:number){
        super(speed,regularPrice, color)
        this.weight=weight
    }

    getSalePrice(): number {
        if(this.weight>2000)
           return this.regularPrice * 0.9
        else
           return this.regularPrice * 0.8
    }

}

let truck = new Truck(180, 30000, "Red", 2100)
console.log(truck.getSalePrice());