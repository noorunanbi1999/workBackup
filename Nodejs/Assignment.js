const fs=require('fs')
const path=require('path')
const http=require('http')

// fs.mkdir(path.join(__dirname,'Training Details'),{},function(err){
//     if(err)throw err
//     console.log("Directory Created")
// })


fs.writeFile(path.join(__dirname,'Training Details','./student.txt'),'Name:Noor',(err)=>{
    if(err)throw err
    console.log("File has be written")
} )

fs.readFile(path.join(__dirname,'Training Details','./student.txt'),(err,data)=>{
    if(err)throw err
    console.log("The file data is=>")
    console.log(data.toString())
})

