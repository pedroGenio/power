

# Catalog

A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the Catalog |  [optional]
**href** | **String** | Unique reference of the catalog |  [optional]
**catalogType** | **String** | Indicates if the catalog is a product, service or resource catalog |  [optional]
**description** | **String** | Description of this catalog |  [optional]
**lastUpdate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of the last update |  [optional]
**lifecycleStatus** | **String** | Used to indicate the current lifecycle status |  [optional]
**name** | **String** | Name of the catalog |  [optional]
**version** | **String** | Catalog version |  [optional]
**category** | [**List&lt;CategoryRef&gt;**](CategoryRef.md) | List of root categories contained in this catalog |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) | List of parties involved in this catalog |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]


