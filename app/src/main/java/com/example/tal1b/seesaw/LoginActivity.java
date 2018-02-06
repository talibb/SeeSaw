package com.example.tal1b.seesaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    protected void connection()
    {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://admin:admin123@cluster0-bc7bd.mongodb.net/");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");

        Log.d( "connection: ", database.getName());
    }
}
