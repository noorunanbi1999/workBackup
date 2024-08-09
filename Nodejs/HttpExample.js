const http=require('http')
const server= http.createServer((request,response)=>{
    if(request.url==="/"){
        response.writeHead(200,{'Content-Type':'text/html'})
        response.write('<h1>This is my first server</h1>')
        response.write('<h2>This is node server</h2>')
        response.end()
    }
})

const PORT=process.env.PORT|| 4321
server.listen(PORT,()=>console.log("Server Started"))