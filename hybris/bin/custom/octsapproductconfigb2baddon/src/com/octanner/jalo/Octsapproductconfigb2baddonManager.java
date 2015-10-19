/*
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 */
package com.octanner.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.octanner.constants.Octsapproductconfigb2baddonConstants;

import org.apache.log4j.Logger;


public class Octsapproductconfigb2baddonManager extends GeneratedOctsapproductconfigb2baddonManager
{
	private final static Logger LOG = Logger.getLogger(Octsapproductconfigb2baddonManager.class.getName());

	public static final Octsapproductconfigb2baddonManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Octsapproductconfigb2baddonManager) em.getExtension(Octsapproductconfigb2baddonConstants.EXTENSIONNAME);
	}


	/**
	 * Never call the constructor of any manager directly, call getInstance() You can place your business logic here -
	 * like registering a jalo session listener. Each manager is created once for each tenant.
	 */
	public Octsapproductconfigb2baddonManager()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("constructor of octsapproductconfigb2baddonManager called.");
		}
	}
}
