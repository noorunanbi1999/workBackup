export class Student{
    stdID:number;
    stdName:string;
    stdClass:number;
    constructor(id:number,name:string,classs:number){
        this.stdID=id;
        this.stdName=name;
        this.stdClass=classs;
    }

    display():void{
        console.log(this.stdID);
        console.log(this.stdName);
        console.log(this.stdClass);
        console.log(" ");

    }

}

var obj1=new Student(12,"Noor",5);
var obj2=new Student(143,"Abdul",10);

obj1.display();
obj2.display();