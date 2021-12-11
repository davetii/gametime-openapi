package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import software.daveturner.gametime.domain.Coach;
import software.daveturner.gametime.domain.GM;
import software.daveturner.gametime.domain.Player;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A group of individuals representing a locale
 */
@ApiModel(description = "A group of individuals representing a locale")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Team   {
  /**
   * Gets or Sets id
   */
  public enum IdEnum {
    NY("NY"),
    
    PHI("PHI"),
    
    BOS("BOS"),
    
    CON("CON"),
    
    JACK("JACK"),
    
    NC("NC"),
    
    WASH("WASH"),
    
    ATL("ATL"),
    
    BRK("BRK"),
    
    MIA("MIA"),
    
    MI("MI"),
    
    CHI("CHI"),
    
    TOR("TOR"),
    
    VIR("VIR"),
    
    IND("IND"),
    
    CLEV("CLEV"),
    
    MIN("MIN"),
    
    PIT("PIT"),
    
    MIL("MIL"),
    
    BUF("BUF"),
    
    TEN("TEN"),
    
    KC("KC"),
    
    STL("STL"),
    
    HOU("HOU"),
    
    SA("SA"),
    
    FALSE("false"),
    
    DAL("DAL"),
    
    DEN("DEN"),
    
    OKL("OKL"),
    
    ALA("ALA"),
    
    SD("SD"),
    
    LA("LA"),
    
    PHO("PHO"),
    
    CA("CA"),
    
    POR("POR"),
    
    SF("SF"),
    
    SEA("SEA"),
    
    UT("UT"),
    
    VAN("VAN"),
    
    LV("LV");

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

  @JsonProperty("players")
  @Valid
  private List<Player> players = null;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("name")
  private String name;

  @JsonProperty("coach")
  private Coach coach;

  @JsonProperty("gm")
  private GM gm;

  public Team id(IdEnum id) {
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

  public Team players(List<Player> players) {
    this.players = players;
    return this;
  }

  public Team addPlayersItem(Player playersItem) {
    if (this.players == null) {
      this.players = new ArrayList<>();
    }
    this.players.add(playersItem);
    return this;
  }

  /**
   * Get players
   * @return players
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  public Team locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  @ApiModelProperty(value = "")


  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Team name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team coach(Coach coach) {
    this.coach = coach;
    return this;
  }

  /**
   * Get coach
   * @return coach
  */
  @ApiModelProperty(value = "")

  @Valid

  public Coach getCoach() {
    return coach;
  }

  public void setCoach(Coach coach) {
    this.coach = coach;
  }

  public Team gm(GM gm) {
    this.gm = gm;
    return this;
  }

  /**
   * Get gm
   * @return gm
  */
  @ApiModelProperty(value = "")

  @Valid

  public GM getGm() {
    return gm;
  }

  public void setGm(GM gm) {
    this.gm = gm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.id, team.id) &&
        Objects.equals(this.players, team.players) &&
        Objects.equals(this.locale, team.locale) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.coach, team.coach) &&
        Objects.equals(this.gm, team.gm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, players, locale, name, coach, gm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coach: ").append(toIndentedString(coach)).append("\n");
    sb.append("    gm: ").append(toIndentedString(gm)).append("\n");
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

