package com.labcorp.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"createdAt",
"employee_firstname",
"employee_lastname",
"employee_phonenumbe",
"ademployee_emaildress",
"citemployee_addressy",
"stateemployee_dev_level",
"employee_gender",
"employee_hire_date",
"employee_onleave",
"tech_stack",
"project",
"id"
})
@Generated("jsonschema2pojo")
public class User {

@JsonProperty("createdAt")
private Long createdAt;
@JsonProperty("employee_firstname")
private String employeeFirstname;
@JsonProperty("employee_lastname")
private String employeeLastname;
@JsonProperty("employee_phonenumbe")
private String employeePhonenumbe;
@JsonProperty("ademployee_emaildress")
private String ademployeeEmaildress;
@JsonProperty("citemployee_addressy")
private String citemployeeAddressy;
@JsonProperty("stateemployee_dev_level")
private String stateemployeeDevLevel;
@JsonProperty("employee_gender")
private String employeeGender;
@JsonProperty("employee_hire_date")
private String employeeHireDate;
@JsonProperty("employee_onleave")
private Boolean employeeOnleave;
@JsonProperty("tech_stack")
private List<Object> techStack = null;
@JsonProperty("project")
private List<Object> project = null;
@JsonProperty("id")
private String id;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("createdAt")
public Long getCreatedAt() {
return createdAt;
}

@JsonProperty("createdAt")
public void setCreatedAt(Long createdAt) {
this.createdAt = createdAt;
}

@JsonProperty("employee_firstname")
public String getEmployeeFirstname() {
return employeeFirstname;
}

@JsonProperty("employee_firstname")
public void setEmployeeFirstname(String employeeFirstname) {
this.employeeFirstname = employeeFirstname;
}

@JsonProperty("employee_lastname")
public String getEmployeeLastname() {
return employeeLastname;
}

@JsonProperty("employee_lastname")
public void setEmployeeLastname(String employeeLastname) {
this.employeeLastname = employeeLastname;
}

@JsonProperty("employee_phonenumbe")
public String getEmployeePhonenumbe() {
return employeePhonenumbe;
}

@JsonProperty("employee_phonenumbe")
public void setEmployeePhonenumbe(String employeePhonenumbe) {
this.employeePhonenumbe = employeePhonenumbe;
}

@JsonProperty("ademployee_emaildress")
public String getAdemployeeEmaildress() {
return ademployeeEmaildress;
}

@JsonProperty("ademployee_emaildress")
public void setAdemployeeEmaildress(String ademployeeEmaildress) {
this.ademployeeEmaildress = ademployeeEmaildress;
}

@JsonProperty("citemployee_addressy")
public String getCitemployeeAddressy() {
return citemployeeAddressy;
}

@JsonProperty("citemployee_addressy")
public void setCitemployeeAddressy(String citemployeeAddressy) {
this.citemployeeAddressy = citemployeeAddressy;
}

@JsonProperty("stateemployee_dev_level")
public String getStateemployeeDevLevel() {
return stateemployeeDevLevel;
}

@JsonProperty("stateemployee_dev_level")
public void setStateemployeeDevLevel(String stateemployeeDevLevel) {
this.stateemployeeDevLevel = stateemployeeDevLevel;
}

@JsonProperty("employee_gender")
public String getEmployeeGender() {
return employeeGender;
}

@JsonProperty("employee_gender")
public void setEmployeeGender(String employeeGender) {
this.employeeGender = employeeGender;
}

@JsonProperty("employee_hire_date")
public String getEmployeeHireDate() {
return employeeHireDate;
}

@JsonProperty("employee_hire_date")
public void setEmployeeHireDate(String employeeHireDate) {
this.employeeHireDate = employeeHireDate;
}

@JsonProperty("employee_onleave")
public Boolean getEmployeeOnleave() {
return employeeOnleave;
}

@JsonProperty("employee_onleave")
public void setEmployeeOnleave(Boolean employeeOnleave) {
this.employeeOnleave = employeeOnleave;
}

@JsonProperty("tech_stack")
public List<Object> getTechStack() {
return techStack;
}

@JsonProperty("tech_stack")
public void setTechStack(List<Object> techStack) {
this.techStack = techStack;
}

@JsonProperty("project")
public List<Object> getProject() {
return project;
}

@JsonProperty("project")
public void setProject(List<Object> project) {
this.project = project;
}

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}