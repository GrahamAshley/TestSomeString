package com.test.pa;

/**
 * @Author 101217
 * @Date 2021/8/5
 * @Version 1.0
 */

/**
 * 方法静态分派演示
 * @author zzm
 */
public class StaticDispatch {
    static abstract class Human {
    }

    static class Man extends Human {
        public static void say(){
            System.out.println("---");
        }
    }

    static class Woman extends Human {
    }

    public void sayHello(Human guy) {
        System.out.println(guy.getClass().getName());
    }

    public void sayHello(Man guy) {
        System.out.println("hello,gentleman!");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) throws Exception {
//      pdf2jpg("C:\\Users\\user\\Downloads\\2017-2018学年桓潭中学九年级段考化学.pdf","d:\\");
    }

//    public static List<String> pdf2jpg(String pdffilepath, String jpgfilepath) throws Exception {
//        List<String> imgs = new ArrayList<>();
//        Document document = new Document();
//        document.setFile(pdffilepath);
//        float scale = 2.5f;// 缩放比例
//        float rotation = 0f;// 旋转角度
//        for (int i = 0; i < document.getNumberOfPages(); i++) {
//            String exportJpgFilePath = "";
//
//            //ImageIO.setUseCache(false);
//            BufferedImage image = (BufferedImage) document.getPageImage(i,
//                    GraphicsRenderingHints.SCREEN,
//                    org.icepdf.core.pobjects.Page.BOUNDARY_CROPBOX, rotation,
//                    scale);
//            RenderedImage rendImage = image;
//            File file = null;
//            try {
//                exportJpgFilePath = jpgfilepath + "_" + (i + 1) + ".jpg";
//                file = new File(exportJpgFilePath);
//                //ImageIO.setCacheDirectory(file);
//                ImageIO.write(rendImage, "jpg", file);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            image.flush();
//            //File file = new File("");
//            imgs.add(exportJpgFilePath);
//        }
//        document.dispose();
//        return imgs;
//    }
}
