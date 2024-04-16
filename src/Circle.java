public class Circle {
    //属性私有化
    private double radius;
    //构建方法
    public Circle(){}
   public Circle(double radius){
        this.radius=radius;
   }
   //公有方法
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius<0){              //属性合理性判断
            System.out.println("半径值不能为负！");
    }else{
            this.radius=radius;
        }
}
//计算面积
public double area(){
    return Math.PI*radius*radius;
    }
    //计算周长
    public double perimeter(){
        return 2*Math.PI*radius;
    }

}
