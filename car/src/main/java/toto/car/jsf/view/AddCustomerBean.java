package toto.car.jsf.view;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import java.io.Serializable;
import java.util.*;

import toto.car.ejb.entity.*;

@Named("addcustomerbean")
@ViewScoped
public class AddCustomerBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(AddCustomerBean.class);

	@Inject
	private IndexBean indexbean;
	
	@PostConstruct
	private void init() {
		logger.debug("init");
		logger.debug(indexbean.getShop().getAddress());
	}
	
	@PreDestroy
	private void destroy() {
		logger.debug("destroy");
	}
	
	public void viewCustomer() {
		Map<String,Object> options = new HashMap<String, Object>();
		options.put("modal", true);
	    options.put("draggable", false);
	    options.put("resizable", false);
	    options.put("contentHeight", 320);
        PrimeFaces.current().dialog().openDynamic("addCustomer", options, null);
	}
}
