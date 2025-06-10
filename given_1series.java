class a_series{
/*   S=1-2+3-4+5......nth term  */

public static void main(String args[]){
int sum=0,s;
Scanner sc=new Scanner(System.in);
System.out.println("enter term: ");
int term=sc.nextInt();
for(int i=1;i<=term;i++){
if(i%2==0){
sum=sum+i;
}
else{
sum=sum-i;
}}
System.out.println("Total sum: ");
System.out.println(sum);

}}
