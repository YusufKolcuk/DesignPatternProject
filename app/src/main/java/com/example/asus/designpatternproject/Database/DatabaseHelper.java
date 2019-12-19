package com.example.asus.designpatternproject.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.example.asus.designpatternproject.Models.MBilgisayar;
import com.example.asus.designpatternproject.Models.MTelefon;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "register.db";
    public static final String TABLE_NAME = "bilgisayar";
    public static final String COL_1 = "model";
    public static final String COL_2 = "islemci";
    public static final String COL_3 = "ram";
    public static final String COL_4 = "ekran";
    public static final String COL_5 = "boyut";
    public static final String COL_6 = "isletim";
    public static final String COL_7 = "hafiza";
    public static final String COL_8 = "hafizaTip";


    public static final String TABLE_NAME2 = "telefon";
    public static final String COL1 = "islemci";
    public static final String COL2 = "ram";
    public static final String COL3 = "kamera";
    public static final String COL4 = "boyut";
    public static final String COL5 = "isletim";
    public static final String COL6 = "batarya";
    public static final String COL7 = "hafiza";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE bilgisayar (model TEXT, islemci TEXT, ram TEXT, ekran TEXT, boyut TEXT, isletim TEXT, hafiza TEXT, hafizaTip TEXT)");
        db.execSQL("CREATE TABLE telefon (islemci TEXT, ram TEXT, kamera TEXT, boyut TEXT, isletim TEXT, batarya TEXT, hafiza TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE İF EXİSTS " + TABLE_NAME);
        db.execSQL(" DROP TABLE İF EXİSTS " + TABLE_NAME2);
        onCreate(db);

    }

    public void VeriEkle(String islemci, String ram, String ekran, String boyut, String isletim, String hafiza, String hafizaTip) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_2, islemci.trim());
        cv.put(COL_3, ram.trim());
        cv.put(COL_4, ekran.trim());
        cv.put(COL_5, boyut.trim());
        cv.put(COL_6, isletim.trim());
        cv.put(COL_7, hafiza.trim());
        cv.put(COL_8, hafizaTip.trim());
        db.insert(TABLE_NAME, null, cv);
        db.close();

    }

    public void veriSilPc() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, null, null);
        db.close();

    }

    public void veriSilTel() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME2, null, null);
        db.close();

    }

    public List<MBilgisayar> veriListele() {
        List<MBilgisayar> veriler = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM bilgisayar ", null);
        while (cursor.moveToNext()) {
            String islemci = cursor.getString(1);
            String ekran = cursor.getString(2);
            String ram = cursor.getString(3);
            String boyut = cursor.getString(4);
            String isletim = cursor.getString(5);
            String hafizaTip = cursor.getString(7);
            String hafiza = cursor.getString(6);
            MBilgisayar pc = new MBilgisayar(islemci, ekran, ram, boyut, isletim, hafizaTip, hafiza);
            veriler.add(pc);
        }


        return veriler;
    }


    public void VeriEkleTel(String islemci, String ram, String kamera, String boyut, String isletim, String batarya, String hafiza) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL1, islemci.trim());
        cv.put(COL2, ram.trim());
        cv.put(COL3, kamera.trim());
        cv.put(COL4, boyut.trim());
        cv.put(COL5, isletim.trim());
        cv.put(COL6, batarya.trim());
        cv.put(COL7, hafiza.trim());
        db.insert(TABLE_NAME2, null, cv);
        db.close();

    }

    public List<MTelefon> veriListeleTel() {
        List<MTelefon> veriler = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM telefon ", null);
        while (cursor.moveToNext()) {
            String islemci = cursor.getString(0);
            String ram = cursor.getString(1);
            String boyut = cursor.getString(2);
            String kamera = cursor.getString(3);
            String isletim = cursor.getString(4);
            String batarya = cursor.getString(5);
            String hafiza = cursor.getString(6);


            MTelefon tel = new MTelefon(islemci, ram, boyut, kamera, isletim, batarya, hafiza);
            veriler.add(tel);
        }


        return veriler;
    }

}
