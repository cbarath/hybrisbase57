/**
 *
 */
package com.octanner.attributehandlers;

import com.octanner.model.CMSConfigurableProductRestrictionModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import de.hybris.platform.util.localization.Localization;


public class ConfigurableProductRestrictionDynamicDescription
		implements DynamicAttributeHandler<String, CMSConfigurableProductRestrictionModel>
{


	@Override
	public String get(final CMSConfigurableProductRestrictionModel model)
	{
		final String localizedString = Localization.getLocalizedString("type.CMSConfigurableRestriction.description.text");
		String result;
		if (localizedString == null)
		{
			result = "Page/Component only applies for configurable products";
		}
		else
		{
			result = localizedString;
		}
		return result.toString();
	}


	@Override
	public void set(final CMSConfigurableProductRestrictionModel model, final String value)
	{
		throw new UnsupportedOperationException();
	}

}
