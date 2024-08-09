class pics {
    id: number;
    url: string;

    constructor(id:number,url:string)
    {
        this.id=id;
        this.url=url;
    }
}

const url = 'https://jsonplaceholder.typicode.com/photos';
fetch(url).then(response => response.json()).then((data: pics[]) => {data.filter(photo => photo.id > 20 && photo.id < 30).forEach(photo => console.log(photo.url));});