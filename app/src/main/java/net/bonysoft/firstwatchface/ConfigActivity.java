package net.bonysoft.firstwatchface;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class ConfigActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.config_activity);

        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        final ConfigPreferences configPreferences = new ConfigPreferences(defaultSharedPreferences);

        CheckBox darkThemeCheckbox = (CheckBox) findViewById(R.id.dark_theme_checkbox);
        darkThemeCheckbox.setChecked(configPreferences.isUsingDarkTheme());
        darkThemeCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                configPreferences.useDarkTheme(isChecked);
            }
        });
    }

}
