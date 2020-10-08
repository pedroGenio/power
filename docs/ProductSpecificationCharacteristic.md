

# ProductSpecificationCharacteristic

A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurable** | **Boolean** | If true, the Boolean indicates that the ProductSpecificationCharacteristic is configurable |  [optional]
**description** | **String** | A narrative that explains in detail what the ProductSpecificationCharacteristic is |  [optional]
**extensible** | **Boolean** | An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a product |  [optional]
**isUnique** | **Boolean** | An indicator that specifies if a value is unique for the specification. Possible values are; \&quot;unique while value is in effect\&quot; and \&quot;unique whether value is in effect or not\&quot; |  [optional]
**maxCardinality** | **Integer** | The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality |  [optional]
**minCardinality** | **Integer** | The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality |  [optional]
**name** | **String** | Name of the ProductSpecificationCharacteristic |  [optional]
**regex** | **String** | A rule or principle represented in regular expression used to derive the value of a characteristic value |  [optional]
**valueType** | **String** | A kind of value that the characteristic can take on, such as numeric, text and so forth |  [optional]
**productSpecCharRelationship** | [**List&lt;ProductSpecificationCharacteristicRelationship&gt;**](ProductSpecificationCharacteristicRelationship.md) | An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics. |  [optional]
**productSpecCharacteristicValue** | [**List&lt;ProductSpecificationCharacteristicValue&gt;**](ProductSpecificationCharacteristicValue.md) | A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on. |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



