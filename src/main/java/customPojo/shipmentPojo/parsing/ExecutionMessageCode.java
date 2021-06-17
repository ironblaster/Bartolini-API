package customPojo.shipmentPojo.parsing;

public enum ExecutionMessageCode {
	
		ErroreGenerico(-1,"Errore generico"),

		ParametroNonValido(-5,"Parametro non valido"),

		LoginFallito (-7,"Login fallito"),
		
		ParamatroLoginMancante (-57,"Parametro mancante per il login"),
		
		CalcoloInstradamento (-63,"Errore in calcolo instradamento"),
		
		NumerazionePacco (-64,"Errore in numerazione pacco"),
		
		ErroreEtichetta (-65,"Errore in stampa etichetta"),
		
		ErroreUserAccount (-67,"Errore su User/Account, il codice impostato come senderCustomerCode deve essere collegato a codice cliente utilizzato per l'autenticazione"),
		
		DatoInconsistente (-68, "Dato inconsistente"),
		
		PudoIdInesistente (-69,"pudoId non valido o non esistente"),
		
		spedizioneNonConfermabile (-101,"Spedizione non confermabile"),
		
		spedizioneGiaConfermata (-102,"Spedizione Già confermata"),
		
		spedizioneMaiCreata (-151,"Spedizione mai creata oppure creata oltre 40 giorni prima"),
		
		spedizioneGiaPresa (-152,"Spedizione già presa in gestione dalla filiale"),
		
		spedizioneInElaborazione (-153,"Spedizione già in elaborazione, ritentare"),
		
		stessiRiferimenti (-154,"Sono state trovate più spedizioni con gli stessi riferimenti"),
		
		recordCancellazione (-155, "Record allocato in fase di cancellazione"),
		
		normalizzazione (4,"Normalizzazione CAP/Località/Procincia avvenuta"),
		
		indirizzodifferente (5,"Indirizzo del destinatario differente dall'indirizzo del pudo BRTfermopoint"),
		
		Ok(0,"Ok"),
	
		erroreNotFound (1812,"Codice Errore non appartentente a BRT");
	
	
		private String toString;
		private int code;
		
		private ExecutionMessageCode(int code,String significato) {
			this.toString=significato;
			this.code=code;
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
