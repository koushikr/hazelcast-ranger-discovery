/*
 * Copyright 2016 Phaneesh Nagaraja <phaneesh.n@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ranger.hazelcast.servicediscovery;

import com.hazelcast.config.properties.PropertyDefinition;
import com.hazelcast.config.properties.PropertyTypeConverter;
import com.hazelcast.config.properties.SimplePropertyDefinition;

class RangerDiscoveryConfiguration {

    static final PropertyDefinition ZK_CONNECTION_STRING = new SimplePropertyDefinition("zk-connection-string", PropertyTypeConverter.STRING);

    static final PropertyDefinition NAMESPACE = new SimplePropertyDefinition("namespace", PropertyTypeConverter.STRING);

    static final PropertyDefinition SERVICE_NAME = new SimplePropertyDefinition("service-name", PropertyTypeConverter.STRING);

    static final PropertyDefinition HEALTH_UPDATE_INTERVAL_MS = new SimplePropertyDefinition("health-update-interval-ms", PropertyTypeConverter.INTEGER);

    static final PropertyDefinition STALE_UPDATE_THRESHOLD_INTERVAL_MS = new SimplePropertyDefinition("stale-update-threshold-ms", PropertyTypeConverter.INTEGER);

    private RangerDiscoveryConfiguration() {

    }
}
