package de.fhg.fokus.net.ipfix.model.ie;

import de.fhg.fokus.net.ipfix.api.IpfixFieldSpecifier;
import de.fhg.fokus.net.ipfix.api.IpfixIe;
import de.fhg.fokus.net.ipfix.api.IpfixIeSemantics;
import de.fhg.fokus.net.ipfix.api.IpfixIeStatus;
import de.fhg.fokus.net.ipfix.api.IpfixIeUnits;
import de.fhg.fokus.net.ipfix.api.codec.IpfixIeCodecUnsigned64;



/**
 * <pre>
tcpFinTotalCount:{ 
  elementId:219, 
  dataType:unsigned64, 
  dataTypeSemantis:totalCounter, 
  units:packets 
  status:current 
  en: 0 
}
</pre> 
 * 
 */
public final class IpfixIeTcpFinTotalCount extends IpfixIeCodecUnsigned64 implements IpfixIe {
	// -- model --
	private final IpfixFieldSpecifier fieldSpecifier;

	@Override
	public IpfixFieldSpecifier getFieldSpecifier() {
		return fieldSpecifier;
	}

	public IpfixIeTcpFinTotalCount() {
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(219)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeTcpFinTotalCount( int length ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(219)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeTcpFinTotalCount( int length, long enterpriseNumber, boolean isScope ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(enterpriseNumber).setId(219)
				.setFieldLength(this.fieldLength).setScope(isScope);
	}


	@Override
	public IpfixIeSemantics getSemantics() {
		return IpfixIeSemantics.TOTALCOUNTER;
	}

	@Override
	public IpfixIeStatus getStatus() {
		return IpfixIeStatus.CURRENT;
	}

	@Override
	public String getName() {
		return "tcpFinTotalCount";
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
