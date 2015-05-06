/*
 * Copyright (c) 2015. Logan Waldman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.johnsmith0508.miscadd.reference;

/**
 * Created by JohnSmith0508 on 4/5/15 at 5:36 PM.
 */
public class Ref
{
    public static final String MOD_ID = "MiscAdd";
    public static final String MOD_NAME = "Misc-Add";
    public static final String MINOR_VERSION = "@MINOR@";
    public static final String MAJOR_VERSION = "@MAJOR@";
    public static final String VERSION = MAJOR_VERSION+ "." +MINOR_VERSION;
    public static final String RESCOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
    public static final String SERVER_PROXY_CLASS = "com.johnsmith0508.miscadd.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "com.johnsmith0508.miscadd.proxy.ClientProxy";
}
