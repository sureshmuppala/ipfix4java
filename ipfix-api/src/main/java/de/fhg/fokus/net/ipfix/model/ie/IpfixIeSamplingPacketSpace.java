package de.fhg.fokus.net.ipfix.model.ie;

import de.fhg.fokus.net.ipfix.api.IpfixFieldSpecifier;
import de.fhg.fokus.net.ipfix.api.IpfixIe;
import de.fhg.fokus.net.ipfix.api.IpfixIeSemantics;
import de.fhg.fokus.net.ipfix.api.IpfixIeStatus;
import de.fhg.fokus.net.ipfix.api.IpfixIeUnits;
import de.fhg.fokus.net.ipfix.api.codec.IpfixIeCodecUnsigned32;



/**
 * <pre>
samplingPacketSpace:{ 
  elementId:306, 
  dataType:unsigned32, 
  dataTypeSemantis:quantity, 
  units:packets 
  status:current 
  en: 0 
}
</pre> 
 * 
 */
public final class IpfixIeSamplingPacketSpace extends IpfixIeCodecUnsigned32 implements IpfixIe {
	// -- model --
	private final IpfixFieldSpecifier fieldSpecifier;

	@Override
	public IpfixFieldSpecifier getFieldSpecifier() {
		return fieldSpecifier;
	}

	public IpfixIeSamplingPacketSpace() {
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(306)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeSamplingPacketSpace( int length ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(306)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeSamplingPacketSpace( int length, long enterpriseNumber, boolean isScope ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(enterpriseNumber).setId(306)
				.setFieldLength(this.fieldLength).setScope(isScope);
	}


	@Override
	public IpfixIeSemantics getSemantics() {
		return IpfixIeSemantics.QUANTITY;
	}

	@Override
	public IpfixIeStatus getStatus() {
		return IpfixIeStatus.CURRENT;
	}

	@Override
	public String getName() {
		return "samplingPacketSpace";
	}

	@Override
	public int getLength() {
		return fieldSpecifier.getIeLength();
	}

	@Override
	public IpfixIeUnits getUnits() {
		return IpfixIeUnits.PACKETS;
	}
}
