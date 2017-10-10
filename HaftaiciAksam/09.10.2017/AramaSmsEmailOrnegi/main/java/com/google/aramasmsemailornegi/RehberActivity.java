package com.google.aramasmsemailornegi;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class RehberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehber);


        Intent i = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
        i.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        startActivityForResult(i,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == 1 && resultCode == RESULT_OK){
            Uri uriContact = data.getData();
            String contactName = null;

            Cursor cursor = getContentResolver().query(uriContact,null,null,null,null);
            if(cursor.moveToFirst()){
                contactName = cursor.getString(
                        cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)
                );
            }
            cursor.close();

            Toast.makeText(
                    getApplicationContext(),
                    contactName,
                    Toast.LENGTH_LONG
            ).show();


        }


    }
}
