/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aws.codestar.filter.jaxbXml;

import com.aws.codestar.projecttemplates.pojo.Personnel;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 主页数据 对象转xml
 *
 * @author lian
 */
@XmlRootElement(name = "document")
public class PersonnelList {

	private Personnel personnel;

	/**
	 * @return the personnels
	 */
	@XmlElement(name = "personnel")
	public Personnel getPersonnels() {
		return personnel;
	}

	/**
	 * @param personnels the personnels to set
	 */
	public void setPersonnels(Personnel personnel) {
		this.personnel = personnel;
	}

}
