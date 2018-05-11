/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml.config;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.saml.key.SimpleKey;

@Configuration
public class LocalProviderConfiguration<T extends LocalProviderConfiguration> {

    private String entityId;
    private List<SimpleKey> active;
    private List<SimpleKey> standby;
    private boolean signMetadata;

    private List<ExternalProviderConfiguration> providers = new LinkedList<>();

    @SuppressWarnings("checked")
    protected T _this() {
        return (T)this;
    }

    public T setProviders(List<ExternalProviderConfiguration> idps) {
        this.providers = idps;
        return _this();
    }

    public List<ExternalProviderConfiguration> getProviders() {
        return providers;
    }

    public String getEntityId() {
        return entityId;
    }

    public T setEntityId(String entityId) {
        this.entityId = entityId;
        return _this();
    }

    public List<SimpleKey> getActive() {
        return active;
    }

    public T setActive(List<SimpleKey> active) {
        this.active = active;
        return _this();
    }

    public List<SimpleKey> getStandby() {
        return standby;
    }

    public T setStandby(List<SimpleKey> standby) {
        this.standby = standby;
        return _this();
    }

    public boolean isSignMetadata() {
        return signMetadata;
    }

    public T setSignMetadata(boolean signMetadata) {
        this.signMetadata = signMetadata;
        return _this();
    }
}