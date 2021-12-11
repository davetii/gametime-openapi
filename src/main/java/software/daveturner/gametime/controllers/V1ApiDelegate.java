package software.daveturner.gametime.controllers;

import software.daveturner.gametime.domain.Conference;
import software.daveturner.gametime.domain.Player;
import software.daveturner.gametime.domain.PlayersPagedList;
import software.daveturner.gametime.domain.Team;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link V1ApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface V1ApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /v1/teams/{teamId} : Add Player to a team
     * Add Player to a team
     *
     * @param teamId Team ID (required)
     * @param team  (required)
     * @return Team Updated (status code 204)
     *         or Not Found (status code 404)
     * @see V1Api#addPlayerToTeamV1
     */
    default ResponseEntity<Void> addPlayerToTeamV1(String teamId,
        Team team) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

    /**
     * POST /v1/players : New Player
     * Create a new Player
     *
     * @param player  (required)
     * @return Player Created (status code 201)
     *         or Bad Request (status code 400)
     * @see V1Api#createPlayerV1
     */
    default ResponseEntity<Void> createPlayerV1(Player player) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

    /**
     * DELETE /v1/players/{playerId} : Delete Player
     * Delete an existing player
     *
     * @param playerId Player Id (required)
     * @return Payer Updated (status code 200)
     *         or Not Found (status code 404)
     * @see V1Api#deletePlayerByIdV1
     */
    default ResponseEntity<Void> deletePlayerByIdV1(UUID playerId) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

    /**
     * GET /v1/conference/{confId} : list of all teams in a  given conference
     * a list of all **Teams** in the league in a given conference
     *
     * @param confId  (required)
     * @return returns a list of all teams in a given conference (status code 200)
     * @see V1Api#getConferenceByIdV1
     */
    default ResponseEntity<Conference> getConferenceByIdV1(String confId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"teams\" : [ { \"players\" : [ { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }, { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" } ], \"gm\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" }, \"name\" : \"name\", \"id\" : \"NY\", \"locale\" : \"locale\", \"coach\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" } }, { \"players\" : [ { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }, { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" } ], \"gm\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" }, \"name\" : \"name\", \"id\" : \"NY\", \"locale\" : \"locale\", \"coach\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" } } ], \"id\" : \"EAST\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

    /**
     * GET /v1/league : list of all conferences, teams, players in league
     * a list of all **Actors** in the league
     *
     * @return list of all conferences, teams, players in league (status code 200)
     * @see V1Api#getLeagueV1
     */
    default ResponseEntity<List<Conference>> getLeagueV1() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"teams\" : [ { \"players\" : [ { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }, { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" } ], \"gm\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" }, \"name\" : \"name\", \"id\" : \"NY\", \"locale\" : \"locale\", \"coach\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" } }, { \"players\" : [ { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }, { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" } ], \"gm\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" }, \"name\" : \"name\", \"id\" : \"NY\", \"locale\" : \"locale\", \"coach\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" } } ], \"id\" : \"EAST\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

    /**
     * GET /v1/players/{playerId} : fetch player by id
     *
     * @param playerId Player Id (required)
     * @return Found Player (status code 200)
     *         or Not Found (status code 404)
     * @see V1Api#getPlayerByIdV1
     */
    default ResponseEntity<Player> getPlayerByIdV1(UUID playerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

    /**
     * GET /v1/teams/{teamId} : fetch Team by id
     *
     * @param teamId Team ID (required)
     * @return Found Team (status code 200)
     *         or Not Found (status code 404)
     * @see V1Api#getTeamByIdV1
     */
    default ResponseEntity<Team> getTeamByIdV1(String teamId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"players\" : [ { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }, { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" } ], \"gm\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" }, \"name\" : \"name\", \"id\" : \"NY\", \"locale\" : \"locale\", \"coach\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

    /**
     * GET /v1/teams : list of all teams
     * a list of all **Teams** in the league
     *
     * @return returns a list of all teams (status code 200)
     * @see V1Api#getTeamsV1
     */
    default ResponseEntity<List<Team>> getTeamsV1() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"players\" : [ { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }, { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" } ], \"gm\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" }, \"name\" : \"name\", \"id\" : \"NY\", \"locale\" : \"locale\", \"coach\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

    /**
     * GET /v1/players : List all players in the league
     * returns a list of all players 
     *
     * @param pageNumber Page number (optional, default to 1)
     * @param pageSize Page Size (optional, default to 25)
     * @return Return a List of Players in the system (status code 200)
     * @see V1Api#listPlayersV1
     */
    default ResponseEntity<PlayersPagedList> listPlayersV1(Integer pageNumber,
        Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"content\" : [ { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" }, { \"skills\" : { \"defenseRebound\" : 6.778324963048013, \"longRange\" : 9.018348186070783, \"individualDefense\" : 6.965117697638846, \"ballSecurity\" : 5.025004791520295, \"acumen\" : 4.965218492984954, \"post\" : 3.5571952270680973, \"teamDefense\" : 1.284659006116532, \"freeThrows\" : 8.762042012749001, \"perimeter\" : 6.438423552598547, \"offenseRebound\" : 2.8841621266687802, \"passing\" : 9.965781217890562, \"drive\" : 6.683562403749608, \"teamOffense\" : 9.369310271410669 }, \"firstName\" : \"Bob\", \"lastName\" : \"Johnson\", \"yearsPro\" : 6, \"origin\" : \"origin\", \"weight\" : 0, \"attrbitues\" : { \"luck\" : 7, \"strength\" : 1, \"health\" : 2, \"determination\" : 5, \"handle\" : 3, \"ego\" : 2, \"endurance\" : 7, \"charisma\" : 5, \"speed\" : 7, \"intelligence\" : 4, \"shotSelection\" : 1, \"size\" : 6, \"person\" : 1, \"shotSkill\" : 1, \"agility\" : 1, \"energy\" : 9 }, \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\", \"position\" : \"PG\", \"height\" : \"height\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

    /**
     * DELETE /v1/teams/{teamId} : Remove Player from Team
     * Remove Player from Team
     *
     * @param teamId Team ID (required)
     * @return Team Updated (status code 200)
     *         or Not Found (status code 404)
     * @see V1Api#removePlayerFromTeamV1
     */
    default ResponseEntity<Void> removePlayerFromTeamV1(String teamId) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

    /**
     * PUT /v1/players/{playerId} : Update Player
     * Update an existing player
     *
     * @param playerId Player Id (required)
     * @param player  (required)
     * @return Player Updated (status code 204)
     *         or Not Found (status code 404)
     * @see V1Api#updatePlayerByIdV1
     */
    default ResponseEntity<Void> updatePlayerByIdV1(UUID playerId,
        Player player) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
