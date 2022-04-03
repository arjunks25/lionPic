package STDdraw;

import java.awt.*;
import java.util.Scanner;

public class test {


    public static void main(String[] args)
    {
        STDdraw1 std7=new STDdraw1();
        Scanner AX=new Scanner(System.in);
        System.out.println("Enter file path.");
        String str=AX.nextLine();
        canvas(1024, 1024);
        std7.filledSquare(1, 1, 1);
        setPicture(.5,.5,str,.5,.5);
        curves();
        curvesy2();
        curvesx2();


    }
    public static void curves()
    {
        STDdraw1 std2=new STDdraw1();
        std2.setPenColor(255,0,0);
        for(double x=0, y=1;x<=1&&y>=0;y=y-.01,x=x+.01)
        {
            std2.line(x, 0, 0, y);
        }
        for(double x=1, y=1;x>=0&&y>=0;y=y-.01,x=x-.01)
        {
            std2.line(x, 0, 1, y);
        }
        for(double x=1, y=0;x>=0&&y<=1;y=y+.01,x=x-.01)
        {
            std2.line(x, 1, 1, y);
        }
        for(double x=0, y=0;x<=1&&y<=1;y=y+.01,x=x+.01)
        {
            std2.line(x, 1, 0, y);
        }
    }
    public static void curvesy2()
    {
        STDdraw1 std3=new STDdraw1();
        std3.setPenColor(0,255,0);
        for(double x=0, y=2;x<=1&&y>=0;y=y-.02,x=x+.01)
        {
            std3.line(x, 0, 0, y);
        }
        for(double x=1, y=2;x>=0&&y>=0;y=y-.02,x=x-.01)
        {
            std3.line(x, 0, 1, y);
        }
        for(double x=1, y=-1;x>=-1&&y<=2;y=y+.02,x=x-.01)
        {
            std3.line(x, 1, 1, y);
        }
        for(double x=0, y=-1;x<=2&&y<=2;y=y+.02,x=x+.01)
        {
            std3.line(x, 1, 0, y);
        }
    }
    public static void curvesx2()
    {
        STDdraw1 std4=new STDdraw1();
        std4.setPenColor(0,0,255);
        for(double x=0, y=1;x<=2&&y>=0;y=y-.01,x=x+.02)
        {
            std4.line(x, 0, 0, y);
        }
        for(double x=1, y=1;x>=-1&&y>=0;y=y-.01,x=x-.02)
        {
            std4.line(x, 0, 1, y);
        }
        for(double x=1, y=0;x>=-1&&y<=1;y=y+.01,x=x-.02)
        {
            std4.line(x, 1, 1, y);
        }
        for(double x=0, y=0;x<=2&&y<=1;y=y+.01,x=x+.02)
        {
            std4.line(x, 1, 0, y);
        }
    }
    public static void setPicture(double x,double y,String piclocation,double xx,double yy)
    {
        STDdraw1 std9=new STDdraw1();
        std9.picture(x,y,piclocation,xx,yy);
    }
    public static void canvas(int x, int y)
    {
        STDdraw1 std5=new STDdraw1();
        std5.setCanvasSize(x, y);
    }
    //inversecurve
    //for(double x=1, y=0;x>=0&&y<=1;y=y+.01,x=x+.01)
//	{
//		std2.line(x, 1, 0, y);
//	}
//	for(double x=0, y=0;x<=1&&y<=1;y=y+.01,x=x-.01)
//	{
//		std2.line(x, 1, 1, y);
//	}



}
