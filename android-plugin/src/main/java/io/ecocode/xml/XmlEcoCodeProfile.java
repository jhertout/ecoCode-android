/*
 * ecoCode Android plugin - Provides rules to reduce the environmental footprint of your Android applications
 * Copyright © 2020 Green Code Initiative (contact@ecocode.io)
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
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package io.ecocode.xml;

import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonarsource.analyzer.commons.BuiltInQualityProfileJsonLoader;

public final class XmlEcoCodeProfile implements BuiltInQualityProfilesDefinition {

    @Override
    public void define(Context context) {
        NewBuiltInQualityProfile ecoCodeProfile = context.createBuiltInQualityProfile(Xml.PROFILE_NAME, Xml.KEY);
        BuiltInQualityProfileJsonLoader.load(ecoCodeProfile, Xml.REPOSITORY_KEY, Xml.PROFILE_PATH);
        ecoCodeProfile.done();
    }

}
