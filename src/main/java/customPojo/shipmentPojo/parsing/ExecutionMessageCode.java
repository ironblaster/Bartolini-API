/*******************************************************************************
 * Copyright 2021  Ironblaster
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package customPojo.shipmentPojo.parsing;

public enum ExecutionMessageCode {
	
		ErroreGenerico(-1,"Errore generico",Severity.ERROR),

		ParametroNonValido(-5,"Parametro non valido",Severity.ERROR),

		LoginFallito (-7,"Login fallito",Severity.ERROR),
		
		ParamatroLoginMancante (-57,"Parametro mancante per il login",Severity.ERROR),
		
		CalcoloInstradamento (-63,"Errore in calcolo instradamento",Severity.ERROR),
		
		NumerazionePacco (-64,"Errore in numerazione pacco",Severity.ERROR),
		
		ErroreEtichetta (-65,"Errore in stampa etichetta",Severity.ERROR),
		
		ErroreUserAccount (-67,"Errore su User/Account, il codice impostato come senderCustomerCode deve essere collegato a codice cliente utilizzato per l'autenticazione",Severity.ERROR),
		
		DatoInconsistente (-68, "Dato inconsistente",Severity.ERROR),
		
		PudoIdInesistente (-69,"pudoId non valido o non esistente",Severity.ERROR),
		
		spedizioneNonConfermabile (-101,"Spedizione non confermabile",Severity.ERROR),
		
		spedizioneGiaConfermata (-102,"Spedizione Già confermata",Severity.ERROR),
		
		spedizioneMaiCreata (-151,"Spedizione mai creata oppure creata oltre 40 giorni prima",Severity.ERROR),
		
		spedizioneGiaPresa (-152,"Spedizione già presa in gestione dalla filiale",Severity.ERROR),
		
		spedizioneInElaborazione (-153,"Spedizione già in elaborazione, ritentare",Severity.ERROR),
		
		stessiRiferimenti (-154,"Sono state trovate più spedizioni con gli stessi riferimenti",Severity.ERROR),
		
		recordCancellazione (-155, "Record allocato in fase di cancellazione",Severity.ERROR),
		
		normalizzazione (4,"Normalizzazione CAP/Località/Procincia avvenuta",Severity.WARNING),
		
		indirizzodifferente (5,"Indirizzo del destinatario differente dall'indirizzo del pudo BRTfermopoint",Severity.WARNING),
		
		Ok(0,"Ok",Severity.INFO),
	
		erroreNotFound (-1812,"Codice Errore non appartentente a BRT",Severity.ERROR);
	
	
		private String toString;
		private int code;
		Severity severity;
		
		private ExecutionMessageCode(int code,String significato,Severity serverity) {
			this.toString=significato;
			this.code=code;
			this.severity = serverity;
		}
		@Override
		public String toString() {
			return toString;
		}
		
		public int getCode() {
			return code;
		}
		
		
		
		
		public static ExecutionMessageCode getError(int code) {
			for (ExecutionMessageCode c : ExecutionMessageCode.values()) 
				if(c.getCode()==code)
					return c;
			
			return ExecutionMessageCode.erroreNotFound;
			
		}
		
	

}
