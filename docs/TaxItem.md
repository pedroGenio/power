

# TaxItem

A tax item is created for each tax rate and tax type used in the bill.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxCategory** | **String** | Tax category |  [optional]
**taxRate** | **Float** | Applied rate of the tax |  [optional]
**taxAmount** | [**Money**](Money.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



