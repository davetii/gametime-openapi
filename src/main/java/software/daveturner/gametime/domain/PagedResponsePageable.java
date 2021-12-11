package software.daveturner.gametime.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import software.daveturner.gametime.domain.PagedResponsePageableSort;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PagedResponsePageable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PagedResponsePageable   {
  @JsonProperty("sort")
  private PagedResponsePageableSort sort;

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("pageNumber")
  private Integer pageNumber;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("paged")
  private Boolean paged;

  @JsonProperty("unpaged")
  private Boolean unpaged;

  public PagedResponsePageable sort(PagedResponsePageableSort sort) {
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

  public PagedResponsePageable offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  @ApiModelProperty(value = "")


  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public PagedResponsePageable pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  */
  @ApiModelProperty(value = "")


  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PagedResponsePageable pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  @ApiModelProperty(value = "")


  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PagedResponsePageable paged(Boolean paged) {
    this.paged = paged;
    return this;
  }

  /**
   * Get paged
   * @return paged
  */
  @ApiModelProperty(value = "")


  public Boolean getPaged() {
    return paged;
  }

  public void setPaged(Boolean paged) {
    this.paged = paged;
  }

  public PagedResponsePageable unpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

  /**
   * Get unpaged
   * @return unpaged
  */
  @ApiModelProperty(value = "")


  public Boolean getUnpaged() {
    return unpaged;
  }

  public void setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResponsePageable pagedResponsePageable = (PagedResponsePageable) o;
    return Objects.equals(this.sort, pagedResponsePageable.sort) &&
        Objects.equals(this.offset, pagedResponsePageable.offset) &&
        Objects.equals(this.pageNumber, pagedResponsePageable.pageNumber) &&
        Objects.equals(this.pageSize, pagedResponsePageable.pageSize) &&
        Objects.equals(this.paged, pagedResponsePageable.paged) &&
        Objects.equals(this.unpaged, pagedResponsePageable.unpaged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, offset, pageNumber, pageSize, paged, unpaged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponsePageable {\n");
    
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
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

