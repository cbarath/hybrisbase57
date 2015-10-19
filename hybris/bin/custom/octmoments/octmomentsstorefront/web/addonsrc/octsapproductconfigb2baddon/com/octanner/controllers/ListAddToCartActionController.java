/**
 *
 */
package com.octanner.controllers;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import com.moments.storefront.controllers.cms.DefaultCMSComponentController;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("ListAddToCartActionController")
@Scope("tenant")
@RequestMapping(value = "/view/ListAddToCartActionController")
public class ListAddToCartActionController extends DefaultCMSComponentController
{
	@Override
	protected String getView(final AbstractCMSComponentModel component)
	{
		// TODO: use some constants, for ext name, default cms folder, ...
		return "/../addons/octsapproductconfigb2baddon/desktop/cms/configureproductaction";
	}

}
