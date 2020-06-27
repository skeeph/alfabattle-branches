package io.khabib.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * BranchesWithPredicting
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T10:55:57.660Z")

public class BranchesWithPredicting   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("dayOfWeek")
  private Integer dayOfWeek = null;

  @JsonProperty("hourOfDay")
  private Integer hourOfDay = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lat")
  private Double lat = null;

  @JsonProperty("lon")
  private Double lon = null;

  @JsonProperty("predicting")
  private Long predicting = null;

  @JsonProperty("title")
  private String title = null;

  public BranchesWithPredicting address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public BranchesWithPredicting dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "")


  public Integer getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public BranchesWithPredicting hourOfDay(Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
    return this;
  }

  /**
   * Get hourOfDay
   * @return hourOfDay
  **/
  @ApiModelProperty(value = "")


  public Integer getHourOfDay() {
    return hourOfDay;
  }

  public void setHourOfDay(Integer hourOfDay) {
    this.hourOfDay = hourOfDay;
  }

  public BranchesWithPredicting id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BranchesWithPredicting lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Get lat
   * @return lat
  **/
  @ApiModelProperty(value = "")


  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public BranchesWithPredicting lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * Get lon
   * @return lon
  **/
  @ApiModelProperty(value = "")


  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public BranchesWithPredicting predicting(Long predicting) {
    this.predicting = predicting;
    return this;
  }

  /**
   * Get predicting
   * @return predicting
  **/
  @ApiModelProperty(value = "")


  public Long getPredicting() {
    return predicting;
  }

  public void setPredicting(Long predicting) {
    this.predicting = predicting;
  }

  public BranchesWithPredicting title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchesWithPredicting branchesWithPredicting = (BranchesWithPredicting) o;
    return Objects.equals(this.address, branchesWithPredicting.address) &&
        Objects.equals(this.dayOfWeek, branchesWithPredicting.dayOfWeek) &&
        Objects.equals(this.hourOfDay, branchesWithPredicting.hourOfDay) &&
        Objects.equals(this.id, branchesWithPredicting.id) &&
        Objects.equals(this.lat, branchesWithPredicting.lat) &&
        Objects.equals(this.lon, branchesWithPredicting.lon) &&
        Objects.equals(this.predicting, branchesWithPredicting.predicting) &&
        Objects.equals(this.title, branchesWithPredicting.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, dayOfWeek, hourOfDay, id, lat, lon, predicting, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchesWithPredicting {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    predicting: ").append(toIndentedString(predicting)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

