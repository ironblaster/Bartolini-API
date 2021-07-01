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
/**
 * EasySpedDEWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.bartolini.easysped.ws;

public interface EasySpedDEWS extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Bartolini_EasySped_DAL.DestinationAddressOut calculateBRTSort(org.datacontract.schemas._2004._07.Bartolini_EasySped_DAL.DestinationAddress address) throws java.rmi.RemoteException;
    public java.lang.String getLabelForZebraPrinter(org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrint[] labels, java.lang.Integer x, java.lang.Integer y) throws java.rmi.RemoteException;
    public byte[] getLabelPDF(org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrint[] labels, java.lang.Boolean dialogToPrint, java.lang.Integer fakeLabels, org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.PrinterManagerPDFLabelFormat pdfLabelFormat, java.lang.Float marginLeft, java.lang.Float marginRight, java.lang.Float marginTop, java.lang.Float marginBottom, java.lang.Boolean rotate180) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Bartolini_EasySped_ws.EasySpedFault;
    public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException;
}
