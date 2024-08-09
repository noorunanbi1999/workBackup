class Employee{
    empId:number;
    empName:string;z
    empSal:number;

    display():void{
        console.log(this.empId);
        console.log(this.empName);
        console.log(this.empSal);


    }
}

var e1=new Employee();
e1.empId=902;
e1.empName="Noor";
e1.empSal=2000000;
e1.display()