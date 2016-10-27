package com.example.ade.uts;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by ade on 17/10/16.
 */

public class Session2 {
    SharedPreferences pref2;

    // Editor for Shared preferences
    SharedPreferences.Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREF_NAME = "Biodata";

    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";

    // User name (make variable public to access from outside)
    public static final String KEY_NIM = "nim";

    // Email address (make variable public to access from outside)
    public static final String KEY_NAMA = "nama";

    // Constructor
    public Session2(Context context){
        this._context = context;
        pref2 = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref2.edit();
    }
    public HashMap<String, String> getUserDetails(){
        HashMap<String, String> user = new HashMap<String, String>();
        // user name
        user.put(KEY_NIM, pref2.getString(KEY_NIM, null));

        // user email id
        user.put(KEY_NAMA, pref2.getString(KEY_NAMA, null));

        // return user
        return user;
    }
    public void createLoginSession(String nim, String nama){
        // Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);

        // Storing name in pref
        editor.putString(KEY_NIM, nim);

        // Storing email in pref
        editor.putString(KEY_NAMA, nama);

        // commit changes
        editor.commit();
    }
}