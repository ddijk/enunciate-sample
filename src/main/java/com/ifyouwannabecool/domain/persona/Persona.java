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

import com.ifyouwannabecool.beanval.DataAPI;
import com.ifyouwannabecool.beanval.SimulationAPI;

import javax.activation.DataHandler;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ryan Heaton
 */
@XmlRootElement
public class Persona extends Foetus implements Nameable {

  private String id;

  //  @XmlAttribute(required = true) @Size(min = 5, max = 10) private String bijnaam;
  private String email;

  private String alias;

  private String city;
  private String language;

  private Bike bike;

  @NotNull(groups = DataAPI.class)
  public Bike getBike() {
    return bike;
  }

  @XmlAttribute(required = true)
  private Name name;
  private javax.activation.DataHandler picture;

  /**
   * Field without explicit validation group (i.e. default group)
   */
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Field with one validation group: DataAPI
   */
  @NotNull(groups = DataAPI.class)
  public String getEmail() {
    return email;
  }

  /**
   * Field with two validation groups: DataAPI and SimulationAPI
   */
  @NotNull(groups = {DataAPI.class, SimulationAPI.class})
  public String getAlias() {
    return alias;
  }

  /**
   * Field with one validation group: SimulationAPI
   */
  @NotNull(groups = SimulationAPI.class)
  public String getCity() {
    return city;
  }

  /**
   * Field without bean validation constraint
   */
  public String getLanguage() {
    return language;
  }

  public void setId(String id) {
    this.id = id;
  }

  //  public Name getName() {
//    return name;
//  }
//
//  public void setName(Name name) {
//    this.name = name;
//  }

  public DataHandler getPicture() {
    return picture;
  }

  public void setPicture(DataHandler picture) {
    this.picture = picture;
  }

//  public String getBijnaam() {
//    return bijnaam;
//  }
//
//  public void setBijnaam(String bijnaam) {
//    this.bijnaam = bijnaam;
//  }
}
