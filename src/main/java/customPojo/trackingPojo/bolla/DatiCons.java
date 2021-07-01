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
package customPojo.trackingPojo.bolla;

import java.io.Serializable;

public class DatiCons implements Serializable{
	
	String dataConsegnaMerce;
	String dataConsegnaRichiesta;
	String dataTeoricaConsegna;
	String descrizioneConsegnaRichiesta;
	String firmatarioConsegna;
	String oraConsegnaMerce;
	String oraConsegnaRichiesta;
	String oraTeoricaConsegna_A;
	String oraTeoricaConsegna_DA;
	String tipoConsegnaRichiesta;
	public String getDataConsegnaMerce() {
		return dataConsegnaMerce;
	}
	public void setDataConsegnaMerce(String dataConsegnaMerce) {
		this.dataConsegnaMerce = dataConsegnaMerce;
	}
	public String getDataConsegnaRichiesta() {
		return dataConsegnaRichiesta;
	}
	public void setDataConsegnaRichiesta(String dataConsegnaRichiesta) {
		this.dataConsegnaRichiesta = dataConsegnaRichiesta;
	}
	public String getDataTeoricaConsegna() {
		return dataTeoricaConsegna;
	}
	public void setDataTeoricaConsegna(String dataTeoricaConsegna) {
		this.dataTeoricaConsegna = dataTeoricaConsegna;
	}
	public String getDescrizioneConsegnaRichiesta() {
		return descrizioneConsegnaRichiesta;
	}
	public void setDescrizioneConsegnaRichiesta(String descrizioneConsegnaRichiesta) {
		this.descrizioneConsegnaRichiesta = descrizioneConsegnaRichiesta;
	}
	public String getFirmatarioConsegna() {
		return firmatarioConsegna;
	}
	public void setFirmatarioConsegna(String firmatarioConsegna) {
		this.firmatarioConsegna = firmatarioConsegna;
	}
	public String getOraConsegnaMerce() {
		return oraConsegnaMerce;
	}
	public void setOraConsegnaMerce(String oraConsegnaMerce) {
		this.oraConsegnaMerce = oraConsegnaMerce;
	}
	public String getOraConsegnaRichiesta() {
		return oraConsegnaRichiesta;
	}
	public void setOraConsegnaRichiesta(String oraConsegnaRichiesta) {
		this.oraConsegnaRichiesta = oraConsegnaRichiesta;
	}
	public String getOraTeoricaConsegna_A() {
		return oraTeoricaConsegna_A;
	}
	public void setOraTeoricaConsegna_A(String oraTeoricaConsegna_A) {
		this.oraTeoricaConsegna_A = oraTeoricaConsegna_A;
	}
	public String getOraTeoricaConsegna_DA() {
		return oraTeoricaConsegna_DA;
	}
	public void setOraTeoricaConsegna_DA(String oraTeoricaConsegna_DA) {
		this.oraTeoricaConsegna_DA = oraTeoricaConsegna_DA;
	}
	public String getTipoConsegnaRichiesta() {
		return tipoConsegnaRichiesta;
	}
	public void setTipoConsegnaRichiesta(String tipoConsegnaRichiesta) {
		this.tipoConsegnaRichiesta = tipoConsegnaRichiesta;
	}

}
