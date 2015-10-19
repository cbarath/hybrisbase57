/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 19, 2015 4:27:56 PM                     ---
 * ----------------------------------------------------------------
 */
package com.octanner.jalo;

import com.octanner.constants.Octsapproductconfigb2baddonConstants;
import de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent ProductAddConfigToCartComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductAddConfigToCartComponent extends CMSParagraphComponent
{
	/** Qualifier of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute **/
	public static final String SHOWONLYFORLONGCONFIGURATIONS = "showOnlyForLongConfigurations";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CMSParagraphComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SHOWONLYFORLONGCONFIGURATIONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute.
	 * @return the showOnlyForLongConfigurations
	 */
	public Boolean isShowOnlyForLongConfigurations(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOWONLYFORLONGCONFIGURATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute.
	 * @return the showOnlyForLongConfigurations
	 */
	public Boolean isShowOnlyForLongConfigurations()
	{
		return isShowOnlyForLongConfigurations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute. 
	 * @return the showOnlyForLongConfigurations
	 */
	public boolean isShowOnlyForLongConfigurationsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShowOnlyForLongConfigurations( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute. 
	 * @return the showOnlyForLongConfigurations
	 */
	public boolean isShowOnlyForLongConfigurationsAsPrimitive()
	{
		return isShowOnlyForLongConfigurationsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute. 
	 * @param value the showOnlyForLongConfigurations
	 */
	public void setShowOnlyForLongConfigurations(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOWONLYFORLONGCONFIGURATIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute. 
	 * @param value the showOnlyForLongConfigurations
	 */
	public void setShowOnlyForLongConfigurations(final Boolean value)
	{
		setShowOnlyForLongConfigurations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute. 
	 * @param value the showOnlyForLongConfigurations
	 */
	public void setShowOnlyForLongConfigurations(final SessionContext ctx, final boolean value)
	{
		setShowOnlyForLongConfigurations( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAddConfigToCartComponent.showOnlyForLongConfigurations</code> attribute. 
	 * @param value the showOnlyForLongConfigurations
	 */
	public void setShowOnlyForLongConfigurations(final boolean value)
	{
		setShowOnlyForLongConfigurations( getSession().getSessionContext(), value );
	}
	
}
