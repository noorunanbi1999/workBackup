function checkArray(items, key) {
    // if(items.includes(key))console.log("Found")
    // else console.log("Key not found")   
    for (var i = 0; i < items.length; i++) {
        if (items[i] == key)
            console.log("Found");
    }
}
checkArray([1, 2, 3, 4, 5], 5);
