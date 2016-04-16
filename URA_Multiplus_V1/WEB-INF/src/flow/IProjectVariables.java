package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 15 DE ABRIL DE 2016 23H0MIN2S BRT
 */
public interface IProjectVariables {





	//{{START:PROJECT:VARIABLES
	/**
	 * This is a reserved block of variable name definitions.
	 * The variable names defined here can be used as the key
	 * to get the <code>com.avaya.sce.runtime.Variable</code>
	 * from the <code>SCESession</code> at runtime.<br>
	 * 
	 * For example, given a variable name <code>phoneNum</code>,
	 * user-defined code should access the variable in this format:<PRE>
	 *   Variable phNum = mySession.getVariable(IProjectVariables.PHONE_NUM);
	 *   if ( phNum != null ) {
	 *        // do something with the variable
	 *   }</PRE>
	 * 
	 * This block of code is generated automatically by Orchestration Designer and should not
	 * be manually edited as changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 16 DE ABRIL DE 2016 18H58MIN59S BRT
	 */
	public static final String DATE = "date";
	public static final String VDU = "vdu";
	public static final String CHANNEL = "Channel";
	public static final String UUI = "UUI";
	public static final String CTICALLINFO = "cticallinfo";
	public static final String VDN__TRANSF = "VDN_Transf";
	public static final String IDIOMA = "Idioma";
	public static final String CONTADOR_MENUS = "ContadorMenus";
	public static final String VDU__CACHE = "vdu_cache";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String WSSALDO_PARTICIPANTE = "WSSaldoParticipante";
	public static final String SESSION = "session";
	public static final String WSIDENTIFICAR_PARTICIPANTE = "WSIdentificarParticipante";
	public static final String VDN__DEFAULT = "VDN_Default";
	public static final String CHECK_RETORNO = "CheckRetorno";
	public static final String EVENTO = "Evento";
	public static final String AAMMDD = "AAMMDD";
	public static final String MENU_IDIOMAS = "MenuIdiomas";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String CALL__SITE = "Call_site";
	public static final String APLICACAO = "Aplicacao";
	public static final String MN__PRINCIPAL = "Mn_Principal";
	public static final String TIME = "time";
	public static final String COLETA_CPFNUM_MULTIPLUS = "ColetaCPFNumMultiplus";
	public static final String SHAREDUUI = "shareduui";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String VDU_FIELD_ID = "id";
	public static final String CHANNEL_FIELD_LENGHT = "Lenght";
	public static final String CHANNEL_FIELD_VALUE = "Value";
	public static final String CTICALLINFO_FIELD_ANI = "ani";
	public static final String CTICALLINFO_FIELD_CALLID = "callid";
	public static final String CTICALLINFO_FIELD_DNIS = "dnis";
	public static final String CTICALLINFO_FIELD_STATE = "state";
	public static final String CTICALLINFO_FIELD_STATIONEXTENSION = "stationextension";
	public static final String CTICALLINFO_FIELD_UCID = "ucid";
	public static final String CTICALLINFO_FIELD_UUI = "uui";
	public static final String VDU__CACHE_FIELD_ID = "id";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
	public static final String WSSALDO_PARTICIPANTE_FIELD_RETORNO = "Retorno";
	public static final String WSSALDO_PARTICIPANTE_FIELD_SALDO = "Saldo";
	public static final String SESSION_FIELD_AAI = "aai";
	public static final String SESSION_FIELD_ANI = "ani";
	public static final String SESSION_FIELD_CALLTAG = "calltag";
	public static final String SESSION_FIELD_CHANNEL = "channel";
	public static final String SESSION_FIELD_CHANNELTYPE = "channeltype";
	public static final String SESSION_FIELD_CONVERSEFIRST = "conversefirst";
	public static final String SESSION_FIELD_CONVERSESECOND = "conversesecond";
	public static final String SESSION_FIELD_CURRENTLANGUAGE = "currentlanguage";
	public static final String SESSION_FIELD_DNIS = "dnis";
	public static final String SESSION_FIELD_EXIT_CUSTOMER_ID = "exitCustomerId";
	public static final String SESSION_FIELD_EXIT_INFO_1 = "exitInfo1";
	public static final String SESSION_FIELD_EXIT_INFO_2 = "exitInfo2";
	public static final String SESSION_FIELD_EXIT_PREFERRED_PATH = "exitPreferredPath";
	public static final String SESSION_FIELD_EXIT_REASON = "exitReason";
	public static final String SESSION_FIELD_EXIT_TOPIC = "exitTopic";
	public static final String SESSION_FIELD_LASTERROR = "lasterror";
	public static final String SESSION_FIELD_MEDIATYPE = "mediatype";
	public static final String SESSION_FIELD_PROTOCOLNAME = "protocolname";
	public static final String SESSION_FIELD_PROTOCOLVERSION = "protocolversion";
	public static final String SESSION_FIELD_SESSIONID = "sessionid";
	public static final String SESSION_FIELD_SESSIONLABEL = "sessionlabel";
	public static final String SESSION_FIELD_SHAREDMODE = "sharedmode";
	public static final String SESSION_FIELD_UCID = "ucid";
	public static final String SESSION_FIELD_UUI = "uui";
	public static final String SESSION_FIELD_VIDEOBITRATE = "videobitrate";
	public static final String SESSION_FIELD_VIDEOCODEC = "videocodec";
	public static final String SESSION_FIELD_VIDEOENABLED = "videoenabled";
	public static final String SESSION_FIELD_VIDEOFARFMTP = "videofarfmtp";
	public static final String SESSION_FIELD_VIDEOFORMAT = "videoformat";
	public static final String SESSION_FIELD_VIDEOFPS = "videofps";
	public static final String SESSION_FIELD_VIDEOHEIGHT = "videoheight";
	public static final String SESSION_FIELD_VIDEONEARFMTP = "videonearfmtp";
	public static final String SESSION_FIELD_VIDEOWIDTH = "videowidth";
	public static final String SESSION_FIELD_VPCALLEDEXTENSION = "vpcalledextension";
	public static final String SESSION_FIELD_VPCONVERSEONDATA = "vpconverseondata";
	public static final String SESSION_FIELD_VPCOVERAGEREASON = "vpcoveragereason";
	public static final String SESSION_FIELD_VPCOVERAGETYPE = "vpcoveragetype";
	public static final String SESSION_FIELD_VPRDNIS = "vprdnis";
	public static final String SESSION_FIELD_VPREPORTURL = "vpreporturl";
	public static final String WSIDENTIFICAR_PARTICIPANTE_FIELD_ID_PARTICIPANTE = "IdParticipante";
	public static final String WSIDENTIFICAR_PARTICIPANTE_FIELD_RETORNO = "Retorno";
	public static final String EVENTO_FIELD_CALL__DATE = "call_date";
	public static final String EVENTO_FIELD_CALL__EVID = "call_evid";
	public static final String EVENTO_FIELD_CALL__SEQ = "call_seq";
	public static final String AAMMDD_FIELD_ANO = "ano";
	public static final String AAMMDD_FIELD_DIA = "dia";
	public static final String AAMMDD_FIELD_DIASEMANA = "diasemana";
	public static final String AAMMDD_FIELD_HORA = "hora";
	public static final String AAMMDD_FIELD_MES = "mes";
	public static final String AAMMDD_FIELD_MINUTO = "minuto";
	public static final String AAMMDD_FIELD_SEGUNDO = "segundo";
	public static final String MENU_IDIOMAS_FIELD_CONFIDENCE = "confidence";
	public static final String MENU_IDIOMAS_FIELD_INPUTMODE = "inputmode";
	public static final String MENU_IDIOMAS_FIELD_INTERPRETATION = "interpretation";
	public static final String MENU_IDIOMAS_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String MENU_IDIOMAS_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String MENU_IDIOMAS_FIELD_UTTERANCE = "utterance";
	public static final String MENU_IDIOMAS_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String APLICACAO_FIELD_CALL__ANI = "call_ani";
	public static final String APLICACAO_FIELD_CALL__APPID = "call_appid";
	public static final String APLICACAO_FIELD_CALL__DATE = "call_date";
	public static final String APLICACAO_FIELD_CALL__DNIS = "call_dnis";
	public static final String APLICACAO_FIELD_CALL__ID = "call_id";
	public static final String APLICACAO_FIELD_CALL__SITE = "call_site";
	public static final String APLICACAO_FIELD_CALL__UCID = "call_ucid";
	public static final String APLICACAO_FIELD_CALL__UUI = "call_uui";
	public static final String APLICACAO_FIELD_CALL__UUU = "call_UUU";
	public static final String MN__PRINCIPAL_FIELD_CONFIDENCE = "confidence";
	public static final String MN__PRINCIPAL_FIELD_INPUTMODE = "inputmode";
	public static final String MN__PRINCIPAL_FIELD_INTERPRETATION = "interpretation";
	public static final String MN__PRINCIPAL_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String MN__PRINCIPAL_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String MN__PRINCIPAL_FIELD_UTTERANCE = "utterance";
	public static final String MN__PRINCIPAL_FIELD_VALUE = "value";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String COLETA_CPFNUM_MULTIPLUS_FIELD_CONFIDENCE = "confidence";
	public static final String COLETA_CPFNUM_MULTIPLUS_FIELD_INPUTMODE = "inputmode";
	public static final String COLETA_CPFNUM_MULTIPLUS_FIELD_INTERPRETATION = "interpretation";
	public static final String COLETA_CPFNUM_MULTIPLUS_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String COLETA_CPFNUM_MULTIPLUS_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String COLETA_CPFNUM_MULTIPLUS_FIELD_UTTERANCE = "utterance";
	public static final String COLETA_CPFNUM_MULTIPLUS_FIELD_VALUE = "value";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
}
