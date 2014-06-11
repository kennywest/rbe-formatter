package com.essiembre.eclipse.rbe.application;

import com.essiembre.eclipse.rbe.application.preferences.RBEPreferenceInitializer;
import com.essiembre.eclipse.rbe.model.bundle.Bundle;
import com.essiembre.eclipse.rbe.model.bundle.PropertiesGenerator;
import com.essiembre.eclipse.rbe.model.bundle.PropertiesParser;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * @author kw
 * @copyright Ebit NV
 * @since 31/10/13
 */
public class FormatFile {
    public static void main(String[] args) throws Exception {
        RBEPreferenceInitializer.initializeDefaultPreferences();
        Bundle bundle = PropertiesParser.parse(readFile(args[0]));

        FileOutputStream out = new FileOutputStream(args[0]);
        out.write(PropertiesGenerator.generate(bundle).getBytes());
        out.close();
    }

    private static String readFile(String file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        try

        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append('\n');
                line = br.readLine();
            }
            return sb.toString();
        } finally

        {
            br.close();
        }
    }
}
