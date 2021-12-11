package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Player Attributes
 */
@ApiModel(description = "Player Attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlayerAttributes   {
  @JsonProperty("agility")
  private Integer agility;

  @JsonProperty("charisma")
  private Integer charisma;

  @JsonProperty("determination")
  private Integer determination;

  @JsonProperty("ego")
  private Integer ego;

  @JsonProperty("endurance")
  private Integer endurance;

  @JsonProperty("energy")
  private Integer energy;

  @JsonProperty("handle")
  private Integer handle;

  @JsonProperty("health")
  private Integer health;

  @JsonProperty("intelligence")
  private Integer intelligence;

  @JsonProperty("luck")
  private Integer luck;

  @JsonProperty("person")
  private Integer person;

  @JsonProperty("shotSelection")
  private Integer shotSelection;

  @JsonProperty("shotSkill")
  private Integer shotSkill;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("speed")
  private Integer speed;

  @JsonProperty("strength")
  private Integer strength;

  public PlayerAttributes agility(Integer agility) {
    this.agility = agility;
    return this;
  }

  /**
   * Get agility
   * @return agility
  */
  @ApiModelProperty(value = "")


  public Integer getAgility() {
    return agility;
  }

  public void setAgility(Integer agility) {
    this.agility = agility;
  }

  public PlayerAttributes charisma(Integer charisma) {
    this.charisma = charisma;
    return this;
  }

  /**
   * Get charisma
   * @return charisma
  */
  @ApiModelProperty(value = "")


  public Integer getCharisma() {
    return charisma;
  }

  public void setCharisma(Integer charisma) {
    this.charisma = charisma;
  }

  public PlayerAttributes determination(Integer determination) {
    this.determination = determination;
    return this;
  }

  /**
   * Get determination
   * @return determination
  */
  @ApiModelProperty(value = "")


  public Integer getDetermination() {
    return determination;
  }

  public void setDetermination(Integer determination) {
    this.determination = determination;
  }

  public PlayerAttributes ego(Integer ego) {
    this.ego = ego;
    return this;
  }

  /**
   * Get ego
   * @return ego
  */
  @ApiModelProperty(value = "")


  public Integer getEgo() {
    return ego;
  }

  public void setEgo(Integer ego) {
    this.ego = ego;
  }

  public PlayerAttributes endurance(Integer endurance) {
    this.endurance = endurance;
    return this;
  }

  /**
   * Get endurance
   * @return endurance
  */
  @ApiModelProperty(value = "")


  public Integer getEndurance() {
    return endurance;
  }

  public void setEndurance(Integer endurance) {
    this.endurance = endurance;
  }

  public PlayerAttributes energy(Integer energy) {
    this.energy = energy;
    return this;
  }

  /**
   * Get energy
   * @return energy
  */
  @ApiModelProperty(value = "")


  public Integer getEnergy() {
    return energy;
  }

  public void setEnergy(Integer energy) {
    this.energy = energy;
  }

  public PlayerAttributes handle(Integer handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Get handle
   * @return handle
  */
  @ApiModelProperty(value = "")


  public Integer getHandle() {
    return handle;
  }

  public void setHandle(Integer handle) {
    this.handle = handle;
  }

  public PlayerAttributes health(Integer health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
  */
  @ApiModelProperty(value = "")


  public Integer getHealth() {
    return health;
  }

  public void setHealth(Integer health) {
    this.health = health;
  }

  public PlayerAttributes intelligence(Integer intelligence) {
    this.intelligence = intelligence;
    return this;
  }

  /**
   * Get intelligence
   * @return intelligence
  */
  @ApiModelProperty(value = "")


  public Integer getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(Integer intelligence) {
    this.intelligence = intelligence;
  }

  public PlayerAttributes luck(Integer luck) {
    this.luck = luck;
    return this;
  }

  /**
   * Get luck
   * @return luck
  */
  @ApiModelProperty(value = "")


  public Integer getLuck() {
    return luck;
  }

  public void setLuck(Integer luck) {
    this.luck = luck;
  }

  public PlayerAttributes person(Integer person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @ApiModelProperty(value = "")


  public Integer getPerson() {
    return person;
  }

  public void setPerson(Integer person) {
    this.person = person;
  }

  public PlayerAttributes shotSelection(Integer shotSelection) {
    this.shotSelection = shotSelection;
    return this;
  }

  /**
   * Get shotSelection
   * @return shotSelection
  */
  @ApiModelProperty(value = "")


  public Integer getShotSelection() {
    return shotSelection;
  }

  public void setShotSelection(Integer shotSelection) {
    this.shotSelection = shotSelection;
  }

  public PlayerAttributes shotSkill(Integer shotSkill) {
    this.shotSkill = shotSkill;
    return this;
  }

  /**
   * Get shotSkill
   * @return shotSkill
  */
  @ApiModelProperty(value = "")


  public Integer getShotSkill() {
    return shotSkill;
  }

  public void setShotSkill(Integer shotSkill) {
    this.shotSkill = shotSkill;
  }

  public PlayerAttributes size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PlayerAttributes speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  /**
   * Get speed
   * @return speed
  */
  @ApiModelProperty(value = "")


  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  public PlayerAttributes strength(Integer strength) {
    this.strength = strength;
    return this;
  }

  /**
   * Get strength
   * @return strength
  */
  @ApiModelProperty(value = "")


  public Integer getStrength() {
    return strength;
  }

  public void setStrength(Integer strength) {
    this.strength = strength;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerAttributes playerAttributes = (PlayerAttributes) o;
    return Objects.equals(this.agility, playerAttributes.agility) &&
        Objects.equals(this.charisma, playerAttributes.charisma) &&
        Objects.equals(this.determination, playerAttributes.determination) &&
        Objects.equals(this.ego, playerAttributes.ego) &&
        Objects.equals(this.endurance, playerAttributes.endurance) &&
        Objects.equals(this.energy, playerAttributes.energy) &&
        Objects.equals(this.handle, playerAttributes.handle) &&
        Objects.equals(this.health, playerAttributes.health) &&
        Objects.equals(this.intelligence, playerAttributes.intelligence) &&
        Objects.equals(this.luck, playerAttributes.luck) &&
        Objects.equals(this.person, playerAttributes.person) &&
        Objects.equals(this.shotSelection, playerAttributes.shotSelection) &&
        Objects.equals(this.shotSkill, playerAttributes.shotSkill) &&
        Objects.equals(this.size, playerAttributes.size) &&
        Objects.equals(this.speed, playerAttributes.speed) &&
        Objects.equals(this.strength, playerAttributes.strength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agility, charisma, determination, ego, endurance, energy, handle, health, intelligence, luck, person, shotSelection, shotSkill, size, speed, strength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerAttributes {\n");
    
    sb.append("    agility: ").append(toIndentedString(agility)).append("\n");
    sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
    sb.append("    determination: ").append(toIndentedString(determination)).append("\n");
    sb.append("    ego: ").append(toIndentedString(ego)).append("\n");
    sb.append("    endurance: ").append(toIndentedString(endurance)).append("\n");
    sb.append("    energy: ").append(toIndentedString(energy)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
    sb.append("    luck: ").append(toIndentedString(luck)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    shotSelection: ").append(toIndentedString(shotSelection)).append("\n");
    sb.append("    shotSkill: ").append(toIndentedString(shotSkill)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
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

