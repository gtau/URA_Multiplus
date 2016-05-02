
/**
 * ErroTecnicoFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

package br.com.Multiplus;

public class ErroTecnicoFaultMsg extends java.lang.Exception{
    
    private br.com.Multiplus.GerarAtendimentov1Stub.ErroTecnicoFaultE faultMessage;

    
        public ErroTecnicoFaultMsg() {
            super("ErroTecnicoFaultMsg");
        }

        public ErroTecnicoFaultMsg(java.lang.String s) {
           super(s);
        }

        public ErroTecnicoFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ErroTecnicoFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.Multiplus.GerarAtendimentov1Stub.ErroTecnicoFaultE msg){
       faultMessage = msg;
    }
    
    public br.com.Multiplus.GerarAtendimentov1Stub.ErroTecnicoFaultE getFaultMessage(){
       return faultMessage;
    }
}
    