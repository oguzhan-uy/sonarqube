/*
 * SonarQube
 * Copyright (C) 2009-2022 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.db.pushevent;

public class PushEventDto {
  private String uuid;
  private String projectUuid;
  private byte[] payload;
  private long createdAt;

  public PushEventDto() {
    // nothing to do
  }

  public String getUuid() {
    return uuid;
  }

  public PushEventDto setUuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public String getProjectUuid() {
    return projectUuid;
  }

  public PushEventDto setProjectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
    return this;
  }

  public byte[] getPayload() {
    return payload;
  }

  public PushEventDto setPayload(byte[] payload) {
    this.payload = payload;
    return this;
  }

  public long getCreatedAt() {
    return createdAt;
  }

  public PushEventDto setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
    return this;
  }
}
