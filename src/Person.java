// public class Person {
     /* //成员--私有化
      private String name = "Tom";
      private int age;*/
/*
    //成员方法--公有化
    public String getName() {
        return name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        //对年龄参数进行合理性检查，确保年龄非负
        if (a < 0) {
            System.out.println("年龄值不能为负数！");
        } else {
            age = a;
        }
    }

    public void introduce() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了~");
    }
}
           class EX3_2 {
            public static void main(String[] args) {
                Person p = new Person();
                p.setAge(-10);
                p.introduce();
            }
        }*/
//构建方法重载
 /*public Person (){
 name="无名氏";age=1;
 }
 public Person (String n,int a){
     name=n;age=a;
 }
 public void introduce(){
     System.out.println("大家好，我叫"+name+",今年"+age+"岁了~");
 }
 }
 class EX3_3{
    public static void main(String[]args){
        Person p1=new Person();
        Person p2=new Person("Jerry",18);
        p1.introduce();
        p2.introduce();
    }
 }*/
     //构建方法
 /*public Person(){
 this("无名氏",1);      //调用本类其他构造方法
 }
 public Person(String name,int age){
     this.name=name;             //成员变量与局部变量同名，被隐藏，通过“this.成员变量”调用
     this.age=age;
 }
 public void introduce(){
             System.out.println("大家好，我叫"+name+",今年"+age+"岁了~");
             this.ff();         //"this."可以省略不写，等价与ff();
 }
 public void ff(){
     System.out.println("ff()方法被调用");
 }
 }
 class EX3_4{
    public static void main(String[]args){
        Person p1=new Person();
        p1.introduce();
        }
 }*/
 /*class Student {
     String name;
      int age;
      String University;

     public void show() {
         System.out.println(name + "," + age + "," + University);
         public class StudentTest {
             public static void main(String[] args) {
                 Student s = new Student();
                 s.name = "ahua";
                 s.age = "18";
                 s.show();
                 s.University = "mx";
             }
         }
     }
 }*/
 /*public static void main(String[]args){
 Circle circle=new Circle(10);
 System.out.println("圆的面积"+circle.area());
 System.out.println("圆的周长"+circle.perimeter());
 Triangle tri=new Triangle(2,2,3);
 System.out.println("三角形的面积"+tri.area());
 System.out.println("三角形的周长"+tri.perimeter());
 }
 }*/
//public class Person {
    /*private static Person instance=new Person();
    private Person(){}
    public static Person getInstance(){
        return instance;
    }
    public static void main(String[]args){
        Person s1=Person.getInstance();
        Person s2=Person.getInstance();
        if(s1.equals(s2)){
            System.out.println("创建的是同一个对象实例");
        }else{
            System.out.println("不是同一个对象实例");
        }
    }
}*/
    /*public static void main(String[] args) {
        int MylntArray[] = {10, 203040, 506070};
        int s = 0;
        for (int i = 0; i < MylntArray.length;
        i++)
        if (i % 2 == 1)
            s += MylntArray[i];
        System.out.println(s);
    }
}*/
    /*import.java.io.*;
public class abc{
public static void main(String args[]){
  AB s=new AB("Hello","I love JAVA");
  System.out.println(s.to String());
}
System.out.println("aF"+a+"\nb="+b);
}
class Subclass extends SuperClass{
    int c;
    SubClass(int aa,int bb,int cc){
        super(aa,bb);
        c=cc;
    }
}
class SubSubClass extends SubClass{
    int a;
    SubSubclass(int aa,int bb,int cc);
    A=aa+bb+cc;
}
void show(){
    System.out.println("a="+a+"\nb="+b+"\nc="+c);
}

}*/
/*public class Person1{
static int arr[]=new int[5];
public static void main(String[]args){
    System.out.println(arr[0]);
}
}
}*/
/*public class Person {
    int num = 88;
    private int num2 = 20;

    public class person {
        public void show() {
            System.out.println(num);
            System.out.println(num2);

        }
    }
}*/
/*public class Person{
    public static void main(String[]args){
        Outer o=new Outer();
        o.method();
    }
}*/
/*public class Person {
    public static void main(String[] args) {
        Outer O=new Outer();
        O.show();
    }
}
public class Outer extends Test{
    int age=20;
    int height=188;
    public void show(){
        System.out.println(age);
        System.out.println(height);
    }
}*/
/*public class Person{
    public final void method(){
        System.out.println("父的method");
    }
}*/
/*public class Person{
    public Person(){
        System.out.println("父 无参构造函数");
    }
    public Person(int age){
        System.out.println("父 有参构造函数");
    }
}*/
/*public class Person{
    public void method(){
        System.out.println("父的method");
    }
}*/
/*public  class Person {
    public void eat() {
        System.out.println("兔子吃胡萝卜");
       // public void study() {
          //  System.out.println("学习");
        }
    }
//}*/
/*interface IAnimal{
    int ID=1;
    void run();
}
interface Valuable{
    void value();
}
class Panda implements IAnimal, Valuable{
    public void value(){
        System.out.println("熊猫是无价的");
    }
    public void run(){
        System.out.println("熊猫跑");
    }
}
public class Person{
    public static void main(String[]args){
        Panda panda=new Panda();
        panda.value();
        panda.run();
    }
}*/
/*public abstract class Person {
    private int age = 18;
    private final String name = "张三";

    public void show() {
        int age=20;
        System.out.println(age);
        name="李四";
        System.out.println(name);
    }
}
public abstract class Person{
    protected String bankName;
    protected double interestRate;
    protected int acount;
    protected double interest;
    public String getBankName(){
        return bankName;
    }
    public int getAcount(){
        return acount;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public double getInterest(){
        return this.interest;
    }
    public abstract void save(int saveAcount,int time);
    public abstract double caculateAmount();
}*/