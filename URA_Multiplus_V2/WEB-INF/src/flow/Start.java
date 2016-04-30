package flow;

/**
 * This is a special reserved class that is repsonsible for loading application 
 * variables as well as the forward to the actual first form of the application.<br>
 * This class should not be manually edited as changes may be overridden by the 
 * code generator.<br>
 * Last generated by Orchestration Designer at: 2016-APR-29  09:36:25 PM
 */
public class Start extends com.avaya.sce.runtime.Entry {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:36:25 PM
	 */
	public Start() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically.  Any changes may be overwritten.
	 * Returns the submit object that will redirect application flow to the first
	 * form in the application.  This also adds various standard variables to the
	 * list of data to be submitted to the runtime variable table.
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:57:49 PM
	 * @return the Submit object that contains the standard variables and the first form
	 */
	public com.avaya.sce.runtime.Submit getSubmit(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Submit submit = new com.avaya.sce.runtime.Submit("Log_Inicio");
		return ( submit );
	}
	/**
	 * This method initializes the SCE session with the variables that
	 * are defined in the application.<BR>
	 * 
	 * This method is generated automatically and should not be manually
	 * edited because changes may be overwritten by future code 
	 * generation.
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:57:49 PM
	 */
	public void initializeVariables(com.avaya.sce.runtimecommon.SCESession session) {
		com.avaya.sce.runtimecommon.IVariable variable = null;
		String[] variableFields = null;

		variableFields = new String[] {
			IProjectVariables.MN_OUVIR_PROCEDIMENTOS_FIELD_CONFIDENCE,
			IProjectVariables.MN_OUVIR_PROCEDIMENTOS_FIELD_INPUTMODE,
			IProjectVariables.MN_OUVIR_PROCEDIMENTOS_FIELD_INTERPRETATION,
			IProjectVariables.MN_OUVIR_PROCEDIMENTOS_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_OUVIR_PROCEDIMENTOS_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_OUVIR_PROCEDIMENTOS_FIELD_UTTERANCE,
			IProjectVariables.MN_OUVIR_PROCEDIMENTOS_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_OUVIR_PROCEDIMENTOS, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSAUTENTICAR_USUARIO_FIELD_RETORNO,
			IProjectVariables.WSAUTENTICAR_USUARIO_FIELD_SENHA_DIGITADA,
			IProjectVariables.WSAUTENTICAR_USUARIO_FIELD_STATUS_USER };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSAUTENTICAR_USUARIO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.TIME_FIELD_AUDIO,
			IProjectVariables.TIME_FIELD_HOUR,
			IProjectVariables.TIME_FIELD_MILLISECOND,
			IProjectVariables.TIME_FIELD_MINUTE,
			IProjectVariables.TIME_FIELD_SECOND,
			IProjectVariables.TIME_FIELD_TIMEZONE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.TIME, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.CONTADOR_MENUS, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSENVIAR_EMAIL_PARTICIPANTE_FIELD_ID_RECIBO_ENTREGA,
			IProjectVariables.WSENVIAR_EMAIL_PARTICIPANTE_FIELD_RETORNO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSENVIAR_EMAIL_PARTICIPANTE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_RESGATE_PASSAGEM_FIELD_CONFIDENCE,
			IProjectVariables.MN_RESGATE_PASSAGEM_FIELD_INPUTMODE,
			IProjectVariables.MN_RESGATE_PASSAGEM_FIELD_INTERPRETATION,
			IProjectVariables.MN_RESGATE_PASSAGEM_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_RESGATE_PASSAGEM_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_RESGATE_PASSAGEM_FIELD_UTTERANCE,
			IProjectVariables.MN_RESGATE_PASSAGEM_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_RESGATE_PASSAGEM, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SHAREDUUI_COPY_FIELD_ID,
			IProjectVariables.SHAREDUUI_COPY_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SHAREDUUI_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DATE_FIELD_AUDIO,
			IProjectVariables.DATE_FIELD_DAYOFMONTH,
			IProjectVariables.DATE_FIELD_DAYOFWEEK,
			IProjectVariables.DATE_FIELD_DAYOFWEEKNUM,
			IProjectVariables.DATE_FIELD_DAYOFYEAR,
			IProjectVariables.DATE_FIELD_MONTH,
			IProjectVariables.DATE_FIELD_MONTHINYEAR,
			IProjectVariables.DATE_FIELD_YEAR };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DATE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_PROCEDIMENTOS_EMAIL_FIELD_CONFIDENCE,
			IProjectVariables.MN_PROCEDIMENTOS_EMAIL_FIELD_INPUTMODE,
			IProjectVariables.MN_PROCEDIMENTOS_EMAIL_FIELD_INTERPRETATION,
			IProjectVariables.MN_PROCEDIMENTOS_EMAIL_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_PROCEDIMENTOS_EMAIL_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_PROCEDIMENTOS_EMAIL_FIELD_UTTERANCE,
			IProjectVariables.MN_PROCEDIMENTOS_EMAIL_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_PROCEDIMENTOS_EMAIL, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.TRANSFERE_HUMANO_FIELD_ANI,
			IProjectVariables.TRANSFERE_HUMANO_FIELD_CALLID,
			IProjectVariables.TRANSFERE_HUMANO_FIELD_DNIS,
			IProjectVariables.TRANSFERE_HUMANO_FIELD_STATE,
			IProjectVariables.TRANSFERE_HUMANO_FIELD_STATIONEXTENSION,
			IProjectVariables.TRANSFERE_HUMANO_FIELD_UCID,
			IProjectVariables.TRANSFERE_HUMANO_FIELD_UUI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.TRANSFERE_HUMANO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.CTICALLINFO_FIELD_ANI,
			IProjectVariables.CTICALLINFO_FIELD_CALLID,
			IProjectVariables.CTICALLINFO_FIELD_DNIS,
			IProjectVariables.CTICALLINFO_FIELD_STATE,
			IProjectVariables.CTICALLINFO_FIELD_STATIONEXTENSION,
			IProjectVariables.CTICALLINFO_FIELD_UCID,
			IProjectVariables.CTICALLINFO_FIELD_UUI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.CTICALLINFO, variableFields, null, session, false, true );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSGERAR_ATENDIMENTO_FIELD_NUM_PROTOCOLO,
			IProjectVariables.WSGERAR_ATENDIMENTO_FIELD_RETORNO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSGERAR_ATENDIMENTO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DD_LAST_EXCEPTION_COPY_FIELD_ERRORCODE,
			IProjectVariables.DD_LAST_EXCEPTION_COPY_FIELD_MESSAGE,
			IProjectVariables.DD_LAST_EXCEPTION_COPY_FIELD_OBJECT,
			IProjectVariables.DD_LAST_EXCEPTION_COPY_FIELD_STACKTRACE,
			IProjectVariables.DD_LAST_EXCEPTION_COPY_FIELD_TYPE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DD_LAST_EXCEPTION_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSCONSULTAR_PARTICIPANTE_FIELD_ID_PARTICIPANTE,
			IProjectVariables.WSCONSULTAR_PARTICIPANTE_FIELD_RETORNO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSCONSULTAR_PARTICIPANTE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.FAROL, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSSOLICITAR_EXTRATO_PARTICIPANTE_FIELD_ID_RECIBO_ENTREGA,
			IProjectVariables.WSSOLICITAR_EXTRATO_PARTICIPANTE_FIELD_RETORNO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSSOLICITAR_EXTRATO_PARTICIPANTE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_PONTOS_FIELD_CONFIDENCE,
			IProjectVariables.MN_PONTOS_FIELD_INPUTMODE,
			IProjectVariables.MN_PONTOS_FIELD_INTERPRETATION,
			IProjectVariables.MN_PONTOS_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_PONTOS_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_PONTOS_FIELD_UTTERANCE,
			IProjectVariables.MN_PONTOS_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_PONTOS, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.EVENTO_FIELD_CALL_DATE,
			IProjectVariables.EVENTO_FIELD_CALL_EVID,
			IProjectVariables.EVENTO_FIELD_CALL_SEQ };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.EVENTO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.CHECK_RETORNO, "", null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.CALL_SITE, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SHAREDUUI_FIELD_ID,
			IProjectVariables.SHAREDUUI_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SHAREDUUI, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_RESGATES_TAM_FIELD_CONFIDENCE,
			IProjectVariables.MN_RESGATES_TAM_FIELD_INPUTMODE,
			IProjectVariables.MN_RESGATES_TAM_FIELD_INTERPRETATION,
			IProjectVariables.MN_RESGATES_TAM_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_RESGATES_TAM_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_RESGATES_TAM_FIELD_UTTERANCE,
			IProjectVariables.MN_RESGATES_TAM_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_RESGATES_TAM, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.CONTADOR_COLETA, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.TIME_COPY_FIELD_AUDIO,
			IProjectVariables.TIME_COPY_FIELD_HOUR,
			IProjectVariables.TIME_COPY_FIELD_MILLISECOND,
			IProjectVariables.TIME_COPY_FIELD_MINUTE,
			IProjectVariables.TIME_COPY_FIELD_SECOND,
			IProjectVariables.TIME_COPY_FIELD_TIMEZONE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.TIME_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.CHANNEL_FIELD_LENGHT,
			IProjectVariables.CHANNEL_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.CHANNEL, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_INFORMACOES_SENHA_FIELD_CONFIDENCE,
			IProjectVariables.MN_INFORMACOES_SENHA_FIELD_INPUTMODE,
			IProjectVariables.MN_INFORMACOES_SENHA_FIELD_INTERPRETATION,
			IProjectVariables.MN_INFORMACOES_SENHA_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_INFORMACOES_SENHA_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_INFORMACOES_SENHA_FIELD_UTTERANCE,
			IProjectVariables.MN_INFORMACOES_SENHA_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_INFORMACOES_SENHA, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_CODIGO_AUT_TAM_FIELD_CONFIDENCE,
			IProjectVariables.MN_CODIGO_AUT_TAM_FIELD_INPUTMODE,
			IProjectVariables.MN_CODIGO_AUT_TAM_FIELD_INTERPRETATION,
			IProjectVariables.MN_CODIGO_AUT_TAM_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_CODIGO_AUT_TAM_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_CODIGO_AUT_TAM_FIELD_UTTERANCE,
			IProjectVariables.MN_CODIGO_AUT_TAM_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_CODIGO_AUT_TAM, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REDIRECTINFO_FIELD_PRESENTATIONINFO,
			IProjectVariables.REDIRECTINFO_FIELD_REASON,
			IProjectVariables.REDIRECTINFO_FIELD_SCREENINGINFO,
			IProjectVariables.REDIRECTINFO_FIELD_URI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REDIRECTINFO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SESSION_COPY_FIELD_AAI,
			IProjectVariables.SESSION_COPY_FIELD_ANI,
			IProjectVariables.SESSION_COPY_FIELD_CALLTAG,
			IProjectVariables.SESSION_COPY_FIELD_CHANNEL,
			IProjectVariables.SESSION_COPY_FIELD_CHANNELTYPE,
			IProjectVariables.SESSION_COPY_FIELD_CONVERSEFIRST,
			IProjectVariables.SESSION_COPY_FIELD_CONVERSESECOND,
			IProjectVariables.SESSION_COPY_FIELD_CURRENTLANGUAGE,
			IProjectVariables.SESSION_COPY_FIELD_DNIS,
			IProjectVariables.SESSION_COPY_FIELD_EXIT_CUSTOMER_ID,
			IProjectVariables.SESSION_COPY_FIELD_EXIT_INFO_1,
			IProjectVariables.SESSION_COPY_FIELD_EXIT_INFO_2,
			IProjectVariables.SESSION_COPY_FIELD_EXIT_PREFERRED_PATH,
			IProjectVariables.SESSION_COPY_FIELD_EXIT_REASON,
			IProjectVariables.SESSION_COPY_FIELD_EXIT_TOPIC,
			IProjectVariables.SESSION_COPY_FIELD_LASTERROR,
			IProjectVariables.SESSION_COPY_FIELD_MEDIATYPE,
			IProjectVariables.SESSION_COPY_FIELD_PROTOCOLNAME,
			IProjectVariables.SESSION_COPY_FIELD_PROTOCOLVERSION,
			IProjectVariables.SESSION_COPY_FIELD_SESSIONID,
			IProjectVariables.SESSION_COPY_FIELD_SESSIONLABEL,
			IProjectVariables.SESSION_COPY_FIELD_SHAREDMODE,
			IProjectVariables.SESSION_COPY_FIELD_UCID,
			IProjectVariables.SESSION_COPY_FIELD_UUI,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOBITRATE,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOCODEC,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOENABLED,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOFARFMTP,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOFORMAT,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOFPS,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOHEIGHT,
			IProjectVariables.SESSION_COPY_FIELD_VIDEONEARFMTP,
			IProjectVariables.SESSION_COPY_FIELD_VIDEOWIDTH,
			IProjectVariables.SESSION_COPY_FIELD_VPCALLEDEXTENSION,
			IProjectVariables.SESSION_COPY_FIELD_VPCONVERSEONDATA,
			IProjectVariables.SESSION_COPY_FIELD_VPCOVERAGEREASON,
			IProjectVariables.SESSION_COPY_FIELD_VPCOVERAGETYPE,
			IProjectVariables.SESSION_COPY_FIELD_VPRDNIS,
			IProjectVariables.SESSION_COPY_FIELD_VPREPORTURL };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SESSION_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SESSION_FIELD_AAI,
			IProjectVariables.SESSION_FIELD_ANI,
			IProjectVariables.SESSION_FIELD_CALLTAG,
			IProjectVariables.SESSION_FIELD_CHANNEL,
			IProjectVariables.SESSION_FIELD_CONVERSEFIRST,
			IProjectVariables.SESSION_FIELD_CONVERSESECOND,
			IProjectVariables.SESSION_FIELD_CURRENTLANGUAGE,
			IProjectVariables.SESSION_FIELD_DNIS,
			IProjectVariables.SESSION_FIELD_EXIT_CUSTOMER_ID,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_1,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_2,
			IProjectVariables.SESSION_FIELD_EXIT_PREFERRED_PATH,
			IProjectVariables.SESSION_FIELD_EXIT_REASON,
			IProjectVariables.SESSION_FIELD_EXIT_TOPIC,
			IProjectVariables.SESSION_FIELD_LASTERROR,
			IProjectVariables.SESSION_FIELD_MEDIATYPE,
			IProjectVariables.SESSION_FIELD_MESSAGE_TYPE,
			IProjectVariables.SESSION_FIELD_PROTOCOLNAME,
			IProjectVariables.SESSION_FIELD_PROTOCOLVERSION,
			IProjectVariables.SESSION_FIELD_SESSIONID,
			IProjectVariables.SESSION_FIELD_SESSIONLABEL,
			IProjectVariables.SESSION_FIELD_SHAREDMODE,
			IProjectVariables.SESSION_FIELD_UCID,
			IProjectVariables.SESSION_FIELD_UUI,
			IProjectVariables.SESSION_FIELD_VIDEOBITRATE,
			IProjectVariables.SESSION_FIELD_VIDEOCODEC,
			IProjectVariables.SESSION_FIELD_VIDEOENABLED,
			IProjectVariables.SESSION_FIELD_VIDEOFARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOFORMAT,
			IProjectVariables.SESSION_FIELD_VIDEOFPS,
			IProjectVariables.SESSION_FIELD_VIDEOHEIGHT,
			IProjectVariables.SESSION_FIELD_VIDEONEARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOWIDTH,
			IProjectVariables.SESSION_FIELD_VPCALLEDEXTENSION,
			IProjectVariables.SESSION_FIELD_VPCONVERSEONDATA,
			IProjectVariables.SESSION_FIELD_VPCOVERAGEREASON,
			IProjectVariables.SESSION_FIELD_VPCOVERAGETYPE,
			IProjectVariables.SESSION_FIELD_VPRDNIS,
			IProjectVariables.SESSION_FIELD_VPREPORTURL };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SESSION, variableFields, null, session, false, true );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_EXTRATO_EMAIL_FIELD_CONFIDENCE,
			IProjectVariables.MN_EXTRATO_EMAIL_FIELD_INPUTMODE,
			IProjectVariables.MN_EXTRATO_EMAIL_FIELD_INTERPRETATION,
			IProjectVariables.MN_EXTRATO_EMAIL_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_EXTRATO_EMAIL_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_EXTRATO_EMAIL_FIELD_UTTERANCE,
			IProjectVariables.MN_EXTRATO_EMAIL_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_EXTRATO_EMAIL, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.VDN_FIELD_ALTERACAO_CADASTRAL,
			IProjectVariables.VDN_FIELD_ATUALIZACAO_CADASTRAL,
			IProjectVariables.VDN_FIELD_ESPANHOL,
			IProjectVariables.VDN_FIELD_INGLES,
			IProjectVariables.VDN_FIELD_NAO_PRIORITARIO,
			IProjectVariables.VDN_FIELD_PRIORITARIO,
			IProjectVariables.VDN_FIELD_TAM,
			IProjectVariables.VDN_FIELD_TAM_4_1_1A,
			IProjectVariables.VDN_FIELD_TAM_4_1_1B,
			IProjectVariables.VDN_FIELD_TAMESPANHOL,
			IProjectVariables.VDN_FIELD_TAMINGLES,
			IProjectVariables.VDN_FIELD_TAMVIAGENS };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.VDN, variableFields, "com.avaya.vp.admin.variables.runtime.AdminVariableFactory", session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MENU_IDIOMAS_FIELD_CONFIDENCE,
			IProjectVariables.MENU_IDIOMAS_FIELD_INPUTMODE,
			IProjectVariables.MENU_IDIOMAS_FIELD_INTERPRETATION,
			IProjectVariables.MENU_IDIOMAS_FIELD_NOINPUTCOUNT,
			IProjectVariables.MENU_IDIOMAS_FIELD_NOMATCHCOUNT,
			IProjectVariables.MENU_IDIOMAS_FIELD_UTTERANCE,
			IProjectVariables.MENU_IDIOMAS_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MENU_IDIOMAS, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSREDEFINIR_SENHA_USUARIO_FIELD_ID_RECIBO_ENTREGA,
			IProjectVariables.WSREDEFINIR_SENHA_USUARIO_FIELD_RETORNO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSREDEFINIR_SENHA_USUARIO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_ASSUNTOS_SENHA_FIELD_CONFIDENCE,
			IProjectVariables.MN_ASSUNTOS_SENHA_FIELD_INPUTMODE,
			IProjectVariables.MN_ASSUNTOS_SENHA_FIELD_INTERPRETATION,
			IProjectVariables.MN_ASSUNTOS_SENHA_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_ASSUNTOS_SENHA_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_ASSUNTOS_SENHA_FIELD_UTTERANCE,
			IProjectVariables.MN_ASSUNTOS_SENHA_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_ASSUNTOS_SENHA, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REDIRECTINFO_COPY_FIELD_PRESENTATIONINFO,
			IProjectVariables.REDIRECTINFO_COPY_FIELD_REASON,
			IProjectVariables.REDIRECTINFO_COPY_FIELD_SCREENINGINFO,
			IProjectVariables.REDIRECTINFO_COPY_FIELD_URI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REDIRECTINFO_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.IDIOMA, "", null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.VDNTRANSF, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_NOVA_SENHA_RESGATE_FIELD_CONFIDENCE,
			IProjectVariables.MN_NOVA_SENHA_RESGATE_FIELD_INPUTMODE,
			IProjectVariables.MN_NOVA_SENHA_RESGATE_FIELD_INTERPRETATION,
			IProjectVariables.MN_NOVA_SENHA_RESGATE_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_NOVA_SENHA_RESGATE_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_NOVA_SENHA_RESGATE_FIELD_UTTERANCE,
			IProjectVariables.MN_NOVA_SENHA_RESGATE_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_NOVA_SENHA_RESGATE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_INFORMA_SALDO_FIELD_CONFIDENCE,
			IProjectVariables.MN_INFORMA_SALDO_FIELD_INPUTMODE,
			IProjectVariables.MN_INFORMA_SALDO_FIELD_INTERPRETATION,
			IProjectVariables.MN_INFORMA_SALDO_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_INFORMA_SALDO_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_INFORMA_SALDO_FIELD_UTTERANCE,
			IProjectVariables.MN_INFORMA_SALDO_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_INFORMA_SALDO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MENU_ATUALIZACAO_CADASTRAL_FIELD_CONFIDENCE,
			IProjectVariables.MENU_ATUALIZACAO_CADASTRAL_FIELD_INPUTMODE,
			IProjectVariables.MENU_ATUALIZACAO_CADASTRAL_FIELD_INTERPRETATION,
			IProjectVariables.MENU_ATUALIZACAO_CADASTRAL_FIELD_NOINPUTCOUNT,
			IProjectVariables.MENU_ATUALIZACAO_CADASTRAL_FIELD_NOMATCHCOUNT,
			IProjectVariables.MENU_ATUALIZACAO_CADASTRAL_FIELD_UTTERANCE,
			IProjectVariables.MENU_ATUALIZACAO_CADASTRAL_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MENU_ATUALIZACAO_CADASTRAL, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_EXTRATO_ENVIADO_FIELD_CONFIDENCE,
			IProjectVariables.MN_EXTRATO_ENVIADO_FIELD_INPUTMODE,
			IProjectVariables.MN_EXTRATO_ENVIADO_FIELD_INTERPRETATION,
			IProjectVariables.MN_EXTRATO_ENVIADO_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_EXTRATO_ENVIADO_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_EXTRATO_ENVIADO_FIELD_UTTERANCE,
			IProjectVariables.MN_EXTRATO_ENVIADO_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_EXTRATO_ENVIADO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSVERIFICAR_PERMISSAO_ALTERACAO_CADASTRAL_FIELD_IDENTIFICADOR,
			IProjectVariables.WSVERIFICAR_PERMISSAO_ALTERACAO_CADASTRAL_FIELD_RETORNO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSVERIFICAR_PERMISSAO_ALTERACAO_CADASTRAL, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.AAMMDD_FIELD_ANO,
			IProjectVariables.AAMMDD_FIELD_DIA,
			IProjectVariables.AAMMDD_FIELD_DIASEMANA,
			IProjectVariables.AAMMDD_FIELD_HORA,
			IProjectVariables.AAMMDD_FIELD_MES,
			IProjectVariables.AAMMDD_FIELD_MINUTO,
			IProjectVariables.AAMMDD_FIELD_SEGUNDO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.AAMMDD, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.UUI, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_ERRORCODE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_MESSAGE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_OBJECT,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_STACKTRACE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_TYPE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DD_LAST_EXCEPTION, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSIDENTIFICAR_PARTICIPANTE_FIELD_CPFNUM_MULTIPLUS,
			IProjectVariables.WSIDENTIFICAR_PARTICIPANTE_FIELD_ID_PARTICIPANTE,
			IProjectVariables.WSIDENTIFICAR_PARTICIPANTE_FIELD_NOME,
			IProjectVariables.WSIDENTIFICAR_PARTICIPANTE_FIELD_RETORNO,
			IProjectVariables.WSIDENTIFICAR_PARTICIPANTE_FIELD_SOBRENOME };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSIDENTIFICAR_PARTICIPANTE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.CONTADOR_VOLTAS_MENU, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_ANO,
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_DATA_PONTOS_EXP,
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_DIA,
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_MES,
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_PONTOS,
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_PONTOS_EXP,
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_RETORNO,
			IProjectVariables.WSSALDO_PARTICIPANTE_FIELD_SALDO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.WSSALDO_PARTICIPANTE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_NOVA_SENHA_ACESSO_FIELD_CONFIDENCE,
			IProjectVariables.MN_NOVA_SENHA_ACESSO_FIELD_INPUTMODE,
			IProjectVariables.MN_NOVA_SENHA_ACESSO_FIELD_INTERPRETATION,
			IProjectVariables.MN_NOVA_SENHA_ACESSO_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_NOVA_SENHA_ACESSO_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_NOVA_SENHA_ACESSO_FIELD_UTTERANCE,
			IProjectVariables.MN_NOVA_SENHA_ACESSO_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_NOVA_SENHA_ACESSO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_INFO_MULTIPLUS_FIELD_CONFIDENCE,
			IProjectVariables.MN_INFO_MULTIPLUS_FIELD_INPUTMODE,
			IProjectVariables.MN_INFO_MULTIPLUS_FIELD_INTERPRETATION,
			IProjectVariables.MN_INFO_MULTIPLUS_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_INFO_MULTIPLUS_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_INFO_MULTIPLUS_FIELD_UTTERANCE,
			IProjectVariables.MN_INFO_MULTIPLUS_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_INFO_MULTIPLUS, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.COLETA_SENHA_RESGATE_FIELD_CONFIDENCE,
			IProjectVariables.COLETA_SENHA_RESGATE_FIELD_INPUTMODE,
			IProjectVariables.COLETA_SENHA_RESGATE_FIELD_INTERPRETATION,
			IProjectVariables.COLETA_SENHA_RESGATE_FIELD_NOINPUTCOUNT,
			IProjectVariables.COLETA_SENHA_RESGATE_FIELD_NOMATCHCOUNT,
			IProjectVariables.COLETA_SENHA_RESGATE_FIELD_UTTERANCE,
			IProjectVariables.COLETA_SENHA_RESGATE_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.COLETA_SENHA_RESGATE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.APLICACAO_FIELD_CALL_ANI,
			IProjectVariables.APLICACAO_FIELD_CALL_APPID,
			IProjectVariables.APLICACAO_FIELD_CALL_DATE,
			IProjectVariables.APLICACAO_FIELD_CALL_DNIS,
			IProjectVariables.APLICACAO_FIELD_CALL_ID,
			IProjectVariables.APLICACAO_FIELD_CALL_SITE,
			IProjectVariables.APLICACAO_FIELD_CALL_UCID,
			IProjectVariables.APLICACAO_FIELD_CALL_UUI,
			IProjectVariables.APLICACAO_FIELD_CALL_UUU };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.APLICACAO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MN_PRINCIPAL_FIELD_CONFIDENCE,
			IProjectVariables.MN_PRINCIPAL_FIELD_INPUTMODE,
			IProjectVariables.MN_PRINCIPAL_FIELD_INTERPRETATION,
			IProjectVariables.MN_PRINCIPAL_FIELD_NOINPUTCOUNT,
			IProjectVariables.MN_PRINCIPAL_FIELD_NOMATCHCOUNT,
			IProjectVariables.MN_PRINCIPAL_FIELD_UTTERANCE,
			IProjectVariables.MN_PRINCIPAL_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MN_PRINCIPAL, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.UUILENGTH, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DATE_COPY_FIELD_AUDIO,
			IProjectVariables.DATE_COPY_FIELD_DAYOFMONTH,
			IProjectVariables.DATE_COPY_FIELD_DAYOFWEEK,
			IProjectVariables.DATE_COPY_FIELD_DAYOFWEEKNUM,
			IProjectVariables.DATE_COPY_FIELD_DAYOFYEAR,
			IProjectVariables.DATE_COPY_FIELD_MONTH,
			IProjectVariables.DATE_COPY_FIELD_MONTHINYEAR,
			IProjectVariables.DATE_COPY_FIELD_YEAR };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DATE_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.COLETA_CPFNUM_MULTIPLUS_FIELD_CONFIDENCE,
			IProjectVariables.COLETA_CPFNUM_MULTIPLUS_FIELD_INPUTMODE,
			IProjectVariables.COLETA_CPFNUM_MULTIPLUS_FIELD_INTERPRETATION,
			IProjectVariables.COLETA_CPFNUM_MULTIPLUS_FIELD_NOINPUTCOUNT,
			IProjectVariables.COLETA_CPFNUM_MULTIPLUS_FIELD_NOMATCHCOUNT,
			IProjectVariables.COLETA_CPFNUM_MULTIPLUS_FIELD_UTTERANCE,
			IProjectVariables.COLETA_CPFNUM_MULTIPLUS_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.COLETA_CPFNUM_MULTIPLUS, variableFields, null, session, false, false );
		session.putVariable(variable);
	}
	/**
	 * This method returns the name of the application.
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:57:49 PM
	 */
	public String getEntryName() {
		return("URA_Multiplus_V2");
	}
	/**
	 * This method returns a list of life cycle classes for Pluggable Connectors.
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:57:49 PM
	 */
	public java.util.Collection getPluggableLifeCycle() {
		java.util.ArrayList result = new java.util.ArrayList();
		result.add("com.avaya.sce.runtime.connectivity.cti.pdc.CTIConnectorInit");
		result.add("com.avaya.vp.admin.variables.runtime.Initializer");
		return(result);
	}
	/**
	 * This method returns the root document for the application.
	 * This method is generated automatically and should not be modified
	 * because changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:57:49 PM
	 */
	public String getRootDoc() {
		return("AppRoot");
	}
	/**
	 * Builds the list of input parameters that are defined for this application 
	 * entry.  This list is built automatically by adding Input Parameter
	 * nodes to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>java.lang.String</code> objects that
	 * are the names of parameters the application is expecting.
	 * If the AppRoot node does not have any input parameters, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:57:49 PM
	 */
	public java.util.Collection getInputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
	/**
	 * Builds the list of capture expression that are defined for this application 
	 * entry.  This list is built automatically by adding Capture Expression
	 * items to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>CaptureExpression</code> objects that
	 * specify the ECMA script expression and the Orchestration Designer 
	 * session variable that will store the captured result.
	 * If the AppRoot node does not have any capture expression items, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2016-APR-29  09:57:49 PM
	 */
	public java.util.Collection getCaptureExpressions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
}