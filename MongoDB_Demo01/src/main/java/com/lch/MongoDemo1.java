package com.lch;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @ClassName:MongoDemo1
 * @Author：Mr.lee
 * @DATE：2019/08/11
 * @TIME： 20:05
 * @Description: TODO
 */
public class MongoDemo1 {

    /**
     * MongoDB测试类
     * @param args
     */
    public static void main(String[] args) {
        //1.创建连接
        MongoClient client=new MongoClient("192.168.88.128");
        //2.打开数据库
        MongoDatabase spitdb = client.getDatabase("spit");
        //3.获取集合
        MongoCollection<Document> spit = spitdb.getCollection("spit");
        // 4.构建查询条件
        BasicDBObject bson=new BasicDBObject("userid","1013");
        //5.查询记录获取结果集合
        FindIterable<org.bson.Document> documents = spit.find(bson);
        for(org.bson.Document document:documents){
            System.out.println("内容："+  document.getString("content"));
            System.out.println("用户ID:"+document.getString("userid"));
            System.out.println("浏览量："+document.getInteger("visits"));
        }
        client.close();//关闭连接

    }
}
