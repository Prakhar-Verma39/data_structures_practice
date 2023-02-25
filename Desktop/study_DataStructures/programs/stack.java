import java.io.*;
class stack
{
public static int n,top=-1;
public static int[] ar;

static void push( int x ){
if(top==n-1)
System.out.println("Stack is full");
else{
top+=1;
ar[top]=x;
}
}
static void pop(){
if(top==-1)
System.out.println("stack is empty");
else
{System.out.println(ar[top]);
top=top-1;}
}
static void elements(){
int i;
if(top==-1)
System.out.println("stack is empty");
else
{
System.out.println("stack elements are : ");
for(i=0;i<=top;i++){
System.out.println(ar[i]);}
}
}
public static void main(String a[])throws IOException
{
BufferedReader on=new BufferedReader(new InputStreamReader(System.in));
int i;
System.out.println("enter the maximum the size of stack");
n=Integer.parseInt(on.readLine());
ar= new int[n];
for(i=0;i<n;i++)
{
ar[i]=0;
}
System.out.println("Enter 0: exit 1: push 2: pop 3: get stack ");
short v=Short.parseShort(on.readLine());
while(v!=0){
switch(v){
case 1:
push(Integer.parseInt(on.readLine()));
break;
case 2:
pop();
break;
case 3:
elements();
break;
default:
System.out.println("Wrong choice"); 
 }
 System.out.println("Enter 0: exit 1: push 2: pop 3: get stack ");
v=Short.parseShort(on.readLine()); 
 }}
 }
