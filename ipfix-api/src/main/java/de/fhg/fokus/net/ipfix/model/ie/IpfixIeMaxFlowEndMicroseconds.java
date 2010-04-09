package de.fhg.fokus.net.ipfix.model.ie;

import de.fhg.fokus.net.ipfix.api.IpfixFieldSpecifier;
import de.fhg.fokus.net.ipfix.api.IpfixIe;
import de.fhg.fokus.net.ipfix.api.IpfixIeSemantics;
import de.fhg.fokus.net.ipfix.api.IpfixIeStatus;
import de.fhg.fokus.net.ipfix.api.IpfixIeUnits;
import de.fhg.fokus.net.ipfix.api.codec.IpfixIeCodecDateTimeMicroseconds;



/**
 * <pre>
maxFlowEndMicroseconds:{ 
  elementId:268, 
  dataType:dateTimeMicroseconds, 
  dataTypeSemantis:null, 
  units:microseconds 
  status:current 
  en: 0 
}
</pre> 
 * 
 */
public final class IpfixIeMaxFlowEndMicroseconds extends IpfixIeCodecDateTimeMicroseconds implements IpfixIe {
	// -- model --
	private final IpfixFieldSpecifier fieldSpecifier;

	@Override
	public IpfixFieldSpecifier getFieldSpecifier() {
		return fieldSpecifier;
	}

	public IpfixIeMaxFlowEndMicroseconds() {
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(268)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeMaxFlowEndMicroseconds( int length ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(268)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeMaxFlowEndMicroseconds( int length, long enterpriseNumber, boolean isScope ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(enterpriseNumber).setId(268)
				.setFieldLength(this.fieldLength).setScope(isScope);
	}


	@Override
	public IpfixIeSemantics getSemantics() {
		return IpfixIeSemantics.DEFAULT;
	}

	@Override
	public IpfixIeStatus getStatus() {
		return IpfixIeStatus.CURRENT;
	}

	@Override
	public String getName() {
		return "maxFlowEndMicroseconds";
	}

	@Override
	public int getLength() {
		return fieldSpecifier.getIeLength();
	}

	@Override
	public IpfixIeUnits getUnits() {
		return IpfixIeUnits.MICROSECONDS;
	}
}
