//package com.test.pa;
//
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
//
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileOutputStream;
//
///**
// * @Author 101217
// * @Date 2021/8/4
// * @Version 1.0
// */
//public class CreatePic {
//    public String createJpgByFont(String s, int smallWidth, Color bgcolor, Color fontcolor, String fontPath, String jpgname) {
//        try {
////宽度 高度
//            BufferedImage bimage = new BufferedImage(s.length()*smallWidth/2,smallWidth,BufferedImage.TYPE_INT_RGB);
//            Graphics2D g = bimage.createGraphics();
//            g.setColor(bgcolor); //背景色
//            g.fillRect(0, 0,smallWidth*s.length(), smallWidth); //画一个矩形
//            System.out.println( s.length()+" "+smallWidth);
//            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
////去除锯齿(当设置的字体过大的时候,会出现锯齿)
//            g.setColor(fontcolor); //字的颜色
//            File file = new File(fontPath); //字体文件
//            Font font = Font.createFont(Font.TRUETYPE_FONT, file);
////根据字体文件所在位置,创建新的字体对象(此语句在jdk1.5下面才支持)
//            g.setFont(font.deriveFont((float) smallWidth));
////font.deriveFont(float f)复制当前 Font 对象并应用新设置字体的大小
//            g.drawString(s,0, smallWidth);
////在指定坐标除添加文字
//            g.dispose();
//            FileOutputStream out = new FileOutputStream(jpgname); //指定输出文件
//            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//            JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(bimage);
//            param.setQuality(50f, true);
//            encoder.encode(bimage, param); //存盘
//            out.flush();
//            out.close();
//        } catch (Exception e) {
//            System.out.println( "createJpgByFont Failed!");
//            e.printStackTrace();
//        }
//        return "Retruning";
//    }
//    public String getRandomNumber(){//取随机数字符串
//        double s=Math.random()*10000;
//        long t=Math.round(s);
//        String st=new Long(t).toString();
//        System.out.println(st);
//        return st;
//    }
//
//}
