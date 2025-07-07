import java.util.*;
class palindromme_string{
static char name='t';
int dob=25;
static int m=10;
//int op=3;
    static void get(){
        System.out.println(name);
    

    }
    void let(){
        System.out.println(dob);
        int j=3;
        System.out.println(j+m);
        j++;
        m++;
    }
    
    public static void main(String[] args) {
        
        palindromme_string s=new palindromme_string();
        s.let();
        s.let();
        System.out.println(args[1]);
    }
}
