function getArray(items) {
    return new Array().concat(items);
}
var increment = getArray([3, 4, 5, 6]);
increment.push('c');
console.log(increment);
var datastring = getArray(['c', 'a', 'd']);
datastring.push(2);
console.log(datastring);
function getArrayData(items) {
    return new Array().concat(items);
}
var abc = getArrayData([1, 2, 3]);
abc.push(6);
console.log(abc);
