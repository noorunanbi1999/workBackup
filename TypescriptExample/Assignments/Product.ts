
class Product{
    pId:number
    pName:string
    price:number
 
    constructor( pId:number, pName:string, price:number){
        this.pId=pId
        this.pName=pName
        this.price=price
    }
    addGst():number{
        return this.price*1.18
    }
    display():void{
        console.log(this.pId+" "+this.pName+" "+this.addGst())
        
    }
}
var p1=new Product(1,'bat', 100);
var p2=new Product(2,'ball', 200);
p1.display();
p2.display();
 