/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aws.codestar.projecttemplates.pojo;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * 跟踪者或跟随者
 *
 * @author lian
 */
public class PersonnelFollo {

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 跟踪者或跟随者数据
	 */
	private List<Personnel> Personnels;

	/**
	 * @return the status
	 */
	@XmlAttribute(name = "status")
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the Personnels
	 */
	@XmlElementWrapper(name = "Personnels")
	@XmlElement(name = "Personnel")
	public List<Personnel> getPersonnels() {
		return Personnels;
	}

	/**
	 * @param Personnels the Personnels to set
	 */
	public void setPersonnels(List<Personnel> Personnels) {
		this.Personnels = Personnels;
	}
}
