package de.fhg.fokus.net.ipfix.model.ie;

import de.fhg.fokus.net.ipfix.api.IpfixFieldSpecifier;
import de.fhg.fokus.net.ipfix.api.IpfixIe;
import de.fhg.fokus.net.ipfix.api.IpfixIeSemantics;
import de.fhg.fokus.net.ipfix.api.IpfixIeStatus;
import de.fhg.fokus.net.ipfix.api.IpfixIeUnits;
import de.fhg.fokus.net.ipfix.api.codec.IpfixIeCodecIpv6Address;



/**
 * <pre>
mplsTopLabelIPv6Address:{ 
  elementId:140, 
  dataType:ipv6Address, 
  dataTypeSemantis:identifier, 
  units:null 
  status:current 
  en: 0 
}
</pre> 
 * 
 */
public final class IpfixIeMplsTopLabelIPv6Address extends IpfixIeCodecIpv6Address implements IpfixIe {
	// -- model --
	private final IpfixFieldSpecifier fieldSpecifier;

	@Override
	public IpfixFieldSpecifier getFieldSpecifier() {
		return fieldSpecifier;
	}

	public IpfixIeMplsTopLabelIPv6Address() {
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(140)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeMplsTopLabelIPv6Address( int length ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(140)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeMplsTopLabelIPv6Address( int length, long enterpriseNumber, boolean isScope ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(enterpriseNumber).setId(140)
				.setFieldLength(this.fieldLength).setScope(isScope);
	}


	@Override
	public IpfixIeSemantics getSemantics() {
		return IpfixIeSemantics.IDENTIFIER;
	}

	@Override
	public IpfixIeStatus getStatus() {
		return IpfixIeStatus.CURRENT;
	}

	@Override
	public String getName() {
		return "mplsTopLabelIPv6Address";
	}

	@Override
	public int getLength() {
		return fieldSpecifier.getIeLength();
	}

	@Override
	public IpfixIeUnits getUnits() {
		return IpfixIeUnits.NONE;
	}
}
