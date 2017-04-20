```
wrk -ssendTransfer.lua -t12 -c40 -d30s http://localhost:8080/service/send
```
```
curl -i -X POST   -H "Content-Type:application/json"   -d'{"amount":"100","title":"ldi2017", "accountingDate":1491664090, "payeeAccount":"PL19116095884689260483003902", "beneficiaryName":"Bartlomiej Młynarczyk", "beneficiaryAccount":"PL80114059918954093015605127"}' 'http://localhost:8080/service/send'
```