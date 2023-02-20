package com.adobe.aem.guides.reddy.core.services.impl;

import org.osgi.service.component.annotations.Component;
import static com.adobe.aem.guides.reddy.core.constants.AppConstants.URL;
import com.adobe.aem.guides.reddy.core.utils.Network;

@Component(immediate = true, service = ReadJsonService.class)

public class ReadJsonDataImpl implements ReadJsonService {

	@Override
	public String getData() {
		
		
		String response = Network.readJson(URL);
		
		return response;
 }
}
