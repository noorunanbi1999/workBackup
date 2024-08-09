function getArray(items:any[]):any[]{
    return new Array().concat(items)
}

var increment=getArray([3,4,5,6]);
increment.push('c');
console.log(increment);

var datastring=getArray(['c','a','d']);
datastring.push(2);
console.log(datastring);

function getArrayData<T>(items:T[]):T[]{
    return new Array<T>().concat(items)
}

var abc=getArrayData<number>([1,2,3])
abc.push(6);
console.log(abc);