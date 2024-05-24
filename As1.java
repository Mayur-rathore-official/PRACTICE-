import  java.util.Scanner;
 class Test {

 void One(){
float l= 70;
float P= 230;
float b= (P/2)-l;
float a =b*l;
    System.out.println("Breath of reactangle\t"  +b);
    System.out.println("Area of reactangle\t"    +a);
  }



 void two(){
float a=96;
float b=8;
float l=a/b;
 System.out.println("lenth of reactangle\t" +l);
 float Pe = (l+b)*2;
System.out.println("perimeter of reactangle\t" +Pe);
    
}

 void three()
{
  float tl= 13;
  float tb =7;
  float ta=tl*tb;
  float  wl =520;
  float wb= 140;
  float wa = wl*wb;
  System.out.println("area of tiles ="+ta);
  System.out.println(" area of wall="+wa);
  float no = wa/ta;
  System.out.println(" total no. of tiles="+no);
}

  void four()
{
  int a=20,b=30,c=50,d=100,e=80;
  int avg=(a+b+c+d+e)/5;
  System.out.println("the average of no="+avg);
  }
  

  void Five(){
int a=20,b=10,c;
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println(a+""+b);

  }





 }

                    
public class As1{
                    


  public static void main(String[] args) {
Test Obj  = new Test();
    
     Obj.One();
    // Obj.two();
    // Obj.three();
     Obj.four();
  }
}
