/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2012, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.springframework.web.servlet.tags.form;

import java.beans.PropertyEditor;

/**
 * 
 * @author Daniel Fern&aacute;ndez
 * 
 * @since 1.0
 *
 */
public final class ValueFormatterWrapper {


    public static String getDisplayString(final Object value, final boolean htmlEscape) {
        return ValueFormatter.getDisplayString(value, htmlEscape);
    }


    public static String getDisplayString(final Object value, final PropertyEditor propertyEditor, final boolean htmlEscape) {
        return ValueFormatter.getDisplayString(value, propertyEditor, htmlEscape);
    }


    private ValueFormatterWrapper() {
        super();
    }


}
