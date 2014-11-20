package indrora.neural;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class NexusSettings extends PreferenceActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.addPreferencesFromResource(R.xml.preferences);
    
  }
  
}
