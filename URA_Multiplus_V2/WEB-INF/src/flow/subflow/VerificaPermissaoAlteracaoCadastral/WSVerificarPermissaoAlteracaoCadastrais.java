package flow.subflow.VerificaPermissaoAlteracaoCadastral;

import br.com.multiplus.VerificarPermissaoAlteracao;
import br.com.multiplus.output.VerificarPermissaoAlteracaoResponse;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 30 DE ABRIL DE 2016 10H21MIN25S BRT
 */
public class WSVerificarPermissaoAlteracaoCadastrais extends com.avaya.sce.runtime.BasicServlet {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 30 DE ABRIL DE 2016 10H21MIN25S BRT
	 */
	public WSVerificarPermissaoAlteracaoCadastrais() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method allows for custom integration with other Java components.
	 * You may use Java for sophisticated logic or to integrate with custom
	 * connectors (i.e. JMS, custom web services, sockets, XML, JAXB, etc.)
	 *
	 * Any custom code added here should work as efficiently as possible to prevent delays.
	 * It's important to design your callflow so that the voice browser (Voice Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 30 DE ABRIL DE 2016 10H21MIN25S BRT
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		String numeroMultiplus = mySession.getVariable("WSIdentificarParticipante").getComplexVariable().getField("numeroMultiplus").getStringValue();
		String endpoint = mySession.getVariable("EndPoints").getComplexVariable().getField("VerificarPermissaoAlteracaoCadastral").getStringValue();
		String certificado = mySession.getVariable("CertificadoTransacoes").getSimpleVariable().getStringValue();
		
		VerificarPermissaoAlteracao api = new VerificarPermissaoAlteracao();
		VerificarPermissaoAlteracaoResponse response = null;
		try {
			response = api.apiExecute(numeroMultiplus, endpoint, certificado);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if(response.getCodRet().equals("0")){
			//ok
			mySession.getVariable("WSVerificarPermissaoAlteracaoCadastral").getComplexVariable().getField("Retorno").setValue(response.getCodRet());
			mySession.getVariable("WSVerificarPermissaoAlteracaoCadastral").getComplexVariable().getField("PermissaoAlteracao").setValue(response.getPermissaoAlteracao());
			
		} else {
			//erro
			mySession.getVariable("WSVerificarPermissaoAlteracaoCadastral").getComplexVariable().getField("Retorno").setValue(response.getCodRet());
			mySession.getVariable("WSVerificarPermissaoAlteracaoCadastral").getComplexVariable().getField("Mensagem").setValue(response.getMensagem());
			mySession.getVariable("WSVerificarPermissaoAlteracaoCadastral").getComplexVariable().getField("Erro").setValue(response.getInstrucao());
			mySession.getVariable("WSVerificarPermissaoAlteracaoCadastral").getComplexVariable().getField("Detalhe").setValue(response.getDetalhe());
		}

	}
	/**
	 * Builds the list of branches that are defined for this servlet object.
	 * This list is built automatically by defining Goto nodes in the call flow editor.
	 * It is the programmer's responsibilty to provide at least one enabled Goto.<BR>
	 *
	 * The user should override updateBranches() to determine which Goto that the
	 * framework will activate.  If there is not at least one enabled Goto item, 
	 * the framework will throw a runtime exception.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of branches for the flow item, override:
	 *     <code>updateBranches(Collection branches, SCESession mySession)</code>
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Goto</code>
	 * objects that will be evaluated at runtime.  If there are no gotos
	 * defined in the Servlet node, then this returns null.
	 * Last generated by Orchestration Designer at: 2 DE MAIO DE 2016 10H46MIN25S BRT
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("VerificaPermissaoAlteracaoCadastral-TrataVerificarPermissaoAlteracaoCadastral", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
