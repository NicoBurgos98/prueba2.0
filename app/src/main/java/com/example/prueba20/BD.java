package com.example.prueba20;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.annotation.Nullable;

public class BD extends SQLiteOpenHelper {


  public BD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
    super(context, name, factory, version);
  }

  @Override
  public void onCreate(SQLiteDatabase sqBD) {
    sqBD.execSQL("create table guardarfigura( figura varchar(50) not null primary key, nombre varchar(50), usuario varchar(50),  base varchar(50), altura varchar(50), area varchar(50))");
  }
    @Override
    public void onUpgrade (SQLiteDatabase sqLiteDatabase,int i, int i1) {

  }
}
