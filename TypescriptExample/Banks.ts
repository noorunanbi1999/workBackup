export class Bank{
   public accId:number;
    public accName:string;
    public accBal:number;
 
    constructor(id:number, name:string, bal:number){
        this.accId=id;
        this.accName=name;
        this.accBal=bal;
    }
    deposite(amount:number):number{
        return this.accBal+=amount;
    }
    display():void{
        console.log(this.accId);
        console.log(this.accName);
        console.log(this.accBal);
       
    }
}