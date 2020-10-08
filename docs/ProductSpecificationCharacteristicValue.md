

# ProductSpecificationCharacteristicValue

A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isDefault** | **Boolean** | Indicates if the value is the default value for a characteristic |  [optional]
**rangeInterval** | **String** | An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \&quot;open\&quot;, \&quot;closed\&quot;, \&quot;closedBottom\&quot; and \&quot;closedTop\&quot;. |  [optional]
**regex** | **String** | Regular expression to define constraint on the allowed value |  [optional]
**unitOfMeasure** | **String** | A length, surface, volume, dry measure, liquid measure, money, weight, time, and the like. In general, a determinate quantity or magnitude of the kind designated, taken as a standard of comparison for others of the same kind, in assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot. |  [optional]
**valueFrom** | **String** | The low range value that a characteristic can take on |  [optional]
**valueTo** | **String** | The upper range value that a characteristic can take on |  [optional]
**valueType** | **String** | A kind of value that the characteristic can take on, such as numeric, text, and so forth |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**value** | [**Object**](.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



