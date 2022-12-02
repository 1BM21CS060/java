import java.util.Scanner;
class student{
String usn,name;

int[] marks=new int[3];
double result=0;
int[] credits=new int[3];
int total = 0;
void accept(){
Scanner s=new Scanner(System.in);
System.out.println("Enter Usn");
usn=s.next();
System.out.println("Enter name");
name=s.next();
System.out.println("Enter marks in 3 subjects");
for(int i=0;i<3;i++)
{
marks[i]=s.nextInt();
}
System.out.println("enter credits for 3 subjects");
for(int i=0;i<3;i++)
{
credits[i]=s.nextInt();
}
}
void calculate()
{
for(int i=0;i<3;i++)
{
if(marks[i]>=90 && marks[i]<=100)
result+=10*credits[i];
if(marks[i]>=80 && marks[i]<90)
result+=9*credits[i];
if(marks[i]>=70 && marks[i]<80)
result+=8*credits[i];
if(marks[i]>=60 && marks[i]<70)
result+=7*credits[i];
if(marks[i]>=50 && marks[i]<60)
result+=6*credits[i];
if(marks[i]>=40 && marks[i]<50)
result+=5*credits[i];
else result+= 0*credits[i];
}
for(int i=0;i<3;i++)
total+=credits[i];
result=result/total;
}
void display()
{
System.out.println("Name:"+name+"Usn:"+usn);
System.out.println("credits marks");
for(int i=0;i<3;i++)
System.out.println(credits[i]+" " +marks[i]);
System.out.println("total credits=" +total);
System.out.println("SGPA=" +result);
}
}
class Studentsgpa
{
public static void main(String arr[])
{
student s1 = new student();
s1.accept();
s1.calculate();
s1.display();
}
}

