public class Circle {
    //����˽�л�
    private double radius;
    //��������
    public Circle(){}
   public Circle(double radius){
        this.radius=radius;
   }
   //���з���
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius<0){              //���Ժ������ж�
            System.out.println("�뾶ֵ����Ϊ����");
    }else{
            this.radius=radius;
        }
}
//�������
public double area(){
    return Math.PI*radius*radius;
    }
    //�����ܳ�
    public double perimeter(){
        return 2*Math.PI*radius;
    }

}
