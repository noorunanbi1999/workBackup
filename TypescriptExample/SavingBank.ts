import {Bank} from './Banks';
class SavingBank extends Bank{
    constructor(id:number,name:string,bal:number,dex:string){
        super(id,name,bal)
    }
    deposite(amount:number):number{
         console.log("now iam being called");
        // return this.accBal+=amount;
        return super.deposite(amount)
    }
}

var s1=new SavingBank(1,"Noor",1000,"desc");
s1.display();
s1.deposite(800);
s1.display();
