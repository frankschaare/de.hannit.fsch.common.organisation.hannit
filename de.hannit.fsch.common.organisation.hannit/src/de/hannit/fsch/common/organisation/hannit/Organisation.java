/**
 * 
 */
package de.hannit.fsch.common.organisation.hannit;

import java.util.Date;
import java.util.TreeMap;

import de.hannit.fsch.common.organisation.IOrganisation;
import de.hannit.fsch.common.organisation.reporting.Monatsbericht;

/**
 * @author fsch
 *
 */
public class Organisation implements IOrganisation
{
private final String name = "Hannoversche Informationstechnologien";
private TreeMap<Date, Monatsbericht> monatsBerichte = new TreeMap<Date, Monatsbericht>(); 

	/**
	 * 
	 */
	public Organisation(){}
	
	public TreeMap<Date, Monatsbericht> getMonatsBerichte()	{return monatsBerichte;}
	public void setMonatsBerichte(TreeMap<Date, Monatsbericht> monatsBerichte) {this.monatsBerichte = monatsBerichte;}

	/* (non-Javadoc)
	 * @see de.hannit.fsch.common.organisation.IOrganisation#getName()
	 */
	@Override
	public String getName() {return this.name;}
}
