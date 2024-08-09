const fs=require('fs')
const path=require('path')

// fs.mkdir(path.join(__dirname,'test'),{},function(err){
//     if(err)throw err
//     console.log("Created Directory")
// })

// fs.writeFile(path.join(__dirname,'test','./MyData.html'),
// '<h1>This is my new File</h1>',(err)=>{
//     if(err)throw err
//     console.log("error while creating")
// })

fs.readFile(path.join(__dirname,'test','./MyData.html'),
'utf-8',(err,data)=>{
    if(err)throw err
    console.log(data)
})