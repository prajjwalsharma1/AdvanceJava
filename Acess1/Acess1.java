package Acess1;

public class Acess1 {
public void mello(){
    for(int i=0;i<5;i++)
    {
        System.out.println("mello");
    }
    
}
    public  void hello(){

        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
        }
        
    }
    private static Acess1 instance;

private  Acess1(){

}




   public static Acess1 getAcess1(){
if(instance==null)
{

instance= new Acess1();

}
return instance;
}

public static void main(String[] args) {

Acess1 obj = getAcess1();
obj.mello();
Acess1 obj = getAcess1();
obj.hello();
System.out.println(obj);
System.out.println(obj);




}


}
