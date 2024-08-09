var productArray = [
    { proName: "Mobile", price: 700 },
    { proName: "Mouse", price: 500 },
    { proName: "Tab", price: 800 }
];
var myData = productArray.map(function (value) {
    return value.price;
});
var myData1 = productArray.map(function (value) {
    return value.price;
});
console.log(myData1);
var myData2 = productArray.filter(function (value) { return (value.price > 600); });
console.log(myData2);
