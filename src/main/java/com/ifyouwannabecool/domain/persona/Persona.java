/*
 * Copyright 2006 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ifyouwannabecool.domain.persona;

import com.webcohesion.enunciate.metadata.rs.TypeHint;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author Ryan Heaton
 */
@XmlRootElement
public class Persona {

  private String id;
  private String email;
  private String alias;
  private Name name;
  private javax.activation.DataHandler picture;
  private Pet pet;

  List<int[]> ages;

  public String getId() {
    return id;
  }

  @TypeHint(int[][].class)
  public List<int[]> getAges() {
    return ages;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public DataHandler getPicture() {
    return picture;
  }

  public void setPicture(DataHandler picture) {
    this.picture = picture;
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }
}
