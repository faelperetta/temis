/**
 * 
 */
package com.sjcdigital.temis.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sjcdigital.temis.model.document.Alderman;
import com.sjcdigital.temis.model.repositories.AldermanRepository;

/**
 * @author pedro-hos
 */

@RestController(value = "api/alderman/")
public class AldermanController {
	
	@Autowired
	private AldermanRepository aldermanRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	public Collection<Alderman> getCurrentAldermen() {
		return aldermanRepository.findAll(new Sort(Sort.Direction.ASC, "name"));
	}
	
}