/*class Student1{
    String name;
    int age;
    static String unversity;
    public Student1(){
        System.out.println("??????");
    }
    public void show(){
        System.out.println(name+age+unversity);
    }
}
public class Test{
    public static void main(String[]args){
        //s1
        Student1 s1=new Student1();
        s1.name="????";
        s1.age=58;
        s1.unversity="????????????";
        s1.show();
        //s2
        Student1 s2=new Student1();
        s2.name="???";
        s2.age=48;
        s2.unversity="???????????";
        s2.show();
    }
}*/
/*class Person1{
    static String country;       //?????????????????
    String name;                 //????????????????????
}
public class Test{
    public static void main(String[]args){
        Person1 p1=new Person1();
        Person1 p2=new Person1();
        Person1.country="?й?";
        p1.name="????";
        p2.name="????";
    }
}*/
/*class Person1{
    static String country;        //?????????????????
    String name;                  //????????????????????
    static void printInfo(){      //???????
        System.out.println("Person?????????"+country);
    }
}
public class Test{
    public static void main(String[]args){
        Person1 p1 =new Person1();
        Person1.country="?й?";
        Person1.printInfo();      //?????????????????
        p1.printInfo();           //????????????????????
    }
}*/
/*class Person1{
    static String country;
    String name;
    static{//????????
        country="?й?";
        System.out.println("Person????????鱻???");
    }
    {//?????????
        name="??С??";
        System.out.println("Person?????????鱻???");
    }
    Person1(){//????????
        System.out.println("Person????????????");
    }
}
public class Test{
    static{//????????
        System.out.println("Test????????鱻???");
    }
    public static void main(String[]args){
        Person1 p1=new Person1();
        Person1 p2=new Person1();
    }
}*/
    /*public class Test {
        public static void main(String[] args) {
            String sl = "hello";
            String s2 = new String("hello");
            if (sl.equals(s2)) {
                System.out.println("相等");
            }else{
                System.out.println("不相等");
            }
        }
    }*/
/*import java.util.Scanner;
public class Test{
    public static void main(String[]args){
        int x;
        Scanner in =new Scanner(System.in);
        System.out.print("请输入一个正整数");
        x=in.nextInt();
        new PrimeSplit(x);
    }
}
class PrimeSplit{
    int k=2;
    public PrimeSplit(int x){
        if (x<=1){
            System.out.println(x+"是无效被分解数");
        }else if(x==2){
            System.out.println(x+"分解后的质因数为：1*"+x);
        }else{
            System.out.println(x+"分解后的质因数为：1");
            while(k<=x){
                if(x%k==0){
                    System.out.println("*" + k);
                    x =x / k;
                }else{
                    k++;
                }
            }
        }
    }

}
}*/
/*public class Test{
    public static void main(String[]args){
        double num1,num2;
        for (int i=0;i<100000;i++){
            num1=Math.sqrt((i+100));
            num2=Math.sqrt((i+268));
            if (num1==(int)num1 &&num2==(int)num2){
                System.out.println(i);
            }
        }
    }
}*/
/*public class Test{
    public static void main(String[]args){
        int count=1;
        for(int i=1;i<=4;i++){
            for(int k=1;k<=4;k++){
                for(int j=1;j<=4;j++){
                    if(!(i==j||i==k||j==k)){
                        if(count%10==0){
                            System.out.println(i*100+j*10+k);
                            count ++;
                        }else{
                            System.out.println(i*100+j*10+k+"___");
                            count ++;
                        }
                    }
                }
            }
        }
    }
}*/
/*public class Test{
    public static void main(String[]args){
        for(int i=1;i<1000;i++){
            int sum=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                    sum +=j;
                }
            }
            if(sum==1){
                System.out.println(i);
            }
        }
    }
}*/
import java.util.Scanner;
/*public class Test{
    public static void main(String[]args){
        double m=100;
        double count=0;for(int i=1;i<=10;i++){
            m=m/2;
            count +=m;
        }
        System.out.println("第十次回弹："+m+"米");
        System.out.println("共经过"+((count*2)+100)+"米");
    }

}*/
/*public class Test{
    class User{
        private String name;
        private int age;
        public String getName(){
            return name;
        }
        public static void main(String name){
            this.name=name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age=age;
        }
    }
    class Card{
        private String cardNumber;
        public String getCardNumber(){
            return cardNumber;
        }
        public void setCardNumber(String cardNumber){
            this.cardNumber=cardNumber;
        }
    }
    public static boolean openAccount(Card card,User user){
        if(user! =null&& card!=null && user.getAge()>=15){
            return true;
        }else{
            return false;
        }
    }
}*/
/*public class Test{
    public static void main(String[]args){
        Teacher teacher=new Teacher();
        teacher.name="张三";
        teacher.printName();
        teacher.work();
    }
}
class Person{
    String name;
    void work(){
        System.out.println("工作!");
    }
}
class Teacher extends Person{
    void printName(){
        System.out.println("教师姓名："+name);
    }
}*/
/*public class Test{
    public static void main(String[]args){
        Teacher teacher=new Teacher();
        teacher.printName();
        teacher.work();
    }
}
class Person{
    String name="人";
    void work(){
        System.out.println("工作！");
    }
}
class Teacher extends Person{
    String name="仓老师";
    void printName(){
        System.out.println("父类成员变量name="+super.name);
    }
    void work(){
        super.work();
    }
}*/
/*public class Test{
    int age=45;
}*/
/*public class Test{
    public static void main(String[]args){
        Outer O=new Outer();
        O.method();
        Outer o=Outer();
        o.method();
        o.show();
    }
}*/
/*public class Test{
    public static void main(String[]args){
        Outer o=new Outer();
        Outer o2=new Outer(20);
    }
}*/
/*public class Test{
    public static void main(String[]args){
        Outer o=new Outer();
        o.method();
    }
}*/
/**/
/*public class Test{
    public static void main(String args[]) {
        Teacher teacher = new Teacher();
        teacher.work();
    }
}
abstract class Person1{
    abstract void work();
}
class Teacher extends Person{
    void work(){
        System.out.println("教师的工作是教书！");
    }
}*/
/*public class Test{
    public static void main(String[]args){

    }
}*/
/*public class Test{
    public static void main(String[]args){
        int count =1;
        for(int i=1;i<=5;i++){
            count +=i;
        }
        System.out.println(count);
    }
}*/
public class Test{
    public static void main(String[]args){
        System.out.println(100%3);
        System.out.println(",");
        System.out.println(100%3.0);
        System.out.println("Hello"+9+1);
        System.out.println("hello world");
        System.out.println("github提交");
        System.out.println("2024年4月16日");
        System.out.println("阿南大帅哥   生日快乐  天天开心");
    }
}
