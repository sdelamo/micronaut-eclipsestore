/*
 * Copyright 2017-2023 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.eclipsestore.firestore;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.eclipsestore.conf.RootClassConfigurationProvider;

import java.util.Optional;

/**
 * @since 1.7.0
 * @author Simon Frauenschuh
 */
public interface FirestoreStorageConfigurationProvider extends RootClassConfigurationProvider {

    /**
     * The name qualifier of the defined Firestore to use.
     * If unset, a client with the same name as the storage will be used.
     * If there is no bean with a name qualifier matching the storage name, the default client will be used.
     *
     * @return Returns the name qualifier of the S3Client to use.
     */
    @NonNull
    Optional<String> getFirestoreClientName();

    /**
     *
     * @return Returns the name of the logical firestore directory to use.
     */
    @NonNull
    String getLogicalDirectory();
}
