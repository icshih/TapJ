/*
 * CU9 WP940 Validation
 * Copyright (C) 2006-2014 Gaia Data Processing and Analysis Consortium
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */
package ics.astro.tap.security;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * @author I-Chun Shih (i-chun.shih at obspm.fr)
 * @version $Id: DumbHostnameVerifier.java 529400 2016-09-23 09:13:05Z nleclerc $
 */
public class DumbHostnameVerifier implements HostnameVerifier {

    /**
     * Dummy implementation for the hostname verifier to Gacs connections
     *
     * A future implementation could be more complex
     *
     * @param arg0
     * @param arg1
     * @return 
     */
    @Override
    public boolean verify(String arg0, SSLSession arg1) {

        // Only allow esa.int URLs (and for testing, also allow hosts
        // from esa.int
        if (arg0 == null) {
            return false;
        } else {
            return arg0.endsWith("esa.int");
        }

    }
}
