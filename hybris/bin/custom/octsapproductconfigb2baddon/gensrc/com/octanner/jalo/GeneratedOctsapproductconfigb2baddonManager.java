/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 19, 2015 4:27:56 PM                     ---
 * ----------------------------------------------------------------
 */
package com.octanner.jalo;

import com.octanner.constants.Octsapproductconfigb2baddonConstants;
import com.octanner.jalo.CMSConfigurableProductRestriction;
import com.octanner.jalo.ProductAddConfigToCartComponent;
import com.octanner.jalo.ProductConfigPage;
import com.octanner.jalo.ProductConfigurationButtonComponent;
import com.octanner.jalo.ProductConfigurationFormComponent;
import com.octanner.jalo.ProductConfigurationImageComponent;
import com.octanner.jalo.ProductConfigurationPriceSummaryComponent;
import com.octanner.jalo.ProductConfigurationSpecificationComponent;
import com.octanner.jalo.ProductConfigurationTabNavigationComponent;
import com.octanner.jalo.ProductConfigurationTitleSummaryComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Octsapproductconfigb2baddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOctsapproductconfigb2baddonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CMSConfigurableProductRestriction createCMSConfigurableProductRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.CMSCONFIGURABLEPRODUCTRESTRICTION );
			return (CMSConfigurableProductRestriction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSConfigurableProductRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CMSConfigurableProductRestriction createCMSConfigurableProductRestriction(final Map attributeValues)
	{
		return createCMSConfigurableProductRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductAddConfigToCartComponent createProductAddConfigToCartComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTADDCONFIGTOCARTCOMPONENT );
			return (ProductAddConfigToCartComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductAddConfigToCartComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductAddConfigToCartComponent createProductAddConfigToCartComponent(final Map attributeValues)
	{
		return createProductAddConfigToCartComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigPage createProductConfigPage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGPAGE );
			return (ProductConfigPage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigPage : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigPage createProductConfigPage(final Map attributeValues)
	{
		return createProductConfigPage( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigurationButtonComponent createProductConfigurationButtonComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGURATIONBUTTONCOMPONENT );
			return (ProductConfigurationButtonComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigurationButtonComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigurationButtonComponent createProductConfigurationButtonComponent(final Map attributeValues)
	{
		return createProductConfigurationButtonComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigurationFormComponent createProductConfigurationFormComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGURATIONFORMCOMPONENT );
			return (ProductConfigurationFormComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigurationFormComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigurationFormComponent createProductConfigurationFormComponent(final Map attributeValues)
	{
		return createProductConfigurationFormComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigurationImageComponent createProductConfigurationImageComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGURATIONIMAGECOMPONENT );
			return (ProductConfigurationImageComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigurationImageComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigurationImageComponent createProductConfigurationImageComponent(final Map attributeValues)
	{
		return createProductConfigurationImageComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigurationPriceSummaryComponent createProductConfigurationPriceSummaryComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGURATIONPRICESUMMARYCOMPONENT );
			return (ProductConfigurationPriceSummaryComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigurationPriceSummaryComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigurationPriceSummaryComponent createProductConfigurationPriceSummaryComponent(final Map attributeValues)
	{
		return createProductConfigurationPriceSummaryComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigurationSpecificationComponent createProductConfigurationSpecificationComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGURATIONSPECIFICATIONCOMPONENT );
			return (ProductConfigurationSpecificationComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigurationSpecificationComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigurationSpecificationComponent createProductConfigurationSpecificationComponent(final Map attributeValues)
	{
		return createProductConfigurationSpecificationComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigurationTabNavigationComponent createProductConfigurationTabNavigationComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGURATIONTABNAVIGATIONCOMPONENT );
			return (ProductConfigurationTabNavigationComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigurationTabNavigationComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigurationTabNavigationComponent createProductConfigurationTabNavigationComponent(final Map attributeValues)
	{
		return createProductConfigurationTabNavigationComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductConfigurationTitleSummaryComponent createProductConfigurationTitleSummaryComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Octsapproductconfigb2baddonConstants.TC.PRODUCTCONFIGURATIONTITLESUMMARYCOMPONENT );
			return (ProductConfigurationTitleSummaryComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductConfigurationTitleSummaryComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductConfigurationTitleSummaryComponent createProductConfigurationTitleSummaryComponent(final Map attributeValues)
	{
		return createProductConfigurationTitleSummaryComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Octsapproductconfigb2baddonConstants.EXTENSIONNAME;
	}
	
}
