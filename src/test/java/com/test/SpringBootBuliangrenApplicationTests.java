package com.test;

import cn.hutool.core.date.DateUtil;
import com.test.config.GetWorkbook;
import com.test.entity.MongoTest;
import com.test.entity.MyDataInfo;
import com.test.mapper.GetMapper;
import com.test.pa.IllegalMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ObjectUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @Author 101217
 * @Date 2021/7/2
 * @Version 1.0
 */


// 1--生产者
@SpringBootTest()
@RunWith(SpringRunner.class)
public class SpringBootBuliangrenApplicationTests {

    @Autowired//RabbitTemplate是模板对象,用来简化mq操作
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired(required = false)
    private GetWorkbook getWorkbook;

    @Autowired
    private GetMapper getMapper;
    // 2--不用写就是默认交换机
// 3--队列名称是：hello
// 发送的消息是HelloWorld
    @Test
    public void contextLoads() throws InterruptedException {       // 3--队列名字是：hello
        IllegalMessage illegalMessage = new IllegalMessage();
        illegalMessage.setClassName("IllegalMessage");
        illegalMessage.setCreateTime(new Date());
        illegalMessage.setDelay(0);
        illegalMessage.setMessageId(UUID.randomUUID().toString());
        illegalMessage.setTime(30);
        illegalMessage.setWorkNo("renyongshu");
        CorrelationData correlationData = new CorrelationData(illegalMessage.getMessageId());
        while (true){
            rabbitTemplate.convertAndSend("illegal.dlx.queue","dsadsadsa");
            rabbitTemplate.convertAndSend("illegal.ttl.exchange","illegal.ttl.routingkey", "HelloWorld", message -> {
                //设置延时超时时间
                message.getMessageProperties().setExpiration(String.valueOf(illegalMessage.getDelay() * 1000));
                return message;
            },correlationData);
            System.out.println("-------");
            Thread.sleep(1000);
        }
    }
    @Test
    public void testLancher(){
            int a[]={11,234,4,211,143,14,12,444,2};
            for (int i=0;i<a.length-1;i++){
            for (int k=0;k<a.length-i-1;k++){
                if (a[k]>a[k+1]){
                    int tmp= a[k];
                    a[k]=a[k+1];
                    a[k+1]=tmp;
                }
            }
        }
        for (int m=0;m<a.length;m++){
            System.out.print(a[m]+"\t");
        }
    }
    @Test
    public void testClass() {
        Random random = new Random();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String newFileName = df.format(new Date())+rannum+".png";

//截取为正方形图片,长宽自定义，我自己估摸着是195，这个可以根据自己情况自己设置大小
        try {
            //此处是要替代logo的自定义图片路径，自定义图片不要用透明的或者半透明的
            BufferedImage image = ImageIO.read(new File("C:\\Users\\user\\Pictures\\Screenshots\\b.jpeg"));
            //int w = image.getWidth();
            //int h = image.getHeight();
            BufferedImage output = new BufferedImage(195, 195, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = output.createGraphics();
            output = g2.getDeviceConfiguration().createCompatibleImage(195, 195, Transparency.TRANSLUCENT);
            g2.dispose();
            g2 = output.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillRoundRect(0, 0,195, 195, 720, 720);
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(image, 0, 0, 195, 195, null);
            g2.dispose();
            //这是生成的临时替换logo图片的保存路径
            ImageIO.write(output, "png", new File("C:\\Users\\user\\Pictures\\Screenshots\\"+newFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //生产新的二维码图片
        try{
            //此处是小程序码的路径
            BufferedImage appletImg = ImageIO.read(new FileInputStream("C:\\Users\\user\\Pictures\\Screenshots\\a.jpg"));
            Graphics2D g2d = appletImg.createGraphics();

            // 设置抗锯齿的属性
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            //此处是替换logo的临时图片路径
            BufferedImage centerImg = ImageIO.read(new File("C:\\Users\\user\\Pictures\\Screenshots\\"+newFileName));
            g2d.drawImage(centerImg.getScaledInstance(centerImg.getWidth(), centerImg.getHeight(), Image.SCALE_SMOOTH), (appletImg.getWidth() - centerImg.getWidth()) / 2, (appletImg.getHeight() - centerImg.getHeight()) / 2, null);

            // 关闭资源
            g2d.dispose();
            //生成新的二维码，覆盖原来的，此处为原小程序码路径，如需另为保存，请自定义路径
            ImageIO.write(appletImg, "png", new File("C:\\Users\\user\\Pictures\\Screenshots\\c.png"));
        }catch (Exception e){
            e.printStackTrace();
        }
        //删除生成的临时替代logo文件
        new File("C:\\Users\\user\\Pictures\\Screenshots\\"+newFileName).delete();
    }

    @Test
    public void testMongo(){
        Date beginOfMonthdate = DateUtil.beginOfMonth(new Date()).toJdkDate();
        Date todaydate = DateUtil.date().toJdkDate();
        Query query = new Query(Criteria.where("operateTime").gte(beginOfMonthdate).lte(todaydate));
        List<MongoTest> mongoTests = mongoTemplate.find(query, MongoTest.class);
        System.out.println(mongoTests);
        GroupOperation as = Aggregation.group("workNo");
//        MatchOperation operateTime = Aggregation.match(Criteria.where("operateTime").gte(beginOfMonthdate).lte(todaydate));
        Aggregation aggregation = Aggregation.newAggregation(as);
        AggregationResults<MongoTest> customerRadarOperate = mongoTemplate.aggregate(aggregation, "CustomerRadarOperate", MongoTest.class);
        for (MongoTest mappedResult : customerRadarOperate.getMappedResults()) {
            System.out.println(mappedResult);
        }

    }
    @Test
    public void testMongo1(){
        System.out.println(mongoTemplate.count(Query.query(Criteria.where("dataType").is("ARTICLE")), MongoTest.class));
    }
    @Test
    public void testDatabase() throws IOException {
        List<MyDataInfo> databaseInfo = getMapper.getDatabaseInfo();
        databaseInfo.forEach(el->{
            el.getMyTables().forEach(myTable -> {
                List<MyDataInfo.MyColumn> column = getMapper.getColumn(el.getDatabaseName(), myTable.getTableName());
                column.forEach(myColumn->{
                    if (!ObjectUtils.isEmpty(myColumn)){
                        if ((myColumn.getColumnName() !=null && (myColumn.getColumnName().contains("url") || myColumn.getColumnName().contains("img")))){
                            if (myColumn.getColumnDescription() !=null && myColumn.getColumnDescription().contains("隔")){
                                try {
                                    getWorkbook.printIntoExcel(el.getDatabaseName(),myTable.getTableName(),myColumn.getColumnName(),true);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }else {
                                try {
                                    getWorkbook.printIntoExcel(el.getDatabaseName(),myTable.getTableName(),myColumn.getColumnName(),false);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                });
            });
        });
        this.getWorkbook.close();
    }

    @Test
    public void  testDateQuery(){
       Integer count= getMapper.testDateQuery(new Date());
        System.out.println(count);
    }
}
