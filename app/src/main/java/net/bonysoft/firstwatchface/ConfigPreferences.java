package net.bonysoft.firstwatchface;

import android.content.SharedPreferences;

class ConfigPreferences {

    private static final String KEY_USE_DARK_THEME = "use_dark_theme";

    private final SharedPreferences preferences;

    ConfigPreferences(SharedPreferences preferences) {
        this.preferences = preferences;
    }

    void useDarkTheme(boolean isDark) {
        preferences.edit()
                .putBoolean(KEY_USE_DARK_THEME, isDark)
                .apply();
    }

    boolean isUsingDarkTheme() {
        return preferences.getBoolean(KEY_USE_DARK_THEME, true);
    }

}
