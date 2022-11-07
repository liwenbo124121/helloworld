package rule;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


public class JsonDeSerializedInjection {
    /**
     * jdk
     * @param bits
     * @return
     */
    public static Object bad1(byte[] bits) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(bits);
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();

            bais.close();
            ois.close();
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * fastjson
     * @param json
     * @param clazz
     * @return
     */
    public static Object bad2(String json, Class<?> clazz){
        Object obj = JSON.parseObject(json, clazz);
        return obj;
    }

    /**
     * Gson
     * @param json
     * @param clazz
     * @return
     */
    public static Object bad3(String json, Class<?> clazz){
        Gson gson = new Gson();
        Object obj = gson.fromJson(json, clazz);
        return obj;
    }

    /**
     * Jackson
     * @param json
     * @param clazz
     * @return
     */
    public static Object bad4(String json, Class<?> clazz) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Object obj = null;
        try {
            obj = mapper.readValue(json, clazz);
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return obj;
    }
}
