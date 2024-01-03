package com.hasanbilgin.javalearning;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables //değişkenler
        //sout yazarsanız direk gelir System.out.println();

        //array//dizi kullanılması
//        String[] dizi=new String[3];
//        dizi[0]="ali";
//        dizi[1]="aliye";
//        dizi[2]="hasan";
//        Log.i("log24",dizi[0]);
//
//        int[] dizi2=new int[3];
//        dizi2[0]=50;
//        dizi2[1]=60;
//        dizi2[2]=70;
//        Log.i("log30",""+dizi2[0]);
//
//        int[] dizi3={1,2,3,4,5,6,7,8,9};
//        Log.i("log33",""+dizi3[2]);

        //Lists//Listeler kullanımı
//        ArrayList<String> arraylist=new ArrayList<String>();
//        //new ArrayList<String>(); String isteğe bağlı yazılmayabilir
//        arraylist.add("hasan");
//        arraylist.add("esra");
//        arraylist.add(1,"filiz");
//        arraylist.add("mustafa");
//
//        System.out.println(arraylist.get(0));
//        System.out.println(arraylist.get(1));
//        System.out.println(arraylist.get(2));
//        System.out.println(arraylist.get(3));

        //set
//        HashSet<String> hashSet=new HashSet<String>();
//        //new HashSet<String>(); String yazılmayabilir
//        hashSet.add("james");
//        hashSet.add("james");
//        System.out.println(hashSet.size());//1 vericektir
//        //aynı textleri HashSet kabul etmez Arraylist farkı budur

        //HashMap
//        HashMap<String ,String> hashMap=new HashMap<String ,String>();
//        //new HashMap<String ,String>(); String,String yazılmayabilir
//        hashMap.put("sehir","İstanbul");
//        hashMap.put("ilce","bayrampasa");
//        System.out.println(hashMap.get("sehir"));//istanbul verir
//
//        HashMap<String,Integer> hashMap2=new HashMap<>();
//        hashMap2.put("et",1500);
//        hashMap2.put("brokoli",100);
//        System.out.println(hashMap2.get("et"));//1500 verir

//        //switch kullanımı
//        int day=1;
//        String dayString="";
//        switch (day) {
//            case 1:
//                dayString = "Monday"; break;
//            case 2:
//                dayString = "Tuesday"; break;
//            case 3:
//                dayString = "Wednesday"; break;
//            default:
//                dayString = "Sunday"; break;
//        }
//        System.out.println(dayString);

//        //for loop
//        int[] myNumbers = {12,15,18,21,24};
//
//        for (int i = 0; i < myNumbers.length; i++) {
//            int x = myNumbers [i];
//            System.out.println(x);
//        }
//
//        //foreach
//        for (int number: myNumbers) {
//             System.out.println(number);
//        }

//        AlertDialog
//        findViewById(R.id.alertdialogcalistir).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
//                alert.setTitle("Save");
//                alert.setMessage("Are you sure?");
//                /*bu view custom view olabilirdi defaultsa yazmaya gerek yok*/
//                //alert.setView(view);
//                //boş biyere tıklandığında kapanmaz
//                alert.setCancelable(false);
//                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_LONG).show();
//                    }
//                });
//                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface  dialog, int which) {
//                        Toast.makeText(MainActivity.this, "Not Saved", Toast.LENGTH_LONG).show();
//                    }
//                });
//                alert.show();
//            }
//        });
//
//        Context context=MainActivity.this;
//        Toast.makeText(context, "asfdsfsfd", Toast.LENGTH_SHORT).show();

        //CountDownTimer kullanımı
//        new CountDownTimer(10000/*10sn sayması için 10000 yazıldı*/, 1000/*kaçar kaçar sayması gerekiyorsa 1000 yazdık yani 1sn 1 sn sayıcak*/) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                //her saydığında metot çalışır
//                //millisUntilFinished =10000 demektir her metot çalıştığında 1000 çıkartır yani 10000,9000 ... yerine 100e böldük 10, 9 .... diye gidecek
//                System.out.println(millisUntilFinished/1000);
//            }
//            @Override
//            public void onFinish() {
//                //10sn bitiminde bu metod çalşır
//                System.out.println("bitti");
//            }
//        }.start();



    }
}