/*
 * GithubRepo.java
 *
 * Created on 2018-03-22, 7:35
 */
package com.marcnuri.demo.listtomap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * https://api.github.com/orgs/marcnuri-demo/repos
 * Created by Marc Nuri <marc@marcnuri.com> on 2018-03-22.
 */
public class GithubRepo {

//**************************************************************************************************
//  Fields
//**************************************************************************************************
	private String name;
	@JsonProperty("full_name")
	private String fullName;
	private String description;
	private Boolean fork;
	@JsonIgnore
	private Integer localVersion;

//**************************************************************************************************
//  Constructors
//**************************************************************************************************

//**************************************************************************************************
//  Abstract Methods
//**************************************************************************************************

//**************************************************************************************************
//  Overridden Methods
//**************************************************************************************************
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		GithubRepo that = (GithubRepo) o;

		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (fork != null ? !fork.equals(that.fork) : that.fork != null) return false;
		return localVersion != null ? localVersion.equals(that.localVersion) : that.localVersion == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (fork != null ? fork.hashCode() : 0);
		result = 31 * result + (localVersion != null ? localVersion.hashCode() : 0);
		return result;
	}


//**************************************************************************************************
//  Other Methods
//**************************************************************************************************

//**************************************************************************************************
//  Getter/Setter Methods
//**************************************************************************************************
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getFork() {
		return fork;
	}

	public void setFork(Boolean fork) {
		this.fork = fork;
	}

	public Integer getLocalVersion() {
		return localVersion;
	}

	public void setLocalVersion(Integer localVersion) {
		this.localVersion = localVersion;
	}

//**************************************************************************************************
//  Static Methods
//**************************************************************************************************

//**************************************************************************************************
//  Inner Classes
//**************************************************************************************************

}
