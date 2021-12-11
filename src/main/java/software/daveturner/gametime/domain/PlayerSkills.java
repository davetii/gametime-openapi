package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Player Skill Set
 */
@ApiModel(description = "Player Skill Set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlayerSkills   {
  @JsonProperty("acumen")
  private BigDecimal acumen;

  @JsonProperty("ballSecurity")
  private BigDecimal ballSecurity;

  @JsonProperty("passing")
  private BigDecimal passing;

  @JsonProperty("teamOffense")
  private BigDecimal teamOffense;

  @JsonProperty("drive")
  private BigDecimal drive;

  @JsonProperty("freeThrows")
  private BigDecimal freeThrows;

  @JsonProperty("longRange")
  private BigDecimal longRange;

  @JsonProperty("perimeter")
  private BigDecimal perimeter;

  @JsonProperty("post")
  private BigDecimal post;

  @JsonProperty("individualDefense")
  private BigDecimal individualDefense;

  @JsonProperty("teamDefense")
  private BigDecimal teamDefense;

  @JsonProperty("offenseRebound")
  private BigDecimal offenseRebound;

  @JsonProperty("defenseRebound")
  private BigDecimal defenseRebound;

  public PlayerSkills acumen(BigDecimal acumen) {
    this.acumen = acumen;
    return this;
  }

  /**
   * Get acumen
   * @return acumen
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAcumen() {
    return acumen;
  }

  public void setAcumen(BigDecimal acumen) {
    this.acumen = acumen;
  }

  public PlayerSkills ballSecurity(BigDecimal ballSecurity) {
    this.ballSecurity = ballSecurity;
    return this;
  }

  /**
   * Get ballSecurity
   * @return ballSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getBallSecurity() {
    return ballSecurity;
  }

  public void setBallSecurity(BigDecimal ballSecurity) {
    this.ballSecurity = ballSecurity;
  }

  public PlayerSkills passing(BigDecimal passing) {
    this.passing = passing;
    return this;
  }

  /**
   * Get passing
   * @return passing
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPassing() {
    return passing;
  }

  public void setPassing(BigDecimal passing) {
    this.passing = passing;
  }

  public PlayerSkills teamOffense(BigDecimal teamOffense) {
    this.teamOffense = teamOffense;
    return this;
  }

  /**
   * Get teamOffense
   * @return teamOffense
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTeamOffense() {
    return teamOffense;
  }

  public void setTeamOffense(BigDecimal teamOffense) {
    this.teamOffense = teamOffense;
  }

  public PlayerSkills drive(BigDecimal drive) {
    this.drive = drive;
    return this;
  }

  /**
   * Get drive
   * @return drive
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDrive() {
    return drive;
  }

  public void setDrive(BigDecimal drive) {
    this.drive = drive;
  }

  public PlayerSkills freeThrows(BigDecimal freeThrows) {
    this.freeThrows = freeThrows;
    return this;
  }

  /**
   * Get freeThrows
   * @return freeThrows
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFreeThrows() {
    return freeThrows;
  }

  public void setFreeThrows(BigDecimal freeThrows) {
    this.freeThrows = freeThrows;
  }

  public PlayerSkills longRange(BigDecimal longRange) {
    this.longRange = longRange;
    return this;
  }

  /**
   * Get longRange
   * @return longRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLongRange() {
    return longRange;
  }

  public void setLongRange(BigDecimal longRange) {
    this.longRange = longRange;
  }

  public PlayerSkills perimeter(BigDecimal perimeter) {
    this.perimeter = perimeter;
    return this;
  }

  /**
   * Get perimeter
   * @return perimeter
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(BigDecimal perimeter) {
    this.perimeter = perimeter;
  }

  public PlayerSkills post(BigDecimal post) {
    this.post = post;
    return this;
  }

  /**
   * Get post
   * @return post
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPost() {
    return post;
  }

  public void setPost(BigDecimal post) {
    this.post = post;
  }

  public PlayerSkills individualDefense(BigDecimal individualDefense) {
    this.individualDefense = individualDefense;
    return this;
  }

  /**
   * Get individualDefense
   * @return individualDefense
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getIndividualDefense() {
    return individualDefense;
  }

  public void setIndividualDefense(BigDecimal individualDefense) {
    this.individualDefense = individualDefense;
  }

  public PlayerSkills teamDefense(BigDecimal teamDefense) {
    this.teamDefense = teamDefense;
    return this;
  }

  /**
   * Get teamDefense
   * @return teamDefense
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTeamDefense() {
    return teamDefense;
  }

  public void setTeamDefense(BigDecimal teamDefense) {
    this.teamDefense = teamDefense;
  }

  public PlayerSkills offenseRebound(BigDecimal offenseRebound) {
    this.offenseRebound = offenseRebound;
    return this;
  }

  /**
   * Get offenseRebound
   * @return offenseRebound
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOffenseRebound() {
    return offenseRebound;
  }

  public void setOffenseRebound(BigDecimal offenseRebound) {
    this.offenseRebound = offenseRebound;
  }

  public PlayerSkills defenseRebound(BigDecimal defenseRebound) {
    this.defenseRebound = defenseRebound;
    return this;
  }

  /**
   * Get defenseRebound
   * @return defenseRebound
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDefenseRebound() {
    return defenseRebound;
  }

  public void setDefenseRebound(BigDecimal defenseRebound) {
    this.defenseRebound = defenseRebound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerSkills playerSkills = (PlayerSkills) o;
    return Objects.equals(this.acumen, playerSkills.acumen) &&
        Objects.equals(this.ballSecurity, playerSkills.ballSecurity) &&
        Objects.equals(this.passing, playerSkills.passing) &&
        Objects.equals(this.teamOffense, playerSkills.teamOffense) &&
        Objects.equals(this.drive, playerSkills.drive) &&
        Objects.equals(this.freeThrows, playerSkills.freeThrows) &&
        Objects.equals(this.longRange, playerSkills.longRange) &&
        Objects.equals(this.perimeter, playerSkills.perimeter) &&
        Objects.equals(this.post, playerSkills.post) &&
        Objects.equals(this.individualDefense, playerSkills.individualDefense) &&
        Objects.equals(this.teamDefense, playerSkills.teamDefense) &&
        Objects.equals(this.offenseRebound, playerSkills.offenseRebound) &&
        Objects.equals(this.defenseRebound, playerSkills.defenseRebound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acumen, ballSecurity, passing, teamOffense, drive, freeThrows, longRange, perimeter, post, individualDefense, teamDefense, offenseRebound, defenseRebound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerSkills {\n");
    
    sb.append("    acumen: ").append(toIndentedString(acumen)).append("\n");
    sb.append("    ballSecurity: ").append(toIndentedString(ballSecurity)).append("\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
    sb.append("    teamOffense: ").append(toIndentedString(teamOffense)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
    sb.append("    freeThrows: ").append(toIndentedString(freeThrows)).append("\n");
    sb.append("    longRange: ").append(toIndentedString(longRange)).append("\n");
    sb.append("    perimeter: ").append(toIndentedString(perimeter)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    individualDefense: ").append(toIndentedString(individualDefense)).append("\n");
    sb.append("    teamDefense: ").append(toIndentedString(teamDefense)).append("\n");
    sb.append("    offenseRebound: ").append(toIndentedString(offenseRebound)).append("\n");
    sb.append("    defenseRebound: ").append(toIndentedString(defenseRebound)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

