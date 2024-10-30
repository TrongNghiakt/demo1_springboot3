package vn.iotstar.configs;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

// class nay tuong tu voi file sitemesh xml voi vi springboot khong cho phep ton tai file sitemesh xml
public class MySiteMeshFilter extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "/web.jsp").addDecoratorPath("/admin/*", "/admin.jsp")
				.addExcludedPath("/login/*").addExcludedPath("/v1/api/*");
	}
}
