/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_02_01_preview.implementation;

import com.microsoft.azure.management.appconfiguration.v2019_02_01_preview.ProvisioningState;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The configuration store along with all resource properties. The
 * Configuration Store will have all information to begin utilizing it.
 */
@JsonFlatten
public class ConfigurationStoreInner extends Resource {
    /**
     * The provisioning state of the configuration store. Possible values
     * include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed',
     * 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The creation date of configuration store.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The DNS endpoint where the configuration store API will be available.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * Get the provisioning state of the configuration store. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creation date of configuration store.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the DNS endpoint where the configuration store API will be available.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

}