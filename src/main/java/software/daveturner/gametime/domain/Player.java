package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import software.daveturner.gametime.domain.PlayerAttributes;
import software.daveturner.gametime.domain.PlayerSkills;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Player
 */
@ApiModel(description = "Player")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Player   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  /**
   * Gets or Sets position
   */
  public enum PositionEnum {
    PG("PG"),
    
    CG("CG"),
    
    _2G("2G"),
    
    W("W"),
    
    SF("SF"),
    
    F("F"),
    
    PF("PF"),
    
    FC("FC"),
    
    C("C");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("position")
  private PositionEnum position;

  @JsonProperty("height")
  private String height;

  @JsonProperty("weight")
  private Integer weight;

  @JsonProperty("yearsPro")
  private Integer yearsPro;

  @JsonProperty("origin")
  private String origin;

  @JsonProperty("attrbitues")
  private PlayerAttributes attrbitues;

  @JsonProperty("skills")
  private PlayerSkills skills;

  public Player id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, readOnly = true, value = "")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Player firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(example = "Bob", required = true, value = "")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Player lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(example = "Johnson", required = true, value = "")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Player position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @ApiModelProperty(value = "")


  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public Player height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @ApiModelProperty(value = "")


  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public Player weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  @ApiModelProperty(value = "")


  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Player yearsPro(Integer yearsPro) {
    this.yearsPro = yearsPro;
    return this;
  }

  /**
   * Get yearsPro
   * @return yearsPro
  */
  @ApiModelProperty(value = "")


  public Integer getYearsPro() {
    return yearsPro;
  }

  public void setYearsPro(Integer yearsPro) {
    this.yearsPro = yearsPro;
  }

  public Player origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  */
  @ApiModelProperty(value = "")


  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Player attrbitues(PlayerAttributes attrbitues) {
    this.attrbitues = attrbitues;
    return this;
  }

  /**
   * Get attrbitues
   * @return attrbitues
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlayerAttributes getAttrbitues() {
    return attrbitues;
  }

  public void setAttrbitues(PlayerAttributes attrbitues) {
    this.attrbitues = attrbitues;
  }

  public Player skills(PlayerSkills skills) {
    this.skills = skills;
    return this;
  }

  /**
   * Get skills
   * @return skills
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlayerSkills getSkills() {
    return skills;
  }

  public void setSkills(PlayerSkills skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return Objects.equals(this.id, player.id) &&
        Objects.equals(this.firstName, player.firstName) &&
        Objects.equals(this.lastName, player.lastName) &&
        Objects.equals(this.position, player.position) &&
        Objects.equals(this.height, player.height) &&
        Objects.equals(this.weight, player.weight) &&
        Objects.equals(this.yearsPro, player.yearsPro) &&
        Objects.equals(this.origin, player.origin) &&
        Objects.equals(this.attrbitues, player.attrbitues) &&
        Objects.equals(this.skills, player.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, position, height, weight, yearsPro, origin, attrbitues, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Player {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    yearsPro: ").append(toIndentedString(yearsPro)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    attrbitues: ").append(toIndentedString(attrbitues)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

