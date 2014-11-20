package indrora.neural;

import java.util.Arrays;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Settings {
  
  public static final String PREF_COLOR_SCHEME = "color_scheme";
  public static final String PREF_DEFAULT_COLOR_SCHEME = "nexus";

  SharedPreferences prefs = null;
  Context ctt;
  
  public Settings(Context ctx) {
    prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
    ctt = ctx;
  }
  
  public String getSchemeName() {
    return prefs.getString(PREF_COLOR_SCHEME, PREF_DEFAULT_COLOR_SCHEME);
  }
  
  public String getSchemeValues(String scheme) {
    String[] names = ctt.getResources().getStringArray(R.array.color_names);
    int position = Arrays.asList(names).indexOf(scheme);
    return ctt.getResources().getStringArray(R.array.color_values)[position];
  }

}
