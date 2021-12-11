package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import software.daveturner.gametime.domain.PagedResponse;
import software.daveturner.gametime.domain.PagedResponsePageable;
import software.daveturner.gametime.domain.PagedResponsePageableSort;
import software.daveturner.gametime.domain.Player;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlayersPagedList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlayersPagedList   {
  @JsonProperty("content")
  @Valid
  private List<Player> content = null;

  @JsonProperty("pageable")
  private PagedResponsePageable pageable;

  @JsonProperty("totalPages")
  private Integer totalPages;

  @JsonProperty("last")
  private Boolean last;

  @JsonProperty("totalElements")
  private Integer totalElements;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("number")
  private Integer number;

  @JsonProperty("numberOfElements")
  private Integer numberOfElements;

  @JsonProperty("sort")
  private PagedResponsePageableSort sort;

  @JsonProperty("first")
  private Boolean first;

  public PlayersPagedList content(List<Player> content) {
    this.content = content;
    return this;
  }

  public PlayersPagedList addContentItem(Player contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Player> getContent() {
    return content;
  }

  public void setContent(List<Player> content) {
    this.content = content;
  }

  public PlayersPagedList pageable(PagedResponsePageable pageable) {
    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
  */
  @ApiModelProperty(value = "")

  @Valid

  public PagedResponsePageable getPageable() {
    return pageable;
  }

  public void setPageable(PagedResponsePageable pageable) {
    this.pageable = pageable;
  }

  public PlayersPagedList totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @ApiModelProperty(value = "")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PlayersPagedList last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  @ApiModelProperty(value = "")


  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PlayersPagedList totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @ApiModelProperty(value = "")


  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public PlayersPagedList size(Integer size) {
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

  public PlayersPagedList number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(value = "")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PlayersPagedList numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PlayersPagedList sort(PagedResponsePageableSort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @ApiModelProperty(value = "")

  @Valid

  public PagedResponsePageableSort getSort() {
    return sort;
  }

  public void setSort(PagedResponsePageableSort sort) {
    this.sort = sort;
  }

  public PlayersPagedList first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  @ApiModelProperty(value = "")


  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayersPagedList playersPagedList = (PlayersPagedList) o;
    return Objects.equals(this.content, playersPagedList.content) &&
        Objects.equals(this.pageable, playersPagedList.pageable) &&
        Objects.equals(this.totalPages, playersPagedList.totalPages) &&
        Objects.equals(this.last, playersPagedList.last) &&
        Objects.equals(this.totalElements, playersPagedList.totalElements) &&
        Objects.equals(this.size, playersPagedList.size) &&
        Objects.equals(this.number, playersPagedList.number) &&
        Objects.equals(this.numberOfElements, playersPagedList.numberOfElements) &&
        Objects.equals(this.sort, playersPagedList.sort) &&
        Objects.equals(this.first, playersPagedList.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pageable, totalPages, last, totalElements, size, number, numberOfElements, sort, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayersPagedList {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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

