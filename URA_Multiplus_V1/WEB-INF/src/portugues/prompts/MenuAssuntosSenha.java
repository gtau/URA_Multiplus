/**
 * Last generated by Orchestration Designer at: 18 DE ABRIL DE 2016 21H42MIN40S BRT
 */
package portugues.prompts;

public class MenuAssuntosSenha extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for MN_AssuntosSenha.
	 */
	public MenuAssuntosSenha() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 18 DE ABRIL DE 2016 21H48MIN6S BRT
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("MenuAssuntosSenha");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		if ( new com.avaya.sce.runtime.Condition( "condition", "Idioma", com.avaya.sce.runtime.Expression.STRING_EQUAL_IGNORE, "portugues", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11d",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11e",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11f",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11i",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PTVoltarMenuInicial",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PTSemDuvida",false));
		}

		if ( new com.avaya.sce.runtime.Condition( "condition", "Idioma", com.avaya.sce.runtime.Expression.STRING_EQUAL_IGNORE, "ingles", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ING11d",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ING11e",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ING11f",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ING11i",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:INGVoltarMenuInicial",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:INGSemDuvida",false));
		}

		if ( new com.avaya.sce.runtime.Condition( "condition", "Idioma", com.avaya.sce.runtime.Expression.STRING_EQUAL_IGNORE, "espanhol", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ESP11d",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ESP11e",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ESP11f",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ESP11i",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ESPVoltarMenuInicial",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:ESPSemDuvida",false));
		}

		else {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11d",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11e",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11f",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PT11i",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PTVoltarMenuInicial",false));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"FrasesMultiplus:PTSemDuvida",false));
		}

	}
}