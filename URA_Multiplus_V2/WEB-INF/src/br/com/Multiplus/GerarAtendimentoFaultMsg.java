
/**
 * GerarAtendimentoFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

package br.com.Multiplus;

public class GerarAtendimentoFaultMsg extends java.lang.Exception{
    
    private br.com.Multiplus.GerarAtendimentov1Stub.GerarAtendimentoFaultE faultMessage;

    
        public GerarAtendimentoFaultMsg() {
            super("GerarAtendimentoFaultMsg");
        }

        public GerarAtendimentoFaultMsg(java.lang.String s) {
           super(s);
        }

        public GerarAtendimentoFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GerarAtendimentoFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.Multiplus.GerarAtendimentov1Stub.GerarAtendimentoFaultE msg){
       faultMessage = msg;
    }
    
    public br.com.Multiplus.GerarAtendimentov1Stub.GerarAtendimentoFaultE getFaultMessage(){
       return faultMessage;
    }
}
    