package com.adobe.aem.guides.reddy.core.models;


import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)


public class SlingModelExample {
	@Inject
	public String authorname; 
	
	public String getAuthorName()
	{
		return authorname;
	}

}
