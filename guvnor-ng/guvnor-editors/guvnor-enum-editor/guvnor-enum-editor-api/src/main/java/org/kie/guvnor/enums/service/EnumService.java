/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.guvnor.enums.service;

import org.jboss.errai.bus.server.annotations.Remote;
import org.kie.guvnor.commons.service.validation.ValidationService;
import org.kie.guvnor.commons.service.verification.SimpleVerificationService;
import org.kie.guvnor.enums.model.EnumModelContent;
import org.kie.guvnor.services.metadata.model.Metadata;
import org.uberfire.backend.vfs.Path;

@Remote
public interface EnumService
        extends ValidationService<String>,
                SimpleVerificationService<String> {

    EnumModelContent load( final Path path );

    void save( final Path path,
               final String content,
               final Metadata metadata,
               final String comment );

    void save( final Path path,
               final String content,
               final String comment );
    
    void delete( final Path path, String comment );

    Path rename( final Path path, String newName, String comment );

    Path copy( final Path path, String newName, String comment );
}
