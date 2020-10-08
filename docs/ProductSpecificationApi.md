# ProductSpecificationApi

All URIs are relative to *http://localhost:3000/platform/productCatalogManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listProductSpecification**](ProductSpecificationApi.md#listProductSpecification) | **GET** /productSpecification | List or find ProductSpecification objects
[**retrieveProductSpecification**](ProductSpecificationApi.md#retrieveProductSpecification) | **GET** /productSpecification/{id} | Retrieves a ProductSpecification by ID


<a name="listProductSpecification"></a>
# **listProductSpecification**
> List&lt;ProductSpecification&gt; listProductSpecification(fields, offset, limit)

List or find ProductSpecification objects

This operation list or find ProductSpecification entities

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductSpecificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/platform/productCatalogManagement/v4");

    ProductSpecificationApi apiInstance = new ProductSpecificationApi(defaultClient);
    String fields = "fields_example"; // String | Comma-separated properties to be provided in response
    Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
    Integer limit = 56; // Integer | Requested number of resources to be provided in response
    try {
      List<ProductSpecification> result = apiInstance.listProductSpecification(fields, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSpecificationApi#listProductSpecification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional]
 **limit** | **Integer**| Requested number of resources to be provided in response | [optional]

### Return type

[**List&lt;ProductSpecification&gt;**](ProductSpecification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-Total-Count - Total number of items matching criteria <br>  * X-Result-Count - Actual number of items returned in the response body <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="retrieveProductSpecification"></a>
# **retrieveProductSpecification**
> ProductSpecification retrieveProductSpecification(id, fields)

Retrieves a ProductSpecification by ID

This operation retrieves a ProductSpecification entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductSpecificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/platform/productCatalogManagement/v4");

    ProductSpecificationApi apiInstance = new ProductSpecificationApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ProductSpecification
    String fields = "fields_example"; // String | Comma-separated properties to provide in response
    try {
      ProductSpecification result = apiInstance.retrieveProductSpecification(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductSpecificationApi#retrieveProductSpecification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the ProductSpecification |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**ProductSpecification**](ProductSpecification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

