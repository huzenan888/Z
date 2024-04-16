public class Triangle {
    //属性私有化
    private double sideA,sideB,sideC;
    //构造方法
    public Triangle(){}
    public Triangle(double sideA,double sideB,double sideC){
        if(sideA<0||sideB<0||sideC<0){       //边长不可以为负值
            System.out.println("三角形边长不能为负，初始化失败！");
    }else if (((sideA+sideB)<sideC)||((sideA+sideC)<sideB)
                                   ||((sideB+sideC)<sideA)){
             //三边长能构成三角形的条件：任意两边长之和不大于第三边
            System.out.println("这三条边不能构成三角形，初始化失败!");
        }else{
            this.sideA=sideA;
            this.sideB=sideB;
            this.sideC=sideC;
        }
}
//getter方法、setter方法略
//计算面积
public double area(){
    double p=(sideA+sideB+sideC)/2;
    return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
    //计算周长
    public double perimeter(){
        return sideA+sideB+sideC;
    }
}
