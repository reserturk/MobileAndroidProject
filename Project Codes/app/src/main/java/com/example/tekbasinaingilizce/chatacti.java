package com.example.tekbasinaingilizce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ServerValue;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class chatacti extends AppCompatActivity {

   // private FirebaseAuth mAuth;
        private FirebaseAuth mAuth;

    RecyclerView recyclerView;
    RecAdapChat recyclerViewAdapter;
    EditText messageText;
    FirebaseDatabase database;
    DatabaseReference databaseReference;

    public ArrayList<String> chatMessages = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuop =getMenuInflater();

        menuop.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if (item.getItemId()==R.id.options_menu_sign_out){
            mAuth.signOut();
            Intent intent = new Intent(getApplicationContext(),Girisacti.class);
            startActivity(intent);

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatacti);



        messageText = findViewById(R.id.chat_yaz);
        recyclerView = findViewById(R.id.rechat);
        recyclerViewAdapter = new RecAdapChat(chatMessages);

        RecyclerView.LayoutManager recmanager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(recmanager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(recyclerViewAdapter);



        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference();

    }

    public void Gonder(View view){

        String messageToSend = messageText.getText().toString();
        FirebaseUser user = mAuth.getCurrentUser();
        String userEmail = user.getEmail().toString();

        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();

        databaseReference.child("Chats").child(uuidString).child("usermessage").setValue(messageToSend);
        databaseReference.child("Chats").child(uuidString).child("useremail").setValue(userEmail);
        databaseReference.child("Chats").child(uuidString).child("usermessagetime").setValue(ServerValue.TIMESTAMP);
        messageText.setText("");

getData();
    }


    public void getData(){
        DatabaseReference newReference = database.getReference("Chats");
        Query query=newReference.orderByChild("usermessagetime");

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                chatMessages.clear();
            for (DataSnapshot ds : snapshot.getChildren()){
                HashMap<String ,String> hashMap = (HashMap<String, String>) ds.getValue();
                String useremail = hashMap.get("useremail");
                String usermessage = hashMap.get("usermessage");

                chatMessages.add(useremail+" : "+usermessage);
                recyclerViewAdapter.notifyDataSetChanged();

            }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getApplicationContext(),error.getMessage().toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}