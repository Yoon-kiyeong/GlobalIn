package com.globalin.ioc.injection;

import java.util.Map;

public class CollectionBean {
	
//	private List<String> addressList;
//
//	public List<String> getAddressList() {
//		return addressList;
//	}
//
//	public void setAddressList(List<String> addressList) {
//		this.addressList = addressList;
//	}
	
//	private Set<String> addressList;
//
//	public Set<String> getAddressList() {
//		return addressList;
//	}
//
//	public void setAddressList(Set<String> addressList) {
//		this.addressList = addressList;
//	}
	
	private Map<String, String>addressList;

	public Map<String, String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}
	
}
