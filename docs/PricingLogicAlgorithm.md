

# PricingLogicAlgorithm

The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled bahavior in SID). Some of the parameters of the interface definiition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique id of the PricingLogicAlgorithm |  [optional]
**href** | **String** | hyperlink reference of this PricingLogicAlgorithm |  [optional]
**description** | **String** | Description of the PricingLogicAlgorithm |  [optional]
**name** | **String** | Name given to the PricingLogicAlgorithm |  [optional]
**plaSpecId** | **String** | id of corresponding PricingLogicAlgorithm specification |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



