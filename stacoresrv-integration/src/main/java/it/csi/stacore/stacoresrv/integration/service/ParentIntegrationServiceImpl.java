package it.csi.stacore.stacoresrv.integration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import it.csi.stacore.stacoresrv.util.Constants;

public abstract class ParentIntegrationServiceImpl {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Autowired
	protected ApplicationContext applicationContext;
}
