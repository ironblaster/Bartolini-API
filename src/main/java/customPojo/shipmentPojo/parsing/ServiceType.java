package customPojo.shipmentPojo.parsing;

public enum ServiceType {
	
		ServizioStandard("","Servizio Standard"),

		ServizioPriority("E","Servizio Priority"),

		ServizioMattina ("H","Servizio 10:30");
	
	
		private String toString;
		private String code;
		
		private ServiceType(String code,String significato) {
			this.toString=significato;
			this.code=code;
		}
		@Override
		public String toString() {
			return toString;
		}
		
		public String getCode() {
			return code;
		}
		
		
		
		public static ServiceType getService(String code) {
			if(code.isEmpty())
				return ServiceType.ServizioStandard;
			for (ServiceType c : ServiceType.values()) 
				if(c.getCode().equals(code))
					return c;
			
			return ServiceType.ServizioStandard;
			
		}
		
	

}
