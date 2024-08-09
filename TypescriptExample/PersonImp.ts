import { PersonInterface } from "./PersonInterface";
class PersonImp implements PersonInterface{
    firstName: string;
    lastName: string;
    getFullName(): string {
        return this.firstName+this.lastName;
    }
}

var p1=new PersonImp();
p1.firstName="Noor ";
p1.lastName="Un Nabi";
console.log(p1.getFullName())