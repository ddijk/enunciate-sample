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

import java.util.List;

/**
 * A name of a persona.
 *
 * @author Ryan Heaton
 */
public class Name {

  private String givenName;
  private String surname;

  private List<double[]> metingen;
  private List<double[]> measurements;
  private List<String[]> scores;

  /**
   * The given name.
   *
   * @return The given name.
   */
  public String getGivenName() {
    return givenName;
  }

  /**
   * The given name.
   *
   * @param givenName The given name.
   */
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   * The surname.
   *
   * @return The surname.
   */
  public String getSurname() {
    return surname;
  }

  /**
   * The surname.
   *
   * @param surname The surname.
   */
  public void setSurname(String surname)
  {
    this.surname = surname;
  }


  public List<double[]> getMetingen() {
    return metingen;
  }

  public void setMetingen(List<double[]> metingen) {
    this.metingen = metingen;
  }

  public List<double[]> getMeasurements() {
    return measurements;
  }

  public void setMeasurements(List<double[]> measurements) {
    this.measurements = measurements;
  }

  public List<String[]> getScores() {
    return scores;
  }

  public void setScores(List<String[]> scores) {
    this.scores = scores;
  }
}
