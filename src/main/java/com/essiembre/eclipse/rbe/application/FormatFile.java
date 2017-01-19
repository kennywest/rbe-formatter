package com.essiembre.eclipse.rbe.application;

import com.essiembre.eclipse.rbe.application.preferences.RBEPreferenceInitializer;
import com.essiembre.eclipse.rbe.model.bundle.Bundle;
import com.essiembre.eclipse.rbe.model.bundle.PropertiesGenerator;
import com.essiembre.eclipse.rbe.model.bundle.PropertiesParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/**
 * @author kw
 * @copyright Ebit NV
 * @since 31/10/13
 */
public class FormatFile {
    public static void main(String[] args) throws Exception {
        RBEPreferenceInitializer.initializeDefaultPreferences();
        Bundle bundle = PropertiesParser.parse(readFile(args[0]));

        Path out = Paths.get(args[0]);
        List<String> lines = new ArrayList<>();
        PropertiesGenerator.generate(bundle, lines::add);
        Files.write(out, lines, StandardCharsets.UTF_8, TRUNCATE_EXISTING);
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
