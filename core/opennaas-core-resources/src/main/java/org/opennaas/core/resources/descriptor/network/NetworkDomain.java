package org.opennaas.core.resources.descriptor.network;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;

@Entity
public class NetworkDomain {

	@Id
	@GeneratedValue
	private long	id;

	@Basic
	String			name;

	@ElementCollection
	List<DeviceId>	hasDevices;

	@XmlElement(name = "name", namespace = "http://www.science.uva.nl/research/sne/ndl#")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "hasDevice", namespace = "http://www.science.uva.nl/research/sne/ndl/domain#")
	public List<DeviceId> getHasDevices() {
		return hasDevices;
	}

	public void setHasDevices(List<DeviceId> hasDevices) {
		this.hasDevices = hasDevices;
	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", hasDevices=" + hasDevices
				+ "]";
	}
}
