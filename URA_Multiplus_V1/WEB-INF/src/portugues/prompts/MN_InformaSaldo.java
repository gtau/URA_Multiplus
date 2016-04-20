/**
 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 17H31MIN23S BRT
 */
package portugues.prompts;

public class MN_InformaSaldo extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for MN_InformaSaldo.
	 */
	public MN_InformaSaldo() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 20 DE ABRIL DE 2016 17H37MIN14S BRT
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("MN_InformaSaldo");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		if ( new com.avaya.sce.runtime.Condition( "condition", "WSSaldoParticipante:Saldo", com.avaya.sce.runtime.Expression.IS_EMPTY, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:311h",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:31b",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:VoltarMenuInicial",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:FalarOp",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:SemDuvida",false));
		}

		else {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:311g1",false));
			format = new com.avaya.sce.runtime.Format();
			format.add("format","number");
			format.add("numbertype","integer");
			format.add("gender","Nf");
			format.add("Feminine Inflection","Nfn");
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"WSSaldoParticipante:Pontos",format,false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:311g2",false));
			format = new com.avaya.sce.runtime.Format();
			format.add("format","number");
			format.add("numbertype","integer");
			format.add("gender","Nf");
			format.add("Feminine Inflection","Nfn");
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"WSSaldoParticipante:PontosExp",format,false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:311g3",false));
			format = new com.avaya.sce.runtime.Format();
			format.add("format","date");
			format.add("datefmt","DMSPD");
			format.add("inflection","DMSPD");
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"WSSaldoParticipante:DataPontosExp",format,false));
		}

	}
}
