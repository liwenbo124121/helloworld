package rule;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDbInjection {
    private DBCollection collection = null;
    private MongoCollection<Document> mongoCollection = null;
    public MongoDbInjection(){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        com.mongodb.DB db = mongoClient.getDB("mydb");
        MongoDatabase mydb = mongoClient.getDatabase("mydb");
        collection = db.getCollection("firstCollection");
        mongoCollection = mydb.getCollection("firstCollection");
    }

    public void bad1(HttpServletRequest request){
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        BasicDBObject query = new BasicDBObject();
        query.put("name,pwd",username + ";" + pwd);
        mongoCollection.find(query);
        mongoCollection.findOneAndDelete(query);
        mongoCollection.findOneAndUpdate(query,query);
        mongoCollection.findOneAndReplace(query, new Document());
        mongoCollection.distinct("user", query, String.class);
    }

    public void bad2(HttpServletRequest request){
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        BasicDBObject query = new BasicDBObject("name,pwd",username + ";" + pwd);
        mongoCollection.find(query);
        mongoCollection.findOneAndDelete(query);
        mongoCollection.findOneAndUpdate(query,query);
        mongoCollection.findOneAndReplace(query, new Document());
    }

    public void bad3(HttpServletRequest request){
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        BasicDBObject ageObj = new BasicDBObject(age,new BasicDBObject("$gt",23));
        BasicDBObject sexObj = new BasicDBObject(sex,1);
        BasicDBObject andObj = new BasicDBObject("$and", Arrays.asList(ageObj,sexObj));
        mongoCollection.find(andObj);
    }

    public void bad4(HttpServletRequest request){
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        BasicDBObject ageObj = new BasicDBObject(age,new BasicDBObject("$gt",23));
        BasicDBObject sexObj = new BasicDBObject(sex,1);
        BasicDBObject andObj = new BasicDBObject("$and", Arrays.asList(ageObj,sexObj));
        mongoCollection.findOneAndDelete(andObj);
    }

    public void bad5(HttpServletRequest request){
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        BasicDBObject ageObj = new BasicDBObject(age,new BasicDBObject("$gt",23));
        BasicDBObject sexObj = new BasicDBObject(sex,1);
        BasicDBObject andObj = new BasicDBObject("$and", Arrays.asList(ageObj,sexObj));
        mongoCollection.findOneAndUpdate(andObj,andObj);
        mongoCollection.findOneAndReplace(andObj, new Document());
    }
}
