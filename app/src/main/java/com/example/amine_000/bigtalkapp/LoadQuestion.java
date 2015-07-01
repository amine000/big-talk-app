package com.example.amine_000.bigtalkapp;

import android.app.Activity;
import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amine_000 on 6/28/2015.
 */
public class LoadQuestion {

    public ArrayList<String> returnArray(){
        ArrayList<String> questionsArray = new ArrayList<String>();
        Scanner in;
        File myFile = new File("C:\\Users\\amine_000\\Documents\\BigTalkApp\\app\\src\\main\\assets\\questions.txt");
        //InputStream inStream = (Activity)getContext().getAssets().open("questions.txt");
        try {
            in = new Scanner(myFile);
            while(in.hasNextLine()){
                String line = in.nextLine();
                questionsArray.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found ayyy");
        }
        return questionsArray;
    }

    public static void main(String args[]){
        LoadQuestion l = new LoadQuestion();
        ArrayList myList = l.returnArray();
        for(int i = 0; i < myList.size(); i++){
            String theString = (String)myList.get(i);
            String newString = (char)(34)+theString+(char)(34);
            myList.set(i,newString);
        }
        System.out.println(myList);
    }
}
