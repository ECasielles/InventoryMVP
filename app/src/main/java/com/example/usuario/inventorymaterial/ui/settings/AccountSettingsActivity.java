package com.example.usuario.inventorymaterial.ui.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.example.usuario.inventorymaterial.R;

/**
 * Clase que guarda las preferencias de cuenta de la aplicación
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see PreferenceActivity
 */
public class AccountSettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.account_settings);
    }

}
