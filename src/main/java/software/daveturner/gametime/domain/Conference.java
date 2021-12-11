package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import software.daveturner.gametime.domain.Team;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A collection of teams organized by a region
 */
@ApiModel(description = "A collection of teams organized by a region")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Conference   {
  /**
   * Gets or Sets id
   */
  public enum IdEnum {
    EAST("EAST"),
    
    NORTH("NORTH"),
    
    SOUTH("SOUTH"),
    
    WEST("WEST");

    private String value;

    IdEnum(String value) {
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
    public static IdEnum fromValue(String value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("id")
  private IdEnum id;

  @JsonProperty("teams")
  @Valid
  private List<Team> teams = null;

  public Conference id(IdEnum id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "")


  public IdEnum getId() {
    return id;
  }

  public void setId(IdEnum id) {
    this.id = id;
  }

  public Conference teams(List<Team> teams) {
    this.teams = teams;
    return this;
  }

  public Conference addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conference conference = (Conference) o;
    return Objects.equals(this.id, conference.id) &&
        Objects.equals(this.teams, conference.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

