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
package customPojo;

import java.io.Serializable;

public class Spedid_idCollo implements Serializable {
		private int esito;
	    private short annoSpedizione;
	    private long IDSpedizione;
	    private int versione;
		public int getEsito() {
			return esito;
		}
		public void setEsito(int esito) {
			this.esito = esito;
		}
		public short getAnnoSpedizione() {
			return annoSpedizione;
		}
		public void setAnnoSpedizione(short annoSpedizione) {
			this.annoSpedizione = annoSpedizione;
		}
		public long getiDSpedizione() {
			return IDSpedizione;
		}
		public void setIDSpedizione(long IDSpedizione) {
			this.IDSpedizione = IDSpedizione;
		}
		public int getVersione() {
			return versione;
		}
		public void setVersione(int versione) {
			this.versione = versione;
		}

}
