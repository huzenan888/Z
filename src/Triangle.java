public class Triangle {
    //����˽�л�
    private double sideA,sideB,sideC;
    //���췽��
    public Triangle(){}
    public Triangle(double sideA,double sideB,double sideC){
        if(sideA<0||sideB<0||sideC<0){       //�߳�������Ϊ��ֵ
            System.out.println("�����α߳�����Ϊ������ʼ��ʧ�ܣ�");
    }else if (((sideA+sideB)<sideC)||((sideA+sideC)<sideB)
                                   ||((sideB+sideC)<sideA)){
             //���߳��ܹ��������ε��������������߳�֮�Ͳ����ڵ�����
            System.out.println("�������߲��ܹ��������Σ���ʼ��ʧ��!");
        }else{
            this.sideA=sideA;
            this.sideB=sideB;
            this.sideC=sideC;
        }
}
//getter������setter������
//�������
public double area(){
    double p=(sideA+sideB+sideC)/2;
    return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
    //�����ܳ�
    public double perimeter(){
        return sideA+sideB+sideC;
    }
}
