const http=require('http')
const fs=require('fs')
const path=require('path')

const server=http.createServer((req,res)=>{
    if(req.url==='/'){
        fs.readFile(path.join(__dirname,'Public','index.html'),(err,data)=>{
            if(err)throw err
            res.writeHead(200,{'Content-Type':'text/html'})
            res.end(data)
        })
    }

    if(req.url==='/about'){
        fs.readFile(path.join(__dirname,'Public','about.html'),(err,data)=>{
            if(err)throw err
            res.writeHead(200,{'Content-Type':'text/html'})
            res.end(data)
        })
    }

    if(req.url==='/api/users'){
        const users=[{name:'Noor'},{name:"Aryan"},{name:"Abdul"}]
        res.writeHead(200,{'Content-Type':'text/html'})
        res.end(JSON.stringify(users))
    }

})
const PORT=process.env.PORT|| 4500
server.listen(PORT,()=>console.log('Sever started'))