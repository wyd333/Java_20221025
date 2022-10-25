import java.util.Scanner;

import static java.lang.System.out;
import static java.util.Scanner.*;

public class ScannerDemo {
        public static void main(String[] args) {
            int width,length,area;
            //实例化一个Scanner对象实例scan
            Scanner scan = new Scanner(System.in);
            out.print("请输入宽");
            //利用nextInt()方法获取从键盘输入的下一个int类型数值
            width = scan.nextInt();
            out.print("请输入长");
            length = scan.nextInt();
            //调用类方法getArea()，并将返回值赋值给area
            area = getArea(width,length);
            out.println("矩形的长为：" + length + "；宽为：" + width + ";面积为" + area);

        }
        static int getArea(int x,int y){
            return x*y;
        }
}
