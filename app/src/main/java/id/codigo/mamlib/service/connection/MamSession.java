package id.codigo.mamlib.service.connection;

import android.content.Context;
import android.content.SharedPreferences;

public class MamSession implements SessionManager{
    private SharedPreferences mPref;
    private SharedPreferences.Editor mEditor;
    private Context mContext;

    private static int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "MAM";
    private static final String KEY_AUTHRIZATION = "auth";

    private MamSession(Context context){
        this.mContext = context;
        this.mPref = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        this.mEditor = mPref.edit();
    }
    public static MamSession init(Context context){
        return new MamSession(context);
    }

    @Override
    public void clear() {
        mEditor.clear();
        mEditor.commit();
    }

    @Override
    public void storeAuth(String auth) {
        mEditor.putString(KEY_AUTHRIZATION,auth);
        mEditor.commit();
    }

    @Override
    public String getAuth() {
        return mPref.getString(KEY_AUTHRIZATION,"");
    }
}
