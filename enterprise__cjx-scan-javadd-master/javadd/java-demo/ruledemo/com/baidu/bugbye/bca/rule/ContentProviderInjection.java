package rule;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class ContentProviderInjection {
    public void bad1(String id){
        Uri uri = Uri.parse(WeatherContentProvider.CONTENT_URI + id);

        Context context = null;
        ContentResolver resolver = context.getContentResolver();
        //获取的是哪些列的信息
        Cursor cursor = resolver.query(uri, null, null, null, null);

        while(cursor.moveToNext())
        {
            String address = cursor.getString(0);
            System.out.println("地址:" + address);
        }
        cursor.close();
    }

    public void good1(String id){
        if (!verify(id)) {
            id = "";
        }
        Uri uri = Uri.parse(WeatherContentProvider.CONTENT_URI + id);

        Context context = null;
        ContentResolver resolver = context.getContentResolver();
        //获取的是哪些列的信息
        Cursor cursor = resolver.query(uri, new String[]{"address","date","type","body"}, null, null, null);

        while(cursor.moveToNext())
        {
            String address = cursor.getString(0);
            System.out.println("地址:" + address);
        }
        cursor.close();
    }

    private boolean verify(String aim) {
        return true;
    }

    class WeatherContentProvider extends ContentProvider {

        public static final String CONTENT_URI = "weather";

        @Override
        public boolean onCreate() {
            return false;
        }

        @Override
        public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
            return null;
        }

        @Override
        public String getType(Uri uri) {
            return null;
        }

        @Override
        public Uri insert(Uri uri, ContentValues contentValues) {
            return null;
        }

        @Override
        public int delete(Uri uri, String s, String[] strings) {
            return 0;
        }

        @Override
        public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
            return 0;
        }
    }
}
