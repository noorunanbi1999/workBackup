function checkArray(items:number[],key:number){   
    for(let i=0;i<items.length;i++){
        if(items[i]==key)console.log("Found")
    } 
}


checkArray([1,2,3,4,5],5);
