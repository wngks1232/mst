package kr.seacretdirect.mst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataCountController {
	
	@RequestMapping(value = "/count",method = RequestMethod.GET)
	public String countPage() {
		return "/content/countMain";
	}
	
}
