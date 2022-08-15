package rule;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public class AndroidSqlInjection {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "myTest.db";
    public static final String TABLE_NAME = "Orders";

    public void bad1(SQLiteDatabase sqLiteDatabase, String tableName) {
        // create table Orders(Id integer primary key, CustomName text, OrderPrice integer, Country text);
        String sql = "create table if not exists " + tableName + " (Id integer primary key, CustomName text, OrderPrice integer, Country text)";
        sqLiteDatabase.execSQL(sql);
    }

    public void bad2(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS " + TABLE_NAME + " WHERE VERSION is " + oldVersion;
        sqLiteDatabase.execSQL(sql);
    }

    public void bad3(SQLiteDatabase db, String name) {
        StringBuffer sb = new StringBuffer("SELECT * FROM TABLE WHERE NAME = ");
        sb.append(name);
        sb.append(";");
        db.compileStatement(sb.toString());
    }

    public void bad4(SQLiteDatabase db, String name) {
        StringBuilder sb = new StringBuilder("SELECT * FROM TABLE WHERE NAME = ");
        sb.append(name);
        sb.append(";");
        db.rawQuery(sb.toString(), new String[]{"a","B"});
    }

    public void bad5(SQLiteDatabase db, String name) {
        StringBuffer sb = new StringBuffer("SELECT * FROM TABLE WHERE NAME = ");
        sb.append(name);
        sb.append(";");
        db.rawQueryWithFactory((sqLiteDatabase, sqLiteCursorDriver, s, sqLiteQuery) -> null, sb.toString(), new String[]{"a"}, "user");
    }

    public void bad6(SQLiteDatabase db, String name) {
        StringBuilder sb = new StringBuilder("SELECT * FROM TABLE WHERE NAME = ");
        sb.append(name);
        sb.append(";");
        db.execSQL(sb.toString());
    }

    public void good1(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String sql = null;
        if (oldVersion>0){
            sql = "DROP TABLE IF EXISTS " + TABLE_NAME + " WHERE VERSION is " + oldVersion;
        }
        sqLiteDatabase.execSQL(sql);
    }

    public void good2(SQLiteDatabase db, String sql1) {
        String sql = "";
        if (verify(sql1)) {
            sql = sql1 + "123";
        } else if (verify(sql1)) {
            return;
        } else {
            return;
        }
        sql = sql1 + "123";
        db.execSQL(sql);
    }

    private boolean verify(String key) {
        return true;
    }
}
