/*
 * Copyright 2020 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.intellijthemes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.IntelliJTheme;

/**
 * @author Karl Tauber
 */
class Utils
{
	static final Logger LOG = Logger.getLogger( FlatLaf.class.getName() );

	static IntelliJTheme loadTheme( String name ) {
		try {
			return new IntelliJTheme( Utils.class.getResourceAsStream(
				"/com/formdev/flatlaf/intellijthemes/themes/" + name ) );
		} catch( IOException ex ) {
			String msg = "FlatLaf: Failed to load IntelliJ theme '" + name + "'";
			LOG.log( Level.SEVERE, msg, ex );
			throw new RuntimeException( msg, ex );
		}
	}
}
