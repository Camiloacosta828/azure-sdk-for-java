/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.notificationhubs.v2014_09_01.NotificationHubProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a NotificationHub Resource.
 */
public class NotificationHubResourceInner {
    /**
     * Gets or sets the id of the created NotificationHub.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Gets or sets datacenter location of the NotificationHub.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Gets or sets name of the NotificationHub.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets resource type of the NotificationHub.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Gets or sets tags of the NotificationHub.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Gets or sets properties of the NotificationHub.
     */
    @JsonProperty(value = "properties")
    private NotificationHubProperties properties;

    /**
     * Get gets or sets the id of the created NotificationHub.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set gets or sets the id of the created NotificationHub.
     *
     * @param id the id value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get gets or sets datacenter location of the NotificationHub.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set gets or sets datacenter location of the NotificationHub.
     *
     * @param location the location value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get gets or sets name of the NotificationHub.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets name of the NotificationHub.
     *
     * @param name the name value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets resource type of the NotificationHub.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set gets or sets resource type of the NotificationHub.
     *
     * @param type the type value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get gets or sets tags of the NotificationHub.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set gets or sets tags of the NotificationHub.
     *
     * @param tags the tags value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get gets or sets properties of the NotificationHub.
     *
     * @return the properties value
     */
    public NotificationHubProperties properties() {
        return this.properties;
    }

    /**
     * Set gets or sets properties of the NotificationHub.
     *
     * @param properties the properties value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withProperties(NotificationHubProperties properties) {
        this.properties = properties;
        return this;
    }

}