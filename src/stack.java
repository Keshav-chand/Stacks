import java.util.Scanner;
public class stack {
int size;
int cpointer;
int a[];
stack(int s){//constructor
    size=s;
    a=new int[size];
    cpointer=-1;// last element of the array
}
boolean push(int x){
    if(cpointer>=(size-1)){
        System.out.println("Stack overflow");
        return false;
    }
    else{
        a[++cpointer]=x;
        System.out.println(x+"pushed into the stack");
        return true;
    }
}
int pop(){
    if(cpointer<0){
        System.out.println("stack underflow");
        return 0;
    }
    else{
        int x=a[cpointer--];
        return x;
    }
}
void printstack(){
    System.out.println("elements present in teh stack");
    for(int i=cpointer;i > -1;i--){
        System.out.println(a[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter the size of stack");
    int size=sc.nextInt();
    stack k= new stack(size);
    System.out.println("enter the elements to be pushed");
    int n=sc.nextInt();

    System.out.println("Enter" +n+"element to be pushed");
    for(int i=0;i<n;i++){
        int element=sc.nextInt();
        k.push(element);
    }

    System.out.println("enter the no of elements to pop");
    int m=sc.nextInt();
    System.out.println(m+"elements are popping form the stack");
    for(int i=0;i<m;i++){
        System.out.println(k.pop());  
    }

    System.out.println("element in the stack now");
    k.printstack();
}
}

    