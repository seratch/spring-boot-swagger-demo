package example.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-19T17:37:14.988+09:00")
public class View  implements Serializable {
  
  private String _contentType = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return _contentType;
  }
  public void setContentType(String _contentType) {
    this._contentType = _contentType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    View view = (View) o;
    return Objects.equals(_contentType, view._contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    
    sb.append("    _contentType: ").append(toIndentedString(_contentType)).append("\n");
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

