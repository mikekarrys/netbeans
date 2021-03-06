/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.form.beaninfo.swing;

import java.beans.*;
import javax.swing.border.EtchedBorder;


public class EtchedBorderBeanInfo extends BISupport {

    public EtchedBorderBeanInfo() {
        super("etchedBorder", javax.swing.border.EtchedBorder.class); // NOI18N
    }

    @Override
    protected PropertyDescriptor[] createPropertyDescriptors() throws IntrospectionException {
        PropertyDescriptor[] pds = new PropertyDescriptor[] {
            createRO(EtchedBorder.class, "etchType"), // NOI18N
            createRO(EtchedBorder.class, "highlightColor"), // NOI18N
            createRO(EtchedBorder.class, "shadowColor"), // NOI18N
        };
        pds[0].setPropertyEditorClass(EtchTypePropertyEditor.class);
        return pds;
    }

    public static class EtchTypePropertyEditor extends BISupport.TaggedPropertyEditor {
        public EtchTypePropertyEditor() {
            super(
                new int[] {
                    EtchedBorder.LOWERED,
                    EtchedBorder.RAISED,
                },
                new String[] {
                    "javax.swing.border.EtchedBorder.LOWERED", // NOI18N
                    "javax.swing.border.EtchedBorder.RAISED" // NOI18N
                },
                new String[] {
                    "VALUE_EtchLowered", // NOI18N
                    "VALUE_EtchRaised", // NOI18N
                }
            );
        }
    }
    
}
