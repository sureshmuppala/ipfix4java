package de.fhg.fokus.net.ipfix.model.ie;

import de.fhg.fokus.net.ipfix.api.IpfixFieldSpecifier;
import de.fhg.fokus.net.ipfix.api.IpfixIe;
import de.fhg.fokus.net.ipfix.api.IpfixIeSemantics;
import de.fhg.fokus.net.ipfix.api.IpfixIeStatus;
import de.fhg.fokus.net.ipfix.api.IpfixIeUnits;
import de.fhg.fokus.net.ipfix.api.codec.IpfixIeCodecUnsigned64;



/**
 * <pre>
observedFlowTotalCount:{ 
  elementId:163, 
  dataType:unsigned64, 
  dataTypeSemantis:totalCounter, 
  units:flows 
  status:current 
  en: 0 
}
</pre> 
 * 
 */
public final class IpfixIeObservedFlowTotalCount extends IpfixIeCodecUnsigned64 implements IpfixIe {
	// -- model --
	private final IpfixFieldSpecifier fieldSpecifier;

	@Override
	public IpfixFieldSpecifier getFieldSpecifier() {
		return fieldSpecifier;
	}

	public IpfixIeObservedFlowTotalCount() {
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(163)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeObservedFlowTotalCount( int length ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(163)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeObservedFlowTotalCount( int length, long enterpriseNumber, boolean isScope ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(enterpriseNumber).setId(163)
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
		return "observedFlowTotalCount";
	}

	@Override
	public int getLength() {
		return fieldSpecifier.getIeLength();
	}

	@Override
	public IpfixIeUnits getUnits() {
		return IpfixIeUnits.FLOWS;
	}
}
