 public class Main01{
public static void main(String args[]){
int t1=0,t2=1,t3,n=10;
System.out.println( t1 +" "+t2);
for(int i=2;i<n;++i){

 t3=t1+t2;
System.out.println( " "+t3);

t1=t2;
t2=t3;
}
}
}