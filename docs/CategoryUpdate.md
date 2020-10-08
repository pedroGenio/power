

# CategoryUpdate

The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,lastUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the category |  [optional]
**isRoot** | **Boolean** | If true, this Boolean indicates that the category is a root of categories |  [optional]
**lifecycleStatus** | **String** | Used to indicate the current lifecycle status |  [optional]
**name** | **String** | Name of the category |  [optional]
**parentId** | **String** | Unique identifier of the parent category |  [optional]
**version** | **String** | Category version |  [optional]
**productOffering** | [**List&lt;ProductOfferingRef&gt;**](ProductOfferingRef.md) | A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information. |  [optional]
**subCategory** | [**List&lt;CategoryRef&gt;**](CategoryRef.md) | The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings. |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



