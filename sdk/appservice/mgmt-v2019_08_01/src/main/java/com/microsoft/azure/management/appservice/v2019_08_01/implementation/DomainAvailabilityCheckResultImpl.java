/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.DomainAvailabilityCheckResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainType;

class DomainAvailabilityCheckResultImpl extends WrapperImpl<DomainAvailabilityCheckResultInner> implements DomainAvailabilityCheckResult {
    private final AppServiceManager manager;
    DomainAvailabilityCheckResultImpl(DomainAvailabilityCheckResultInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Boolean available() {
        return this.inner().available();
    }

    @Override
    public DomainType domainType() {
        return this.inner().domainType();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
