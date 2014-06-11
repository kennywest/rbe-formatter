/*
 * Copyright (C) 2003, 2004  Pascal Essiembre, Essiembre Consultant Inc.
 * 
 * This file is part of Essiembre ResourceBundle Editor.
 * 
 * Essiembre ResourceBundle Editor is free software; you can redistribute it 
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * Essiembre ResourceBundle Editor is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Essiembre ResourceBundle Editor; if not, write to the 
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330, 
 * Boston, MA  02111-1307  USA
 */
package com.essiembre.eclipse.rbe.application.preferences;

import com.essiembre.eclipse.rbe.model.workbench.RBEPreferences;

/**
 * Initializes default preferences.
 *
 * @author Pascal Essiembre (essiembre@users.sourceforge.net)
 * @version $Author: fleque $ $Revision: 1.11 $ $Date: 2007/09/15 15:14:03 $
 */
public final class RBEPreferenceInitializer {

    public static void initializeDefaultPreferences() {
        //General
        RBEPreferences.setDefault(RBEPreferences.CONVERT_ENCODED_TO_UNICODE, true);
        RBEPreferences.setDefault(RBEPreferences.FIELD_TAB_INSERTS, true);
        RBEPreferences.setDefault(RBEPreferences.KEY_TREE_HIERARCHICAL, true);
        RBEPreferences.setDefault(RBEPreferences.KEY_TREE_EXPANDED, true);
        RBEPreferences.setDefault(RBEPreferences.SUPPORT_FRAGMENTS, true);
        RBEPreferences.setDefault(RBEPreferences.LOAD_ONLY_FRAGMENT_RESOURCES, false);

        //Formatting
        RBEPreferences.setDefault(RBEPreferences.CONVERT_UNICODE_TO_ENCODED, true);
        RBEPreferences.setDefault(RBEPreferences.CONVERT_UNICODE_TO_ENCODED_UPPER, true);

        RBEPreferences.setDefault(RBEPreferences.SPACES_AROUND_EQUAL_SIGNS, true);

        RBEPreferences.setDefault(RBEPreferences.KEY_GROUP_SEPARATOR, "."); //$NON-NLS-1$
        RBEPreferences.setDefault(RBEPreferences.ALIGN_EQUAL_SIGNS, true);
        RBEPreferences.setDefault(RBEPreferences.SHOW_GENERATOR, true);
        RBEPreferences.setDefault(RBEPreferences.KEY_TREE_HIERARCHICAL, true);

        RBEPreferences.setDefault(RBEPreferences.GROUP_KEYS, true);
        RBEPreferences.setDefault(RBEPreferences.GROUP_LEVEL_DEEP, 1);
        RBEPreferences.setDefault(RBEPreferences.GROUP_LINE_BREAKS, 1);
        RBEPreferences.setDefault(RBEPreferences.GROUP_ALIGN_EQUAL_SIGNS, true);

        RBEPreferences.setDefault(RBEPreferences.WRAP_CHAR_LIMIT, 80);
        RBEPreferences.setDefault(RBEPreferences.WRAP_INDENT_SPACES, 8);

        RBEPreferences.setDefault(RBEPreferences.NEW_LINE_TYPE,
                RBEPreferences.NEW_LINE_UNIX);

        RBEPreferences.setDefault(RBEPreferences.KEEP_EMPTY_FIELDS, false);

        // Reporting/Performance
        RBEPreferences.setDefault(RBEPreferences.REPORT_MISSING_VALUES, true);
        RBEPreferences.setDefault(RBEPreferences.REPORT_DUPL_VALUES, true);
        RBEPreferences.setDefault(RBEPreferences.REPORT_SIM_VALUES_WORD_COMPARE, true);
        RBEPreferences.setDefault(RBEPreferences.REPORT_SIM_VALUES_PRECISION, 0.75d);

        RBEPreferences.setDefault(RBEPreferences.NO_TREE_IN_EDITOR, false);
    }

}
