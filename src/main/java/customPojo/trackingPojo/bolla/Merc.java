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

public class Merc implements Serializable{
	
	int colli;
	String naturaMerce;
	float pesoKG;
	float volumeM3;
	
	
	public int getColli() {
		return colli;
	}
	public void setColli(int colli) {
		this.colli = colli;
	}
	public String getNaturaMerce() {
		return naturaMerce;
	}
	public void setNaturaMerce(String naturaMerce) {
		this.naturaMerce = naturaMerce;
	}
	public float getPesoKG() {
		return pesoKG;
	}
	public void setPesoKG(float pesoKG) {
		this.pesoKG = pesoKG;
	}
	public float getVolumeM3() {
		return volumeM3;
	}
	public void setVolumeM3(float volumeM3) {
		this.volumeM3 = volumeM3;
	}
	
	

}
