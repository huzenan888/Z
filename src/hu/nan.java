/*package hu;
import java.util.Scanner;
public class nan {
   public static void main(String[] args) {

      public static void testSwitch () {*/
        /*int a=6476;
        System.out.println("个位数为："+(a%10));
        a/=10;
        System.out.println("十位数为："+(a%10));
        a/=10;
        System.out.println("百位数为："+(a%10));
        a/=10;
        System.out.println("千位数为："+(a% 10));

    }
}*/
        /*int a = 1;
        int b = 7;
        int c = 10;
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}*/
        /*for (int i = 100; i <= 1000; i++) {
            int j = i % 10;
            int k = i / 10 % 10;
            int e = i / 10 / 10 % 10;
            if (j * j * j + k * k * k + e * e * e == i) {
                System.out.println("水仙花数：" + (i));
            }
        }
    }
}*/
  /* Scanner sc1=new Scanner(System.in);
    int a=sc1.nextInt();
    int b=sc1.nextInt();
    int c=sc1.nextInt();
   if (a>b&&a>c){
   System.out.println(a);
   } else if(b>a&&b>c){
      System.out.println(b);
   }else{
       System.out.println(c);
   }
}*/
            /*int a = sc1.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + "是一个偶数");
            } else {
                System.out.println(a + "是一个奇数");
            }
            if (a % 7 == 0) {
                System.out.println(a + "是七的倍数");
            } else {
                System.out.println(a + "不是七的倍数");
            }
        }
    }*/
      /*Scanner scan = new Scanner(System).in;
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
        }
    }
}*/
     /*int sum = 0, i = 1;        //sum的初值为0
      do {
         sum = sum + i;          //在循环体中进行累加
         i++;                    //计数器i值自增1
      } while (i <= 100);        //当i小于等于100时执行循环体
      System.out.println("1+2+3+......+100的和为：" + sum);
   }
}*/
     /* int sum,i;
      for (sum = 0, i = 1; i <= 100;i++){
         sum = sum + i;
      }
      System.out.println("1+2+3+......+100的值为：" + sum);
   }
}*/
     /* Scanner a = new Scanner(System.in);
      int n = a.nextInt();
      int i = 2, b = 2;
      while (i <= n) {
         b *= 2;
         i++;
      }
      System.out.println("2的" + n + "次方为" + b);
   }
}*/
      /*System.out.println("表演得怎么样？(y/n):");
      Scanner sc = new Scanner(System.in);
      String answer = sc.next();
      while (answer != "y") {
         System.out.println("早上5点开始练声！");
         System.out.println("上午练习钢琴！");
         System.out.println("下午到声乐老师家练习唱歌！");
         System.out.println("晚上练习舞蹈基本功！");
         System.out.println("表演得怎么样？");

         Scanner sc1 = new Scanner(System.in);
           answer = sc1.next();
          System.out.println("圆满完成！");

      }
   }
}*/
      /*double i = 0.1 / 1000;
      double mount = 8844.43;
      int count = 0;
      for (; i <= mount; i *= 2) {
         count++;
      }
      System.out.println("需要折叠" + count + "次");

   }
}*/
     /*int m = 7;
      int i;
      for (i = 2; i <= Math.sqrt(m); i++)
         if (m % i == 0)
            break;
      if (i > Math.sqrt(m)) {
         System.out.println(m+"是素数");
      } else {
         System.out.println(m+"不是素数");

      }
   }
}*/
     /* int i = 1, n;
      while (true) {
         n = i * i;
         System.out.println(+i + "的平方是" + n);
         i++;
         if (i > 9)
            break;
      }
   }
}*/
     /* int count = 0;
      for (int i = 100; i <= 200; i++) {
         if (i % 3 == 0)
            continue;
         System.out.print(i + "   ");
         if (++count % 10 == 0) {
            System.out.println();
         }
      }
   }
}*/
      /*for (int i = 1; i <= 9;i++){
         for (int j = 1; j <= i; j++)
            System.out.print(j + "*" + i + "=" + i * j + "\t");
         System.out.println();
      }
   }
}*/
    /*  for (int i = 1; i <= 4; i++) {
         for (int j = 1; j <= 5; j++)
            System.out.print("*");
         System.out.println();
      }
   }
}*/
      /*for (int i = 0; i < 5; i++) {
         for (int k = 0; k < 4 - i; k++) {
            System.out.print(" ");
         }
         for (int j = 0; j < i + 1; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}*/
      /*int x, y;
      for (x = 1; x < 35; x++) {
         y = 35 - x;
         if (2 * x + 4 * y == 94)
            System.out.println("鸡：" + x + "兔：" + y);
      }
   }
}*/
     /* Scanner input = new Scanner(System.in);
      int number = (int) (Math.random() * 100);     //产生随机数
      int guess;                             //用户猜的数字
      int count = 0;                           //猜测的次数
      System.out.println("我心里有一个0到99之间的整数，你猜是什么？");
      //用户猜测随机数
      do {
         guess = input.nextInt();
         if (number < guess) {
            System.out.println("大了点，继续猜！");
            count++;
         } else if (number > guess) {
            System.out.println("小了点，继续猜！");
            count++;
         } else {
            count++;
            break;
         }
      } while (true);
      System.out.println("这个数字是" + number);
      System.out.println("你猜的次数是" + guess);
      //根据猜测数字给出评价
      if (count == 1) {
         System.out.println("你也太懂我了吧！");
      } else if (count >= 2 && count <= 5) {
         System.out.println("猜这么多次才猜对，感情淡了!");
      } else {
         System.out.println("你不懂我的心!");
      }
   }
}*/
      /*int[][] intArray = {{1, 2}, {2, 3}, {3, 4, 5}};
      int sum = 0;
      for (int i = 0; i < 3;i++){
         for (int j = 0; j < intArray[i].length; j++) {
            sum += intArray[i][j];
         }
      }
      System.out.println("矩阵各元素的和为："+sum);
   }
}*/
//每个一维数组保存一个商品信息
    /*  String[] p1 = {"衣服", "150", "这件衣服也太好看了吧！"};
      String[] p2 = {"帽子", "38", "这个帽子也太时尚了吧！"};
      String[] p3 = {"鞋", "88", "这个鞋子也太减震了吧！"};
      String[] p4 = {"手套", "18", "这个手套也太保暖了吧！"};
//定义二维数组用来保持四条商品信息
      String[][] product = new String[4][];
//初始化二维数组，将商品信息存入
      product[0] = p1;
      product[1] = p2;
      product[2] = p3;
      product[3] = p4;
      System.out.println("请输入你要查询的商品名称：");
      Scanner sc = new Scanner(System.in);
      String nameSelect = sc.next();
      sc.close();
//根据商品名称查找信息
      boolean success = false;
      for (int i = 0; i < product.length; i++) {
         if (product[i][0].equals(nameSelect)) {
            success = true;
            System.out.println("你要查找的商品的具体信息为：");
            System.out.println("商品名称：" + product[i][0]);
            System.out.println("商品价格：" + product[i][1]);
            System.out.println("商品描述:" + product[i][2]);
         }
      }
//商品不存在提示信息
      if (false == success) {
         System.out.println("你要查找的商品不存在");
      }
   }
}*/
/*package hu;
public class nan {
    public static void main(String[] args) {
        isEvenNumber();
    }

    //方法
    //public static void main(String[]args){1 usage
    public static void isEvenNumber() {
        int num = 18;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }
}*/
package hu;
import java.util.Scanner;
public class nan {
  public static void main(String args[]) {
    double a = 68.9;
    double b = 88.8;
    double c = 53.5;
    Max(a, b, c);
  }

  public static void Max(double a, double b, double c) {
    double number = 0;
    number = (a + b + c) / 3;
    System.out.println("平均数为：" + number);
  }

  Scanner input = new Scanner(System.in);

  {
    System.out.println("请输入一个整数：");
    int num = input.nextInt();
    String result = (num % 2 == 0) ? "over" : "odd";
    System.out.println("result");
  }
}
 /* public static void main(String[] args) {
    int sum = sum(7, 3);
    System.out.println(sum);
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static double sum(int a, int b, int c, int d) {
    return a + b + c + d;
  }
}
    public static void main(String[]args) {
      System.out.println(compare(5, 8));
    }
      public static boolean compare(int a,int b){
        return a==b;
      }
    }*/

