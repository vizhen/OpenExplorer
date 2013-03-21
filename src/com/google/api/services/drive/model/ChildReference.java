/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * Warning! This file is generated. Modify at your own risk.
 */

package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;

/**
 * A reference to a folder's child.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * <p>
 * Upgrade warning: starting with version 1.12 {@code getResponseHeaders()} is removed, instead use
 * {@link com.google.api.client.http.json.JsonHttpRequest#getLastResponseHeaders()}
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChildReference extends GenericJson {

  /**
   * A link to the child.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String childLink;

  /**
   * The ID of the child.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String id;

  /**
   * This is always drive#childReference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String kind;

  /**
   * A link back to this reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String selfLink;

  /**
   * A link to the child.
   * The value returned may be {@code null}.
   */
  public String getChildLink() {
    return childLink;
  }

  /**
   * A link to the child.
   * The value set may be {@code null}.
   */
  public ChildReference setChildLink(String childLink) {
    this.childLink = childLink;
    return this;
  }

  /**
   * The ID of the child.
   * The value returned may be {@code null}.
   */
  public String getId() {
    return id;
  }

  /**
   * The ID of the child.
   * The value set may be {@code null}.
   */
  public ChildReference setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * This is always drive#childReference.
   * The value returned may be {@code null}.
   */
  public String getKind() {
    return kind;
  }

  /**
   * This is always drive#childReference.
   * The value set may be {@code null}.
   */
  public ChildReference setKind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A link back to this reference.
   * The value returned may be {@code null}.
   */
  public String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this reference.
   * The value set may be {@code null}.
   */
  public ChildReference setSelfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

}
