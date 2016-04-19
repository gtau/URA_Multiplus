package flow.subflow.AssuntosSenha;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 19 DE ABRIL DE 2016 10H10MIN38S BRT
 */
public class NovaSenhaResgate extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 19 DE ABRIL DE 2016 10H10MIN38S BRT
	 */
	public NovaSenhaResgate() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 19 DE ABRIL DE 2016 11H26MIN4S BRT
	 */
	protected String getSubflowName() {
		return("NovaSenhaResgate");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 19 DE ABRIL DE 2016 11H26MIN4S BRT
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("NovaSenhaResgate-Retorno", "AssuntosSenha-VerificaRetorno");
		exitPoints.put("NovaSenhaResgate-Desliga", "AssuntosSenha-Desliga");
		return exitPoints;
	}
}
