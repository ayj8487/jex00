package org.zerock.config;

import javax.servlet.ServletConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	// xml 을 사용하지 않는 경우 xml작성의 역할을 대신하는 클래스

	// root-context.xml 대신
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return null;
//		return new Class[] { ServletConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return null;
//		return new String[] { "/" };
	}

//	@Override
//	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//
//		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
//	}
}