package net.i2cat.mantychore.model.opticalSwitch.dwdm;

import net.i2cat.mantychore.model.FCPort;
import net.i2cat.mantychore.model.opticalSwitch.DWDMChannel;

public class WDMFCPort extends FCPort {

	private DWDMChannel	channel;

	public DWDMChannel getDWDMChannel() {
		return channel;
	}

	public void setDWDMChannel(DWDMChannel channel) {
		this.channel = channel;
	}

	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((channel == null) ? 0 : channel.hashCode());
	// return result;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	//
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// WDMFCPort other = (WDMFCPort) obj;
	// if (channel == null) {
	// if (other.channel != null)
	// return false;
	// } else if (!channel.equals(other.channel))
	// return false;
	// return true;
	// }

}
