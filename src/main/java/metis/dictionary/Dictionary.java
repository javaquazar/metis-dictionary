/*
 * Metis Dictionary
 *
 * Copyright (c) 2008-2012 Gabor Bata
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package metis.dictionary;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;

import metis.dictionary.ui.DictionaryFrame;

/**
 * Entry point of the Dictionary application.
 *
 * @author Gabor_Bata
 *
 */
public class Dictionary {

    /**
     * Main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args) {

        MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme() {
            private final ColorUIResource primary1 = new ColorUIResource(0x4d6781);
            private final ColorUIResource primary2 = new ColorUIResource(0x7a96b0);
            private final ColorUIResource primary3 = new ColorUIResource(0xc8d4e2);
            private final ColorUIResource secondary1 = new ColorUIResource(0x000000);
            private final ColorUIResource secondary2 = new ColorUIResource(0xaaaaaa);
            private final ColorUIResource secondary3 = new ColorUIResource(0xdfdfdf);

            @Override
            protected ColorUIResource getPrimary1() {
                return this.primary1;
            }

            @Override
            protected ColorUIResource getPrimary2() {
                return this.primary2;
            }

            @Override
            protected ColorUIResource getPrimary3() {
                return this.primary3;
            }

            @Override
            protected ColorUIResource getSecondary1() {
                return this.secondary1;
            }

            @Override
            protected ColorUIResource getSecondary2() {
                return this.secondary2;
            }

            @Override
            protected ColorUIResource getSecondary3() {
                return this.secondary3;
            }
        });

        try {
            UIManager.put("swing.boldMetal", Boolean.FALSE);
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DictionaryFrame.getInstance();
            }
        });
    }
}
