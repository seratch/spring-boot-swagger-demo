package example.client.api;

import example.client.invoker.ApiException;
import example.client.invoker.ApiClient;
import example.client.invoker.Configuration;
import example.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import example.client.model.ModelAndView;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-19T17:37:14.988+09:00")
public class BasicerrorcontrollerApi {
  private ApiClient apiClient;

  public BasicerrorcontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BasicerrorcontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * errorHtml
   * 
   * @return ModelAndView
   */
  public ModelAndView errorHtmlUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/html"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ModelAndView> returnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * errorHtml
   * 
   * @return ModelAndView
   */
  public ModelAndView errorHtmlUsingHEAD() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/html"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ModelAndView> returnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(path, "HEAD", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * errorHtml
   * 
   * @return ModelAndView
   */
  public ModelAndView errorHtmlUsingPUT() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/html"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ModelAndView> returnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * errorHtml
   * 
   * @return ModelAndView
   */
  public ModelAndView errorHtmlUsingPOST() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/html"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ModelAndView> returnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * errorHtml
   * 
   * @return ModelAndView
   */
  public ModelAndView errorHtmlUsingDELETE() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/html"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ModelAndView> returnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * errorHtml
   * 
   * @return ModelAndView
   */
  public ModelAndView errorHtmlUsingPATCH() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/html"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ModelAndView> returnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * errorHtml
   * 
   * @return ModelAndView
   */
  public ModelAndView errorHtmlUsingOPTIONS() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/error".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/html"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ModelAndView> returnType = new GenericType<ModelAndView>() {};
    return apiClient.invokeAPI(path, "OPTIONS", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
