const http=require('http')
const fs=require('fs')
const path=require('path')

const server=http.createServer((req,res)=>{
    if(req.url==='/login'){
        fs.readFile(path.join(__dirname,'Assignment2','index1.html'),(err,data)=>{
            if(err)throw err
            res.writeHead(200,{'Content-Type':'text/html'})
            res.end(data)
        })

        fs.writeFile(path.join(__dirname,'Assignment2',))
    }


})
const PORT=process.env.PORT|| 4509
server.listen(PORT,()=>console.log('Sever started'))