var productArray=[
    {proName:"Mobile",price:700},
    {proName:"Mouse",price:500},
    {proName:"Tab",price:800}
]

let myData=productArray.map(function(value){
    return value.price;
})

let myData1=productArray.map((value)=>{
    return value.price;
})
console.log(myData1);

let myData2=productArray.filter((value)=>(value.price>600));
console.log(myData2);