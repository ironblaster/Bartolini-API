package customPojo.shipmentPojo.common;

import java.io.Serializable;

/*Elenco codici di errore:

-1 = Errore generico
-5 = Parametro non valido
-7 = Login fallito
-57 = Parametro mancante per il login
-63 = Errore in calcolo instradamento
-64 = Errore in numerazione pacco
-65 = Errore in stampa etichetta
-67 = Errore su User/Account, il codice impostato come senderCostomerCode deve essere collegato a codice cliente utilizzato per l'autenticazione (account.userId)
-68 = Dato inconsistente
-69 = pudoId non valido o non esistente
-101 = Spedizione non confermabile
-102 = Spedizione già confermata
-151 = Spedizione mai creata oppure creata oltre 40 giorni prima
-152 = Spedizione già in presa in gestione dalla filiale
-153 = Spedizione in elaborazione, ritentare
-154 = Sono state trovate più spedizioni con gli stessi riferimenti
-155 = Record allocato in fase di cancellazione


Elenco codici di warning

4 = Normalizzazione CAP/Località/Provincia avvenuta
5 = Indirizzo del destinatario differente dall'indirizzo del pudo BRTfermopoint
	
code : integer
Codice esito richiesta.

I messaggi sono codificati con questa logica: 

code>0 esito postivo, viene comunque segnalato un warning
code=0 esito positivo
code<0 esito negativo
 da -1 a -60 sono errori comuni a tutti i metodi.

da -61 a -99 sono errori dedicati alla scrittura spedizione

da -100 a -160 sono errori dedicati alla conferma / cancellazione di una spedizione.

	
severity : string
Vale:

WARNING

ERROR

INFO

	
codeDesc : string
Descrizione del messaggio
	
message : string
Dettaglio del messaggio.*/

public class ExecutionMessage implements Serializable{
	
	/**
	 * I messaggi sono codificati con questa logica: 

		code>0 esito postivo, viene comunque segnalato un warning
		code=0 esito positivo
		code<0 esito negativo
 		da -1 a -60 sono errori comuni a tutti i metodi.

		da -61 a -99 sono errori dedicati alla scrittura spedizione

		da -100 a -160 sono errori dedicati alla conferma / cancellazione di una spedizione.
	 */
	int code;
	/**
	 * Vale:

		WARNING

		ERROR

		INFO
	 */
	String severity;
	String codeDesc;
	String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getCodeDesc() {
		return codeDesc;
	}
	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "ExecutionMessage [code=" + code + ", severity=" + severity + ", codeDesc=" + codeDesc + ", message="
				+ message + "]";
	}
	
	
	
	
	
	
	

}
