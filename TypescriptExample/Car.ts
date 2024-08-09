export default class Car{
    speed:number;
    regularPrice:number;
    color:string;
    constructor(speed:number, price:number, color:string){
        this.speed=speed
        this.regularPrice=price
        this.color=color
    }
    getSalePrice():number{
        return this.regularPrice
    }
}