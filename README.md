# Bartolini-API
Metodo per contattare le API Bartolini


Repository maven:



```
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

Dipendenza Maven:

```
<dependency>
    <groupId>com.github.ironblaster</groupId>
    <artifactId>Bartolini-API</artifactId>
    <version>0.0.1</version>
</dependency>
```


Semplice Jar che permette di contattare le api Bartolini tramite i metodi presenti nella classe SimpleMethod()

sistemi disponibili:

SimpleMethod.CancellaSpedizione(DeleteRequest);




SimpleMethod.ConfermaSpedizione(ConfirmRequest);





SimpleMethod.CreaSpedizione(CreateRequest);



SimpleMethod.GetDescrizioneEsito(String LINGUA_ISO639_ALPHA2,int codiceEsito);




SimpleMethod.GetDescrizioneEvento(String LINGUA_ISO639_ALPHA2,String code);



SimpleMethod.GetSpedIDbyIdCollo(BigDecimal CLIENTE_ID,String IDCollo);




SimpleMethod.GetSpedIDbyRMN(BigDecimal CLIENTE_ID,BigDecimal RIFERIMENTO_MITTENTE_NUMERICO);




SimpleMethod.GetSpedIDbyRMA(BigDecimal CLIENTE_ID,String RIFERIMENTO_MITTENTE_ALFABETICO);




SimpleMethod.GetTrackingbySpedID(String LINGUA_ISO639_ALPHA2,String SPEDIZIONE_ANNO,String SPEDIZIONE_BRT_ID);
