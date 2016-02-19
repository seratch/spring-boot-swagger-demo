package example.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import example.client.model.ModelAndViewModelMap;
import example.client.model.View;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Map;

import java.io.Serializable;



@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-19T17:37:14.988+09:00")
public class ModelAndView  implements Serializable {
  
  private Boolean empty = null;
  private Object model = null;
  private Map<String, ModelAndViewModelMap> modelMap = new HashMap<String, ModelAndViewModelMap>();
  private Boolean reference = null;
  private View view = null;
  private String viewName = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public Object getModel() {
    return model;
  }
  public void setModel(Object model) {
    this.model = model;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modelMap")
  public Map<String, ModelAndViewModelMap> getModelMap() {
    return modelMap;
  }
  public void setModelMap(Map<String, ModelAndViewModelMap> modelMap) {
    this.modelMap = modelMap;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reference")
  public Boolean getReference() {
    return reference;
  }
  public void setReference(Boolean reference) {
    this.reference = reference;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("view")
  public View getView() {
    return view;
  }
  public void setView(View view) {
    this.view = view;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("viewName")
  public String getViewName() {
    return viewName;
  }
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAndView modelAndView = (ModelAndView) o;
    return Objects.equals(empty, modelAndView.empty) &&
        Objects.equals(model, modelAndView.model) &&
        Objects.equals(modelMap, modelAndView.modelMap) &&
        Objects.equals(reference, modelAndView.reference) &&
        Objects.equals(view, modelAndView.view) &&
        Objects.equals(viewName, modelAndView.viewName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, model, modelMap, reference, view, viewName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelMap: ").append(toIndentedString(modelMap)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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

