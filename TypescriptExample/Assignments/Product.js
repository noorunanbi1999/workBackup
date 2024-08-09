var Product = /** @class */ (function () {
    function Product(pId, pName, price) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
    }
    Product.prototype.addGst = function () {
        return this.price * 1.18;
    };
    Product.prototype.display = function () {
        console.log(this.pId + this.pName + this.addGst());
        // console.log(this.pName)
        // console.log(this.addGst())
    };
    return Product;
}());
var p1 = new Product(1, 'bat', 100);
var p2 = new Product(2, 'ball', 200);
p1.display();
p2.display();
