class ProductDetails
{
    pId
    pName
    pPrice
 
    constructor(id,name,price)
    {
        this.pId=id;
        this.pName=name;
        this.pPrice=price;
    }
 
    display()
    {
        console.log(`Product ID ${this.pId},Product Name ${this.pName},Product Price ${this.pPrice}`)
    }
}
 
module.exports=ProductDetails;