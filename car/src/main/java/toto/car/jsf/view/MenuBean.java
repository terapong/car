package toto.car.jsf.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.apache.log4j.Logger;

@Named("menubean")
@ViewScoped
public class MenuBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(IndexBean.class);

	@PostConstruct
	private void init() {
		logger.debug("init");
	}
	
	@PreDestroy
	private void destroy() {
		logger.debug("destroy");
	}
	
	public String addCarClick() {
		logger.debug("addCarClick");
		return null;
	}
	
	public String addColorClick() {
		logger.debug("addColorClick");
		return null;
	}
	
	public String addBlandClick() {
		logger.debug("addBlandClick");
		return null;
	}
	
	public String addModelClick() {
		logger.debug("addModelClick");
		return null;
	}
}
