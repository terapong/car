package toto.car.jsf.view;

import java.io.Serializable;
import java.util.Calendar;

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
	
	private Calendar cal;

	@PostConstruct
	private void init() {
		logger.debug("init");
		cal = Calendar.getInstance();
	}
	
	@PreDestroy
	private void destroy() {
		logger.debug("destroy");
	}
}
