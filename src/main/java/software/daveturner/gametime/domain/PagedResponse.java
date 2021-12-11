package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import software.daveturner.gametime.domain.PagedResponsePageable;
import software.daveturner.gametime.domain.PagedResponsePageableSort;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PagedResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PagedResponse   {
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

  public PagedResponse pageable(PagedResponsePageable pageable) {
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

  public PagedResponse totalPages(Integer totalPages) {
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

  public PagedResponse last(Boolean last) {
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

  public PagedResponse totalElements(Integer totalElements) {
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

  public PagedResponse size(Integer size) {
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

  public PagedResponse number(Integer number) {
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

  public PagedResponse numberOfElements(Integer numberOfElements) {
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

  public PagedResponse sort(PagedResponsePageableSort sort) {
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

  public PagedResponse first(Boolean first) {
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
    PagedResponse pagedResponse = (PagedResponse) o;
    return Objects.equals(this.pageable, pagedResponse.pageable) &&
        Objects.equals(this.totalPages, pagedResponse.totalPages) &&
        Objects.equals(this.last, pagedResponse.last) &&
        Objects.equals(this.totalElements, pagedResponse.totalElements) &&
        Objects.equals(this.size, pagedResponse.size) &&
        Objects.equals(this.number, pagedResponse.number) &&
        Objects.equals(this.numberOfElements, pagedResponse.numberOfElements) &&
        Objects.equals(this.sort, pagedResponse.sort) &&
        Objects.equals(this.first, pagedResponse.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageable, totalPages, last, totalElements, size, number, numberOfElements, sort, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponse {\n");
    
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

