class Staff{
public String NAME, SID;
public int NUM, SAL;
Staff(String n, String id, int ph, int sa){
NAME = n;
SID = id;
NUM = ph;
SAL = sa;
}
}
class Teaching extends Staff{
String domain, publications;
Teaching(String n, String id, int ph, int sa, String d, String p){
super(n, id, ph, sa);
domain = d;
publications = p;
}
public String toString(){
return "NAME: " + NAME +"\nStaffID: "+ SID +"\nPhone Number: "+ NUM +"\nSalary: "+ SAL +"\nDomain: "+ domain +"\nPublications: "+ publications;
} 
}
class Technical extends Staff{
String skill;
Technical(String n, String id, int ph, int sa, String skill){
super(n, id, ph, sa);
this.skill = skill;
}
public String toString(){
return "Name: "+ NAME +"\nStaffID: "+ SID +"\nPhone Number: "+ NUM +"\nSalary: "+ SAL +"\nSkills: "+skill;
}
}
class Contract extends Staff{
int period;
Contract(String n,String id, int ph, int sa, int p){
super(n,id,ph,sa);
period = p;
}
public String toString(){
return"Name: "+ NAME +"\nStaffID: "+ SID +"\nPhone Number: "+ NUM +"\nSalary: "+ SAL +"\nPeriod[Months]: "+period;
}
}
class Main{
public static void main(String[] args){
Teaching te = new Teaching("Professor2", "Ods00cse004", 88888888, 90000, "Web Development", "Java Manual");
Technical tt = new Technical("Professor1", "0ds00cse001", 99999999, 99000, "Professional Debugger");
Contract co = new Contract("Professor3", "0ds00cse002", 77777777, 75000, 15);
System.out.println(te);
System.out.println(tt);
System.out.println(co);
}
}
